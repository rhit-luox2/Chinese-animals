package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wheel extends JFrame{
    private static JTextField enterYear;

    Wheel(){
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
        description.setBorder(BorderFactory.createBevelBorder(ABORT, , backgroundColor));

        // Enter their Year
        panel.add(Box.createVerticalStrut(20));

        JTextArea enterYear = new JTextArea(
                "ex. 1999 ");
        enterYear.setWrapStyleWord(true);
        enterYear.setLineWrap(true);
        enterYear.setOpaque(false);
        enterYear.setEditable(true);
        enterYear.setAlignmentX(Component.CENTER_ALIGNMENT);
        enterYear.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));


        JButton getZodiacFYButton = new JButton("Get Zodiac");
        getZodiacFYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    int userentered = Integer.parseInt(enterYear.getText());
                    JOptionPane.showMessageDialog(null, "Entered integer: " + userentered);
        
                }
                catch (NumberFormatException eNumberFormatException){
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter an integer.");
                }
            }
        });
        panel.add(getZodiacFYButton);

        //
        // year.setAlignmentX(Component.CENTER_ALIGNMENT);
        // year.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Add Buttons to Lead to Other Pages
        JButton learnMoreButton = new JButton("Click here to read about the Chinese zodiacs");
        learnMoreButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        learnMoreButton.setAlignmentY(BOTTOM_ALIGNMENT);
        learnMoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame selectAnimalFrame = new SelectAnimal();
                selectAnimalFrame.setVisible(true);
            }
        });
        panel.add(description);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(enterYear);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(learnMoreButton);
        panel.add(Box.createRigidArea(new Dimension(0, 30)));
        
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

        public static void main(String[] args) {
            new Wheel();
        
    }
}
