package main;

import javax.swing.*;
import java.awt.*;

public class Goat extends JFrame{


    public Goat() {
        JFrame frame = new JFrame("Goat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 900);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        Color backgroundColor = new Color(233, 197, 105);
        panel.setBackground(backgroundColor);

        panel.add(Box.createVerticalStrut(20));

        String name = "Scientific name: Capra hircus";
        String lifespan1 = "Lifespan: upto 18 years";
        String habitat = "Habitat: Goats have been domesticated for many years and they typically have been used by humans for manual labor, for their milk and fur. They are excellent climbers and can pretty much survive in any climate except for extreme heat or cold. They typically like grassy areas and migrate with a herd. They typically are found in Asia, North America, and parts of Europe. ";
        String fact = "One interesting thing about rats is: Rats have many similar characteristics as humans. For example, a rat can be peer pressured. They feel the need to conform.";
        String pop = "";
        String story = "The goat was given 8th place. The rooster, monkey and goat had a plan to pull a raft to get themselves across the river.";
        String year = "Years: 1907, 1919, 1931, 1943, 1955, 1967, 1979, 1991, 2003, 2015, 2027";
        String you = "What does this say about you? Goat/Sheep are typically polite, shy, mellow, and visionary. However, goats can be pessimistic, unrealistic, only see things one way and slow in behavior. They tend to have high endurance and are very driven by the people around them. They are also ideal innovators, creative and compassionate.";
    
        String success = "What does it say about your success? Although Goats are considered shy, weak and maybe more feminine. They are very charming and graceful and talented in art and music. Suitable jobs would be medicine, philanthropology, artists, writers, dancers, philosophers, teachers, nurses, service work, and salesmen.";
        String comp = "Your compatibility with the other animals:";
        String wRabbit = "Goat & Rabbit: Both are very thoughtful of each other's desires. Sheep are very romantic, Rabbits are very reflective and they tend to compliment each other well. Rabbits tend to look ahead and plan, while sheep are very fearful of what might come. Goats are very willing to pursue their many dreams and Rabbits are more cautious and calculated. They both recognize each other's flaws and find ways to still get along.";
        String wPig = "Goat & Pig: The goat and pig have a very balanced, fun and loving relationship. Although the goat is impulsive, the pig steadies the goat. The pig is typically the organizer in the relationship, while the goat contributes with their creativity and enrichment. They might battle between structure and freedom between the two but they tend to share common values which cements their relationship.";
        String wHorse = "Goat & Horse: Goats are sentimental and kind; they also tend to be jealous. However, horses are very calm and able to keep the goat interested. They are most compatible as friends which strengthens their relationship as a couple. The only thing that is recommended is they need to have independence in their relationship and keep an open mind.";
        String famous = "Famous people who is this zodiac: Steve Jobs, George Harrison, Bruce Willis, Bill Gates, Kurt Cobain, Billie Jean King, Tita Moerno, Mikhail Gorachev, Olivia Rodrigo, Julia Roberts, John Wayne, Mick Jagger, Ed Sheeran";

        JTextArea description = new JTextArea(
                name + System.lineSeparator() + lifespan1 + System.lineSeparator()  + System.lineSeparator()
                        + habitat +
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
                story + System.lineSeparator() + year + System.lineSeparator() + you + System.lineSeparator()
                        + success);

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
                comp + System.lineSeparator() + wRabbit + System.lineSeparator() + wHorse + System.lineSeparator() + wPig
                        + System.lineSeparator()+ famous);

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
        new Goat();
    }
    
}
