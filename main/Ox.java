package main;

import javax.swing.*;
import java.awt.*;

public class Ox {

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Ox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 900);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        Color backgroundColor = new Color(233, 197, 105);
        panel.setBackground(backgroundColor);

        panel.add(Box.createVerticalStrut(20));

        String name = "Scientific name: Bos taurus";
        String lifespan = "Lifespan: about 15 years";
        String habitat = "Habitat: North America, Europe, Asia, and Africa; no wild oxen in South America and Australia";
        String fact = "One interesting thing about oxen is: Oxen have been domesticated for over 6,000 years, used for agricultural purposes.";
        String pop = "How many oxen are there in the world? About 300 to 400 million";
        String story = "The story of the ox: Ox ranks the second among the Chinese zodiacs because it helped the Rat but was later tricked by it. The myth goes that the Jade Emperor declared the order of zodiac signs would be based on the arrival orders of 12 animals. Ox could have arrived first but kindly gave a ride to Rat. However, when arriving, Rat just jumped to the terminus ahead of Ox, and thus Ox lost the first place.";
        String year = "Years: 1913, 1925, 1937, 1949, 1961, 1973, 1985, 1997, 2009, 2021, 2033";
        String you = "What does this say about you? Oxen are faithful, obliging, persistent, and sympathetic";
        String success = "What does it say about your success? Oxen are typical realists, upright and simple, suited for roles like lawyers, consultants, doctors, and technicians.";
        String famous = "Famous people of this zodiac: Walt Disney, Margaret Thatcher, Diana Spencer, Barack Obama, Bruno Mars";

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
        SwingUtilities.invokeLater(Ox::createAndShowGUI);
    }
}
