package main;

import javax.swing.*;
import java.awt.*;

public class Pig {

    public Pig() {
        JFrame frame = new JFrame("Pig");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 900);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        Color backgroundColor = new Color(233, 197, 105);
        panel.setBackground(backgroundColor);

        panel.add(Box.createVerticalStrut(20));

        String name = "Scientific name: Sus scrofa domesticus";
        String lifespan = "Lifespan: 15 years";
        String habitat = "Habitat: Pigs can live in a wide variety of habitats including pastures, farmland, forests, grasslands, wetlands, savannas, and even remote islands.";
        String fact = "One interesting thing about pigs: They are highly intelligent, ranking among the top 4 to 7 most intelligent animals on Earth.";
        String pop = "How many pigs are there in the world? About 778.64 million";
        String story = "The story of the pig: The pig became the last zodiac sign after it struggled to reach the Heavenly Southern Gate, overcoming many obstacles on its long journey.";
        String year = "Years: 1923, 1935, 1947, 1959, 1971, 1983, 1995, 2007, 2019, 2031, 2043";
        String you = "What does this say about you? Pigs are diligent, upright, compassionate, and responsible.";
        String success = "What does it say about your success? Pigs excel in public service, education, and the arts, but are less suited for competitive industries.";
        String famous = "Famous people of this zodiac: Ronald Reagan, Woody Allen, Arnold Schwarzenegger, Hillary Clinton, Mariah Carey, Kendall Jenner";

        JTextArea description = new JTextArea(
                name + System.lineSeparator() + lifespan + System.lineSeparator() + habitat +
                        System.lineSeparator() + fact + System.lineSeparator() + pop);

        description.setWrapStyleWord(true);
        description.setLineWrap(true);
        description.setOpaque(false);
        description.setEditable(false);
        description.setAlignmentX(Component.CENTER_ALIGNMENT);
        description.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(description);

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

        JTextArea description3 = new JTextArea(
                famous);

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
        new Pig();
    }
}
