package main;

import javax.swing.*;
import java.awt.*;

public class Monkey extends JFrame{


    public Monkey() {
        JFrame frame = new JFrame("Monkey");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 900);
 
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
 
        Color backgroundColor = new Color(233, 197, 105);
        panel.setBackground(backgroundColor);
 
        panel.add(Box.createVerticalStrut(20));

        String name = "Scientific name: Ceropothecidae";
        String lifespan1 = "Lifespan: up to 40 years";
        String habitat = "Habitat: rainforest - in almost every continent";
        String fact = "One interesting thing about monkeys: Monkeys are highly intelligent mammals. They understand numbers and can count. In rare cases, they can multiply.";
        String pop = "How many monkeys are there in the world? 505 known species";
        String story = "The story of the monkey: The monkey is the ninth animal of the Chinese zodiac sign. " + 
        "Even though the monkey is a common animal, it was able to participate in the Great Race because the tiger " + 
        "owed the monkey a favor for saving his life. However, the tiger king was unhappy that he was being compared to a common monkey. " +
        "The two have been incompatible ever since. During the race, the monkey won ninth place.";
        String year = "Years: 1956, 1968, 1980, 1992, 2004, 2016, 2028, 2040";
        String you ="What does this say about you? People who are born in the year of the monkey tend " + 
        "to be sociable, forward-thinking, and inventive. Monkey personalities are creative and unpredictable. " + 
        "They are naturally sharp-minded and fun to be around. A weakness of the rats is that they lack patience with anything that requires effort.";
        String success = "What does it say about your success? Monkeys are able to find success in the fields of sports and entertainment and any career that is tasked with solving complicated problems such as a detective or lawyer.";
        String comp = "Your compatibility with the other animals:";
        String wRat = "Monkey & rat: You are both understanding and care to support each other. This level of support is the solution when conflict arises.";
        String wDog = "Monkey & dog: Both of you treat each other with respect and know each other’s needs. This couple is mature and can handle conflicts well.";
        String wDragon = "Monkey & dragon: Both of you understand the importance of cherishing and bonding with each other. You know how to work with each other so that you can learn and help each other because are both ambitious and positive.";
        String famous = "Famous people who is this zodiac: Christina Aguilera, Celine Dion, Will Smith, Jennifer Aniston, Tom Hanks, and Justine Timberlake";
 
        JTextArea description = new JTextArea(
            name + System.lineSeparator() + lifespan1 + System.lineSeparator() + habitat +
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
            comp + System.lineSeparator() + wRat + System.lineSeparator() + wDog + System.lineSeparator() + wDragon + System.lineSeparator() + famous);
        
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
        new Monkey();
    }

}