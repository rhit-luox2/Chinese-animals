package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;



public class Game{

    private JFrame gameFrame;
    protected JPanel trackPanel;
    private JPanel gamePanel;
    private JLabel bgLabel;
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

    private ArrayList<Player> players;

    Language myLanguage;

    public Game(Language myLanguage){
        this.myLanguage = myLanguage;
    }

    public static void main(Language myLanguage) {
        SwingUtilities.invokeLater(new Game(myLanguage)::launchGame);
    }

    private void launchGame() {
        gameFrame = new JFrame("Zodiac Race Game");
        gameFrame.setSize(700, 900);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setLocationRelativeTo(null);
        JPanel gamePanel = setupGamePanel();
        gameFrame.add(gamePanel);
        gameFrame.setVisible(true);
        selectZodiacForPlayers();
    }

    private JPanel setupGamePanel() {
        gamePanel = new JPanel(new BorderLayout());
        gamePanel.setBackground(new Color(233, 197, 105));
        trackPanel = new JPanel(null);
        trackPanel.setPreferredSize(new Dimension(700, 800));
        ImageIcon icon = new ImageIcon("picture/squaredDog.jpg");
        bgLabel = new JLabel();
        bgLabel.setIcon(new ImageIcon(icon.getImage().getScaledInstance(700, 800, Image.SCALE_SMOOTH)));
        bgLabel.setBounds(0, 0, 700, 800);
        gamePanel.add(bgLabel);

        gamePanel.add(trackPanel, BorderLayout.CENTER);

        JPanel infoPanel = new JPanel(new GridLayout(1, 3));
        String player1Gametext = myLanguage.getplayer1Game();
        String player2Gametext = myLanguage.getplayer2Game();
        player1Label = new JLabel(player1Gametext, JLabel.CENTER);
        player2Label = new JLabel(player2Gametext, JLabel.CENTER);
        styleLabel(player1Label);
        styleLabel(player2Label);
        infoPanel.add(player1Label);

        String startRacetext = myLanguage.getstartRaceGame();
        startButton = new JButton(startRacetext);
        styleButton(startButton, new Color(233, 197, 105));
        startButton.addActionListener(e -> startGame());
        infoPanel.add(startButton);
        infoPanel.add(player2Label);
        gamePanel.add(infoPanel, BorderLayout.SOUTH);

        return gamePanel;
    }
    // Liz Purintun 
    private void selectZodiacForPlayers() {
        ArrayList<String> animals = new ArrayList<String>(Arrays.asList( "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Horse", "Snake", "Goat", "Monkey", "Rooster",
                "Dog", "Pig" ));

        players = new ArrayList<Player>();

        HashMap<ImageIcon, String> player1Pair = selectZodiac("Player 1, choose your zodiac", animals);
        HashMap<ImageIcon, String> player2Pair = selectZodiac("Player 2, choose your zodiac", animals);
        player1Icon = (ImageIcon)(player1Pair.keySet().toArray()[0]);
        player1Label.setIcon(new ImageIcon(player1Icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        player2Icon = (ImageIcon)(player2Pair.keySet().toArray()[0]);
        player2Label.setIcon(new ImageIcon(player2Icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));

        player1 = (String)(player1Pair.values().toArray()[0]);
        player2 = (String)(player2Pair.values().toArray()[0]);

        String player1Gametext = myLanguage.getplayer1Game();
        String player2Gametext = myLanguage.getplayer2Game();
        players.add(new Player(player1Gametext, scorePlayer1, 0, player1Label));
        players.add(new Player(player2Gametext, scorePlayer2, 0, player2Label));

        animals.remove(player1);
        
        if (!animals.remove(player2)){
            animals.remove(0);
        }
        
        for (int i = 0; i < animals.size(); i++){
            int speed = 2 + (int)Math.round(Math.random() * 3);
            // I choose 2 as a minimul to reach the score in the time limit of 20 seconds
            // and then at a maximum of 5 to reach score within 8 seconds. 
            ImageIcon icon = new ImageIcon("picture/" + animals.get(i) + ".PNG");
            JLabel otherLabel = new JLabel();
            otherLabel.setIcon(new ImageIcon(icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
            Player player = new Player(animals.get(i), 0, speed, otherLabel);
            players.add(player);
        }
      
        
        
    }
    // Liz & Xiaoxi
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
        String player1Gametext = myLanguage.getplayer1Game();
        String player2Gametext = myLanguage.getplayer2Game();
        gameFrame.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (!gameStarted)
                    return;
                if (e.getKeyChar() == '1') {
                    scorePlayer1++;
                    moveIcon(player1Label, scorePlayer1);
                    for (Player myPlayer : players){
                        if (myPlayer.getName() == player1Gametext){
                            myPlayer.setScore(myPlayer.getScore() + 1);
                            break;
                        }
                    }
                } else if (e.getKeyChar() == '0') {
                    scorePlayer2++;
                    moveIcon(player2Label, scorePlayer2);
                    for (Player myPlayer : players){
                        if (myPlayer.getName() == player2Gametext){
                            myPlayer.setScore(myPlayer.getScore() + 1);
                            break;
                        }
                    }
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
                for (Player myPlayer : players){
                    int newScore = myPlayer.getScore() + myPlayer.getSpeed();
                    myPlayer.setScore(newScore);
                    moveIcon(myPlayer.getLabel(), newScore);
                    System.out.println(myPlayer.getName());
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
        bgLabel.setBounds(0, 0, 700, 800);
        trackPanel.add(bgLabel);
        int position = (int) ((trackPanel.getHeight() - 50) * ((double) score / winScore));
        label.setLocation(label.getX(), trackPanel.getHeight() - position - label.getHeight());
        
    }

    private void setupTrack() {
        // player1Label.setBounds(20, trackPanel.getHeight() - 50, 50, 50);
        // player2Label.setBounds(75, trackPanel.getHeight() - 50, 50, 50);
        // trackPanel.add(player1Label);
        // trackPanel.add(player2Label);
        int xpos = 20;
        for (Player myPlayer : players){
            JLabel labelToAdd = myPlayer.getLabel();
            myPlayer.getLabel().setBounds(xpos, trackPanel.getHeight() - 50, 50, 50);
            trackPanel.add(labelToAdd);
            labelToAdd.setLocation(xpos, trackPanel.getHeight() - 50);
            xpos += 55;
            moveIcon(labelToAdd, 0);
        }
        trackPanel.revalidate();
        trackPanel.repaint();
    }

    private void checkForWinner() {
        // if (scorePlayer1 >= winScore || scorePlayer2 >= winScore) {
        //     System.out.println("it made it ");
        //     timer.stop();
        //     oneSecTimer.stop();
        //     endGame();

        // }
        for (Player myPlayer : players) {
            if (myPlayer.getScore() >= winScore){
                System.out.println("it made it:");
                timer.stop();
                oneSecTimer.stop();
                endGame();
            }
        }
    }

    private void endGame() {
        gameStarted = false;
        
        String computerWinstext = myLanguage.getcomputerWinsGame();
        String player1Winstext = myLanguage.getplayer1WinsGame();
        String player2Winstext = myLanguage.getplayer2WinsGame();
        String winnerText = computerWinstext;
        if (scorePlayer1 >= winScore){
            winnerText = player1Winstext;
        }
        else if (scorePlayer2 >= winScore){
            winnerText = player2Winstext;
        }        

        String winnerOutput = computerWinstext;
        int i = 0;

        Comparator<Player> sortMostPoints = new Comparator<Player>() {
            @Override
            public int compare(Player s1, Player s2) {
            int first = s1.getScore();
            int second = s2.getScore();
            return second - first;
            }
        };
        players.sort(sortMostPoints);
        for (Player myPlayer : players) {
            winnerOutput += "\n" + (i +1) + ": " + myPlayer.getName() + " :" + myPlayer.getScore();
            i++;
        }


        ImageIcon beersIcon = new ImageIcon("picture/beersClinkin.png");
        Image imagebeers = beersIcon.getImage();
        Image resizedImage = imagebeers.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        JOptionPane.showMessageDialog(gameFrame, winnerOutput, winnerText, JOptionPane.PLAIN_MESSAGE,resizedIcon);
        resetGame();
    }

    private void resetGame() {
        // player1Label.setLocation(20, trackPanel.getHeight() - 50);
        // player2Label.setLocation(75, trackPanel.getHeight() - 50);
        int xpos = 20;
        for (Player myPlayer : players){
            myPlayer.setScore(0);
            JLabel labelToAdd = myPlayer.getLabel();
            trackPanel.add(labelToAdd);
            labelToAdd.setLocation(xpos, trackPanel.getHeight() - 50);
            xpos += 55;
            moveIcon(labelToAdd, 0);
            
        }
        startButton.setEnabled(true);
        gameFrame.removeKeyListener(gameFrame.getKeyListeners()[0]);
    }//

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
