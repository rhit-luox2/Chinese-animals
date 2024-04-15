package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rat {


    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Rat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 900);
 
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
 
        Color backgroundColor = new Color(233, 197, 105);
        panel.setBackground(backgroundColor);
 
        panel.add(Box.createVerticalStrut(20));

        String name = "Scientific name: Rattus";
        String lifespan1 = "Lifespan: Domestic - 2-4 years";
        String lifespan2 = "                Wild - 10 years";
        String habitat = "Habitat: Anywhere - ports, attic, alley, underground, cities, suburbs, and every continent except Antartica";
        String fact = "One interesting thing about rats is: Rats have many similar characteristics as humans. For example, a rat can be peer pressured. They feel the need to conform.";
        String pop = "How many rats are there in the world? More than 2 billion rats";
 
        JTextArea description = new JTextArea(
            name + System.lineSeparator() + lifespan1 +  System.lineSeparator() + lifespan2 + System.lineSeparator() + habitat +
            System.lineSeparator() + fact + System.lineSeparator() + pop);
        
        description.setWrapStyleWord(true);
        description.setLineWrap(true);
        description.setOpaque(false);
        description.setEditable(false);
        description.setAlignmentX(Component.CENTER_ALIGNMENT);
        description.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(description);
       
        // JTextArea description2 = new JTextArea(
        //     "Scientific name: Rattus" );
        //     System.lineSeparator();
        
        // description2.setWrapStyleWord(true);
        // description2.setLineWrap(true);
        // description2.setOpaque(false);
        // description2.setEditable(false);
        // description2.setAlignmentX(Component.CENTER_ALIGNMENT);
        // description2.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        // panel.add(description2);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}