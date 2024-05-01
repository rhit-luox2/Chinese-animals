package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Game {

    private JFrame gameFrame;
    private JLabel scoreLabel;
    private JButton startButton;
    private int scorePlayer1 = 0;
    private int scorePlayer2 = 0;
    private boolean gameStarted = false;
    private final int winScore = 40; 
    private KeyAdapter keyListener; 

    protected Players players;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Game()::launchGame);
    }

    private void launchGame() {
        gameFrame = new JFrame("Zodiac Race Game");
        gameFrame.setSize(600, 900);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setLocationRelativeTo(null);

        Color backgroundColor = new Color(233, 197, 105);
        JPanel gamePanel = new JPanel();
        gamePanel.setLayout(new GridLayout(3, 1));
        gamePanel.setBackground(backgroundColor);

        scoreLabel = new JLabel("Player 1: 0 - Player 2: 0", JLabel.CENTER);
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 18));
        scoreLabel.setOpaque(true);
        scoreLabel.setBackground(backgroundColor);
        gamePanel.add(scoreLabel);

        startButton = new JButton("Start Race");
        startButton.setFont(new Font("Arial", Font.BOLD, 18));
        startButton.setBackground(backgroundColor);
        startButton.setOpaque(true);
        startButton.setBorderPainted(false);
        startButton.addActionListener(e -> startGame());
        gamePanel.add(startButton);

        gameFrame.add(gamePanel);
        gameFrame.setVisible(true);

        setupKeyListener(); 
    }

    private void setupKeyListener() {
        keyListener = new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (!gameStarted)
                    return;
                if (e.getKeyChar() == '1') {
                    scorePlayer1++;
                    updateScoreLabel();
                    checkForWinner();
                } else if (e.getKeyChar() == '0') {
                    scorePlayer2++;
                    updateScoreLabel();
                    checkForWinner();
                }
            }
        };
    }

    private void startGame() {
        // Reset scores and update label
        scorePlayer1 = 0;
        scorePlayer2 = 0;
        updateScoreLabel();
        gameStarted = true;

        // Re-add key listener
        gameFrame.addKeyListener(keyListener);
        gameFrame.setFocusable(true);
        gameFrame.requestFocusInWindow();
        startButton.setEnabled(false);
    }

    private void updateScoreLabel() {
        scoreLabel.setText("Player 1: " + scorePlayer1 + " - Player 2: " + scorePlayer2);
    }

    private void checkForWinner() {
        if (scorePlayer1 >= winScore || scorePlayer2 >= winScore) {
            endGame();
        }
    }

    private void endGame() {
        gameStarted = false;
        String winnerText = "It's a draw!";
        if (scorePlayer1 >= winScore) {
            winnerText = "Player 1 wins!";
        } else if (scorePlayer2 >= winScore) {
            winnerText = "Player 2 wins!";
        }

        // Show winner and allow game to be restarted
        JOptionPane.showMessageDialog(gameFrame, winnerText, "Game Over", JOptionPane.INFORMATION_MESSAGE);
        scoreLabel.setText("Player 1: 0 - Player 2: 0");
        startButton.setEnabled(true); 
        gameFrame.removeKeyListener(keyListener); 
    }
}
