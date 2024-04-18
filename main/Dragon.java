package main;

import javax.swing.*;
import java.awt.*;

public class Dragon extends JFrame {

    public Dragon() {
        JFrame frame = new JFrame("Dragon");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 900);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        Color backgroundColor = new Color(233, 197, 105);
        panel.setBackground(backgroundColor);

        panel.add(Box.createVerticalStrut(20));

        String lore = "Lore: The dragon was the fifth zodiac. Although it should have been faster, the dragon had stopped by a village to provide rain and helped the rabbit by blowing it to shore.";
        String years = "Year: 1904, 1916, 1928, 1940, 1952, 1964, 1976, 1988, 2000, 2012, 2024";
        String aboutYou = "What does your animal say about you? Dragons are seen as powerful, kind-hearted, prosperous, brave, leaders, and innovative. They can also be scrutinizing, egotistical, easy to anger, and overconfident.";
        String compatibility = "Who are you most compatible with?\nDragon & Rat: Appreciative of each other's traits despite differences.\nDragon & Monkey: They bring out the best in each other, balancing passion and humor.\nDragon & Rooster: Driven and straight forward, they both know what they want.";
        String famousPeople = "Famous People: John Lennon, Bruce Lee, Rihanna, Martin Luther King Jr., Vladimir Putin, Shakira, Jeb Bush, Christian Dior, Robert Oppenheimer, Shirley Temple, Adele, Dr. Seuss, Sandra Bullock, Alexei Nikolaevich";
        String challenge = "2024 is the year of the Dragon. People born in Dragon years face big challenges due to clashing with Tai Sui.";

        JTextArea description = new JTextArea(
                lore + System.lineSeparator() + years + System.lineSeparator() + aboutYou +
                        System.lineSeparator() + compatibility + System.lineSeparator() + famousPeople +
                        System.lineSeparator() + challenge);

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
    }

    public static void main(String[] args) {
        new Dragon();
    }
}
