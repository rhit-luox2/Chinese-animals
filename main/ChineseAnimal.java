package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChineseAnimal {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        // Initialize Main Page
        JFrame frame = new JFrame("12 Chinese Zodiac");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 900);

        // Layout and Creating Borders
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Setting Background
        Color backgroundColor = new Color(233, 197, 105);
        panel.setBackground(backgroundColor);

        // Setting Title
        JLabel title = new JLabel("12 Chinese Zodiac");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Adds Text Box
        panel.add(Box.createVerticalStrut(20));

        JTextArea description = new JTextArea(
                "The Lunar New Year has been celebrated for almost 3,500 years starting in the Shang Dynasty. " +
                        "Celebrations begin with the second new moon after the winter solstice. The Lunar New Year is heavily correlated with "
                        +
                        "Chinese zodiacs and each new year symbolizes the transition from one animal to the next.");
        description.setWrapStyleWord(true);
        description.setLineWrap(true);
        description.setOpaque(false);
        description.setEditable(false);
        description.setAlignmentX(Component.CENTER_ALIGNMENT);
        description.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Add Buttons to Lead to Other Pages
        JButton learnMoreButton = new JButton("Click here to read about the Chinese zodiacs");
        learnMoreButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        learnMoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "page not finish yet");
            }
        });

        // New Page

        panel.add(title);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(description);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(learnMoreButton);
        panel.add(Box.createRigidArea(new Dimension(0, 30)));

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
