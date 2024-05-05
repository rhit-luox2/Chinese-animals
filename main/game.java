package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.concurrent.atomic.AtomicReference;

public class Game {

    private JFrame gameFrame;
    private JPanel trackPanel;
    private JLabel player1Label, player2Label;
    private JButton startButton;
    private ImageIcon player1Icon, player2Icon;
    private int scorePlayer1 = 0, scorePlayer2 = 0;
    private boolean gameStarted = false;
    private final int winScore = 40;

    protected Players players;

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
        String[] animals = { "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Horse", "Snake", "Goat", "Monkey", "Rooster",
                "Dog", "Pig" };
        player1Icon = selectZodiac("Player 1, choose your zodiac", animals);
        player1Label.setIcon(new ImageIcon(player1Icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        player2Icon = selectZodiac("Player 2, choose your zodiac", animals);
        player2Label.setIcon(new ImageIcon(player2Icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
    }

    private ImageIcon selectZodiac(String title, String[] animals) {
        JDialog dialog = new JDialog(gameFrame, title, true);
        dialog.setLayout(new GridLayout(0, 3));
        dialog.setSize(600, 600);
        dialog.setLocationRelativeTo(gameFrame);
        ImageIcon[] icons = new ImageIcon[animals.length];
        AtomicReference<ImageIcon> selectedIcon = new AtomicReference<>();
        for (int i = 0; i < animals.length; i++) {
            ImageIcon icon = new ImageIcon("picture/" + animals[i] + ".PNG");
            icons[i] = new ImageIcon(icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
            final int index = i;
            JButton button = new JButton(icons[i]);
            button.addActionListener(e -> {
                selectedIcon.set(icons[index]);
                dialog.dispose();
            });
            dialog.add(button);
        }
        dialog.setVisible(true);
        return selectedIcon.get();
    }

    private void startGame() {
        scorePlayer1 = 0;
        scorePlayer2 = 0;
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
    }

    private void moveIcon(JLabel label, int score) {
        int position = (int) ((trackPanel.getHeight() - 50) * ((double) score / winScore));
        label.setLocation(label.getX(), trackPanel.getHeight() - position - label.getHeight());
    }

    private void setupTrack() {
        player1Label.setBounds(100, trackPanel.getHeight() - 50, 50, 50);
        player2Label.setBounds(400, trackPanel.getHeight() - 50, 50, 50);
        trackPanel.add(player1Label);
        trackPanel.add(player2Label);
        trackPanel.revalidate();
        trackPanel.repaint();
    }

    private void checkForWinner() {
        if (scorePlayer1 >= winScore || scorePlayer2 >= winScore) {
            endGame();
        }
    }

    private void endGame() {
        gameStarted = false;
        String winnerText = scorePlayer1 >= winScore ? "Player 1 wins!" : "Player 2 wins!";
        JOptionPane.showMessageDialog(gameFrame, winnerText, "Game Over", JOptionPane.INFORMATION_MESSAGE);
        resetGame();
    }

    private void resetGame() {
        player1Label.setLocation(100, trackPanel.getHeight() - 50);
        player2Label.setLocation(400, trackPanel.getHeight() - 50);
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
