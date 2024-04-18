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

        // Red Color
        Color redColor = new Color(227, 33, 25);

        // Setting Title
        JLabel title = new JLabel("Find Your Zodiac!");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Adds Text Box
        panel.add(Box.createVerticalStrut(20));

        String yearBorn = "Enter the Year You Were Born: ";
        String inputYear = "ex. 1999"; 

        // private boolean isItTheYear(String input) {
        //     if (input.contains(enterYear)){
        //         return true;
        //     }
        //     return false;
        // }
//
        JTextField description = new JTextField(
            yearBorn + inputYear);
      
        description.setOpaque(false);
        // description.setEditable(isItTheYear());
        description.setEditable(false);
        description.setAlignmentX(Component.CENTER_ALIGNMENT);
        description.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        

        // Enter their Year
        panel.add(Box.createVerticalStrut(20));

        JTextField enterYear = new JTextField(
                "ex. 1999");
        enterYear.setPreferredSize(new Dimension(20, 20) );;
        enterYear.setOpaque(false);
        enterYear.setEditable(true);
        enterYear.setAlignmentX(Component.CENTER_ALIGNMENT);
        enterYear.setBorder(BorderFactory.createDashedBorder(redColor, 1, 0));


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
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
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
