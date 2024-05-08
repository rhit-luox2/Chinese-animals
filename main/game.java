package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.HashMap;


public class Game {

    private JFrame gameFrame;
    protected JPanel trackPanel;
    private JLabel player1Label, player2Label;
    private String player1, player2;

    private JButton startButton;
    private ImageIcon player1Icon, player2Icon;
    private int scorePlayer1 = 0, scorePlayer2 = 0;

    private boolean gameStarted = false;
    private final int winScore = 40;

    private Timer timer = new Timer(2000, null);
    private Timer oneSecTimer;
    private int counter;

    private HashMap<JLabel, Integer> mpcRacers;
    private HashMap<JLabel, Integer> mpcScores;


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Game()::launchGame);
    }

    private void launchGame() {
        gameFrame = new JFrame("Zodiac Race Game");
        gameFrame.setSize(600, 900);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setLocationRelativeTo(null);
        JPanel gamePanel = setupGamePanel();
        gameFrame.add(gamePanel);
        gameFrame.setVisible(true);
        selectZodiacForPlayers();
    }

    private JPanel setupGamePanel() {
        JPanel gamePanel = new JPanel(new BorderLayout());
        gamePanel.setBackground(new Color(233, 197, 105));
        trackPanel = new JPanel(null);
        trackPanel.setPreferredSize(new Dimension(600, 800));
        gamePanel.add(trackPanel, BorderLayout.CENTER);

        JPanel infoPanel = new JPanel(new GridLayout(1, 3));
        player1Label = new JLabel("Player 1", JLabel.CENTER);
        player2Label = new JLabel("Player 2", JLabel.CENTER);
        styleLabel(player1Label);
        styleLabel(player2Label);
        infoPanel.add(player1Label);

        startButton = new JButton("Start Race");
        styleButton(startButton, new Color(233, 197, 105));
        startButton.addActionListener(e -> startGame());
        infoPanel.add(startButton);
        infoPanel.add(player2Label);
        gamePanel.add(infoPanel, BorderLayout.SOUTH);

        return gamePanel;
    }

    private void selectZodiacForPlayers() {
        ArrayList<String> animals = new ArrayList<String>(Arrays.asList( "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Horse", "Snake", "Goat", "Monkey", "Rooster",
                "Dog", "Pig" ));
        HashMap<ImageIcon, String> player1Pair = selectZodiac("Player 1, choose your zodiac", animals);
        HashMap<ImageIcon, String> player2Pair = selectZodiac("Player 2, choose your zodiac", animals);
        player1Icon = (ImageIcon)(player1Pair.keySet().toArray()[0]);
        player1Label.setIcon(new ImageIcon(player1Icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        player2Icon = (ImageIcon)(player2Pair.keySet().toArray()[0]);
        player2Label.setIcon(new ImageIcon(player2Icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));

        player1 = (String)(player1Pair.values().toArray()[0]);
        player2 = (String)(player2Pair.values().toArray()[0]);
        animals.remove(player1);
        animals.remove(player2);
        if (!animals.remove(player2)){
            animals.remove(0);
        }

        mpcRacers = new HashMap<JLabel, Integer>();
        mpcScores = new HashMap<JLabel, Integer>();
        for (int i = 0; i < animals.size(); i++){
            int speed = 2 + (int)Math.round(Math.random() * 3);
            // I choose 2 as a minimul to reach the score in the time limit of 20 seconds
            // and then at a maximum of 5 to reach score within 8 seconds. 
            ImageIcon icon = new ImageIcon("picture/" + animals.get(i) + ".PNG");
            JLabel otherLabel = new JLabel();
            otherLabel.setIcon(new ImageIcon(icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
            mpcRacers.put(otherLabel, speed);
            mpcScores.put(otherLabel,0);

        }
      
        
        
    }

    private HashMap<ImageIcon, String> selectZodiac(String title, ArrayList<String> animals) {

        JDialog dialog = new JDialog(gameFrame, title, true);
        dialog.setLayout(new GridLayout(0, 3));
        dialog.setSize(600, 600);
        dialog.setLocationRelativeTo(gameFrame);
        ImageIcon[] icons = new ImageIcon[animals.size()];
        AtomicReference<ImageIcon> selectedIcon = new AtomicReference<>();
        AtomicReference<String> selectedName = new AtomicReference<>();
        for (int i = 0; i < animals.size(); i++) {
            ImageIcon icon = new ImageIcon("picture/" + animals.get(i) + ".PNG");
            icons[i] = new ImageIcon(icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
            final int index = i;
            JButton button = new JButton(icons[i]);
            button.addActionListener(e -> {
                selectedIcon.set(icons[index]);
                selectedName.set(animals.get(index));
                dialog.dispose();
            });
            dialog.add(button);
        }
        dialog.setVisible(true);
        HashMap<ImageIcon,String> myMap = new HashMap<>();
        myMap.put(selectedIcon.get(), selectedName.get());
        return myMap;
    }

    private void startGame() {
        scorePlayer1 = 0;
        scorePlayer2 = 0;
        timer.start();
        
        setupTrack();
        gameStarted = true;
        setupKeyListener();
    }

    private void setupKeyListener() {
        gameFrame.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (!gameStarted)
                    return;
                if (e.getKeyChar() == '1') {
                    scorePlayer1++;
                    moveIcon(player1Label, scorePlayer1);
                } else if (e.getKeyChar() == '0') {
                    scorePlayer2++;
                    moveIcon(player2Label, scorePlayer2);
                }
                checkForWinner();
            }
        });
        gameFrame.setFocusable(true);
        gameFrame.requestFocusInWindow();
        startButton.setEnabled(false);

        counter = 0;
        oneSecTimer = new Timer(1000, new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                counter += 1;
                for (JLabel labels: mpcRacers.keySet()){
                    int newScore = mpcRacers.get(labels) + mpcScores.get(labels);
                    mpcScores.replace(labels, newScore);
                    moveIcon(labels, newScore);
                    System.out.println(newScore);
                }
                if (counter < 20) {
                    oneSecTimer.restart();
                    System.out.println("heheehheheeh" + counter);
                }
                checkForWinner();

             }

        });
        oneSecTimer.start();

    }

    private void moveIcon(JLabel label, int score) {
        int position = (int) ((trackPanel.getHeight() - 50) * ((double) score / winScore));
        label.setLocation(label.getX(), trackPanel.getHeight() - position - label.getHeight());
    }

    private void setupTrack() {
        player1Label.setBounds(20, trackPanel.getHeight() - 50, 50, 50);
        player2Label.setBounds(75, trackPanel.getHeight() - 50, 50, 50);
        trackPanel.add(player1Label);
        trackPanel.add(player2Label);
        int xpos = 130;
        for (JLabel labelToAdd : mpcRacers.keySet()){
            trackPanel.add(labelToAdd);
            labelToAdd.setLocation(xpos, trackPanel.getHeight() - 50);
            xpos += 55;
            
        }
        trackPanel.revalidate();
        trackPanel.repaint();
    }

    private void checkForWinner() {
        if (scorePlayer1 >= winScore || scorePlayer2 >= winScore) {
            endGame();
            timer.stop();
            oneSecTimer.stop();
        }
        for (int score : mpcScores.values()) {
            if (score >= winScore){
                timer.stop();
                oneSecTimer.stop();
                endGame();
            }
        }
    }

    private void endGame() {
        gameStarted = false;
        String winnerText = "Computer Wins";
        if (scorePlayer1 >= winScore){
            winnerText = "Player 1 wins!";
        }
        else if (scorePlayer2 >= winScore){
            winnerText = "Player 2 wins!";
        }        
        JOptionPane.showMessageDialog(gameFrame, winnerText, "Game Over", JOptionPane.INFORMATION_MESSAGE);
        resetGame();
    }

    private void resetGame() {
        player1Label.setLocation(20, trackPanel.getHeight() - 50);
        player2Label.setLocation(75, trackPanel.getHeight() - 50);
        int xpos = 130;
        for (JLabel label : mpcRacers.keySet()){
            mpcScores.replace(label, 0);
            label.setLocation(xpos, trackPanel.getHeight() - 50);
            xpos += 55;
        }
        scorePlayer1 = 0;
        scorePlayer2 = 0;

        startButton.setEnabled(true);
        gameFrame.removeKeyListener(gameFrame.getKeyListeners()[0]);
    }

    private void styleLabel(JLabel label) {
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setOpaque(false);
    }

    private void styleButton(JButton button, Color backgroundColor) {
        button.setFont(new Font("Arial", Font.BOLD, 18));
        button.setBackground(backgroundColor);
        button.setOpaque(true);
        button.setBorderPainted(false);
    }
}
