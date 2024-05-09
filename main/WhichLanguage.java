package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WhichLanguage {
    public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> createAndShowGUI());
        }

    private static void createAndShowGUI() {
        // Initialize Main Page
        JFrame frame = new JFrame("Which language?");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 1000);

        // Layout and Creating Borders
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Setting Background
        Color backgroundColor = new Color(233, 197, 105);
        panel.setBackground(backgroundColor);

        Color redColor = new Color(227, 33, 25);

        JLabel chooseLanguage = new JLabel("Hello! Welcome to our app. Please select a language you would like to continue with: ");
        chooseLanguage.setFont(new Font("Serif", Font.BOLD, 25));
        chooseLanguage.setForeground(redColor);
        chooseLanguage.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(chooseLanguage);
        
        JButton english = createButton("Click here to continue with English", redColor,
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Language myLanguage = new English();
                        new ChineseAnimal(myLanguage);
                        frame.dispose();
                    }
                });
        panel.add(english);

        frame.add(panel);
        frame.setVisible(true);

        JButton german = createButton("Klicken Sie hier, um auf Deutsch zu wechseln", redColor,
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Language myLanguage = new German();
                        new ChineseAnimal(myLanguage);
                        frame.dispose();
                    }
                });
        panel.add(german);

        frame.add(panel);
        frame.setVisible(true);
            }

        private static JButton createButton(String text, Color textColor, ActionListener listener) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 14));
            button.setForeground(textColor);
            button.setAlignmentX(Component.CENTER_ALIGNMENT);
            button.addActionListener(listener);
            return button;
        }
    }