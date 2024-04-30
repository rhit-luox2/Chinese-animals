package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Game {

    private JFrame gameFrame;
    private JLabel player1Label, player2Label;
    private JButton startButton;
    private ImageIcon player1Icon, player2Icon;
    private int scorePlayer1 = 0, scorePlayer2 = 0;
    private boolean gameStarted = false;
    private final int winScore = 40;

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
        JPanel gamePanel = new JPanel(new GridLayout(4, 1));
        gamePanel.setBackground(new Color(233, 197, 105));

        player1Label = new JLabel("Player 1: 0", JLabel.CENTER);
        player2Label = new JLabel("Player 2: 0", JLabel.CENTER);
        styleLabel(player1Label);
        styleLabel(player2Label);
        gamePanel.add(player1Label);
        gamePanel.add(player2Label);

        startButton = new JButton("Start Race");
        styleButton(startButton, new Color(233, 197, 105));
        startButton.addActionListener(e -> startGame());
        gamePanel.add(startButton);

        return gamePanel;
    }

    private void styleLabel(JLabel label) {
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setBackground(new Color(233, 197, 105));
        label.setOpaque(true);
    }

    private void styleButton(JButton button, Color backgroundColor) {
        button.setFont(new Font("Arial", Font.BOLD, 18));
        button.setBackground(backgroundColor);
        button.setOpaque(true);
        button.setBorderPainted(false);
    }

    private void selectZodiacForPlayers() {
        String[] animals = { "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Horse",
                "Snake", "Goat", "Monkey", "Rooster", "Dog", "Pig" };

        player1Icon = selectZodiac("Player 1, choose your zodiac", animals);
        player1Label.setIcon(new ImageIcon(player1Icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));

        player2Icon = selectZodiac("Player 2, choose your zodiac", animals);
        player2Label.setIcon(new ImageIcon(player2Icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
    }

    private ImageIcon selectZodiac(String title, String[] animals) {
        JOptionPane optionPane = new JOptionPane();
        optionPane.setMessage(title);
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        optionPane.setOptionType(JOptionPane.DEFAULT_OPTION);

        Object[] options = new JButton[animals.length];
        for (int i = 0; i < animals.length; i++) {
            ImageIcon icon = new ImageIcon("picture/" + animals[i] + ".PNG");
            JButton button = new JButton();
            button.setIcon(new ImageIcon(icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
            button.addActionListener(e -> optionPane.setValue(icon));
            options[i] = button;
        }

        optionPane.setOptions(options);
        JDialog dialog = optionPane.createDialog(gameFrame, "Select Zodiac");
        dialog.setVisible(true);

        return (ImageIcon) optionPane.getValue();
    }

    private void startGame() {
        scorePlayer1 = 0;
        scorePlayer2 = 0;
        updateScoreLabel();
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
                } else if (e.getKeyChar() == '2') {
                    scorePlayer2++;
                }
                updateScoreLabel();
                checkForWinner();
            }
        });
        gameFrame.setFocusable(true);
        gameFrame.requestFocusInWindow();
        startButton.setEnabled(false);
    }

    private void updateScoreLabel() {
        player1Label.setText("Player 1: " + scorePlayer1);
        player2Label.setText("Player 2: " + scorePlayer2);
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
        JOptionPane.showMessageDialog(gameFrame, winnerText, "Game Over", JOptionPane.INFORMATION_MESSAGE);
        resetGame();
    }

    private void resetGame() {
        player1Label.setText("Player 1: 0");
        player2Label.setText("Player 2: 0");
        startButton.setEnabled(true);
    }
}
