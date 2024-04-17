package main;

import javax.swing.*;
import java.awt.*;

public class Horse {

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Horse");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 900);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        Color backgroundColor = new Color(233, 197, 105);
        panel.setBackground(backgroundColor);

        panel.add(Box.createVerticalStrut(20));

        String name = "Scientific name: Equus ferus caballus";
        String lifespan = "Lifespan: 30 years";
        String habitat = "Habitat: Varies from grasslands to forests, mountains, wetlands, deserts, tundra, savannahs, coastal regions, steppes, and more.";
        String fact = "One interesting thing about horses: They were the most frequent transport means in ancient societies and are considered one of the six most important animals in China.";
        String pop = "How many horses are there in the world? Approximately 60 million";
        String story = "The story of the horse: Legend goes that the horse had wings in ancient times and was named Holy Horse, capable of running on the ground, swimming, and flying. Due to its arrogance, the Jade Emperor ordered its wings cut and buried it under Kunlun Mountain. Human ancestor Ren Zu later freed it, and the horse dedicated its life to serving humans.";
        String year = "Years: 1918, 1930, 1942, 1954, 1966, 1978, 1990, 2002, 2014, 2026";
        String you = "What does this say about you? Horses are cheerful, enthusiastic, insightful, and considerate.";
        String success = "What does it say about your success? Horses have quick wit and good judgement, suitable for careers in adventure, tourism, writing, business, and art.";
        String famous = "Famous people of this zodiac: Paul McCartney, Angela Merkel, Jackie Chan, Kobe Bryant, Kristen Stewart, Greta Thunberg";

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
        SwingUtilities.invokeLater(Horse::createAndShowGUI);
    }
}
