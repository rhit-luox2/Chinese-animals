package main;

import javax.swing.*;
import java.awt.*;

public class Rooster extends JFrame {

    public Rooster() {
        JFrame frame = new JFrame("Rooster");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 900);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        Color backgroundColor = new Color(233, 197, 105);
        panel.setBackground(backgroundColor);

        panel.add(Box.createVerticalStrut(20));

        String name = "Scientific name: Gallus gallus domesticus";
        String lifespan = "Lifespan: 5 years";
        String habitat = "Habitat: Roosters are found in farms, suburban chicken coops, forests, grasslands, and even deserts. They adapt well to various environments.";
        String fact = "One interesting thing about roosters: They have a bad sense of smell and taste, but have good hearing.";
        String story = "The story of the rooster: After learning it could wake people with its golden voice, the rooster began singing at dawn, earning human gratitude and eventually, a spot in the Chinese zodiac.";
        String year = "Years: 1921, 1933, 1945, 1957, 1969, 1981, 1993, 2005, 2017, 2029";
        String you = "What does this say about you? Roosters are confident, sociable, intelligent, and optimistic.";
        String success = "What does it say about your success? Roosters excel in public speaking, politics, and the arts, making them suitable for roles as politicians, diplomats, tour guides, actors, or fashion designers.";
        String famous = "Famous people of this zodiac: Tom Selleck, Kelly McGillis, Jennifer Aniston, Britney Spears, Justin Timberlake, Taylor Momsen";

        JTextArea description = new JTextArea(
                name + System.lineSeparator() + lifespan + System.lineSeparator() + habitat +
                        System.lineSeparator() + fact + System.lineSeparator() + story + System.lineSeparator() + year +
                        System.lineSeparator() + you + System.lineSeparator() + success + System.lineSeparator()
                        + famous);

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
        new Rooster();
    }
}
