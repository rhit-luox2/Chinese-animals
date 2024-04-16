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
        String story = "The story of the rat: The rat is the first animal of the 12-year cycle." + 
        "The night before the big race, the rat hid under the ox horn." + 
        "The rat planned to stay there during the race because it knew that the ox was the most " + 
        "diligent and enduring animal. As expected, the ox was in the lead until the ox got close to " + 
        "the finish line and the rat jumped off to become first place. The humans were unhappy by the rat " +
        "cheating, but the Emperor of Heaven viewed the rat’s tricks as a kind of wisdom. As a result, the rat is the first of the Zodiac Gods.";
        String year = "Years: 1948, 1960, 1972, 1984, 1996, 2008, 2020, 2032";
        String you ="What does this say about your? People who are born in the year of the rat tend " + 
        "to be sociable, cheerful, and thrive in groups. Rat personalities are clever and quick-thinkers. " + 
        "They are naturally cautious and tend to observe and avoid risk-taking. A weakness of the rats is that " + 
        "they tend to be selfish and only care about improving themselves rather than worrying about others.";
        String success = "What does it say about your success? Rats are able to find success in the fields of music, planning and management, and mathematics.";
        String comp = "Your compatibility with the other animals:";
        String wRat = "Rat & rat: You are a committed couple with a lack of mystery because you know each other so well.";
        String wOx = "Rat & ox: Both of you are willing to share family responsibilities. You know how to work with your complementary characters to help each other work work and home lives";
        String wDragon = "Rat & Dragon: Both of you can be mature and confident. You can trust and give space to each other.";
        String wMonkey = "Rat & monkey: You are both understanding and care to support each other. This level of support is the solution when conflict arises.";
        String famous = "Famous people who is this zodiac: Apple CEO TIm Cook, Katy Perry, Dwayne ‘The Rock’ Johnson, and Enimen";
 
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

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JTextArea description2 = new JTextArea(
            story + System.lineSeparator() + year + System.lineSeparator() + you + System.lineSeparator() + success);
        
        description2.setWrapStyleWord(true);
        description2.setLineWrap(true);
        description2.setOpaque(false);
        description2.setEditable(false);
        description2.setAlignmentX(Component.CENTER_ALIGNMENT);
        description2.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(description2);
    
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JTextArea description3 = new JTextArea(
            comp + System.lineSeparator() + wRat + System.lineSeparator() + wOx + System.lineSeparator() + wDragon + System.lineSeparator() + wMonkey + System.lineSeparator() + famous);
        
        description3.setWrapStyleWord(true);
        description3.setLineWrap(true);
        description3.setOpaque(false);
        description3.setEditable(false);
        description3.setAlignmentX(Component.CENTER_ALIGNMENT);
        description3.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(description3);
    
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
    //hello5635

}