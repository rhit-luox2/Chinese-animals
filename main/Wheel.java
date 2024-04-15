package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wheel {
    private JTextField inputyear;

    private static void createAndShowGUI() {
        // Initialize Wheel Page
        JFrame frame = new JFrame("Find Your Zodiac!");
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
        JLabel title = new JLabel("Find Your Zodiac!");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Adds Text Box
        panel.add(Box.createVerticalStrut(20));

        JTextArea description = new JTextArea(
                "Enter the Year You Were Born: ");
        description.setWrapStyleWord(true);
        description.setLineWrap(true);
        description.setOpaque(false);
        description.setEditable(false);
        description.setAlignmentX(Component.CENTER_ALIGNMENT);
        description.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Input year 
        inputyear = new JFormattedTextField();

        year.setWrapStyleWord(true);
        year.setLineWrap(true);
        year.setOpaque(false);
        year.setEditable(true);

        JButton getZodiacFYButton = new JButton("Get Zodiac");
        getZodiacFYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    int inputyear;
                }
            }
        });

        
        year.setAlignmentX(Component.CENTER_ALIGNMENT);
        year.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Add Buttons to Lead to Other Pages
        JButton learnMoreButton = new JButton("Click here to read about the Chinese zodiacs");
        learnMoreButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        learnMoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "page not finish yet");
            }
        });
        panel.add(learnMoreButton);

        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
        // heelo
}
}
