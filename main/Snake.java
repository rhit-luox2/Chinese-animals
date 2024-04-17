package main;

import javax.swing.*;
import java.awt.*;

public class Snake extends JFrame{


    public Snake() {
        JFrame frame = new JFrame("Snake");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 900);
 
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
 
        Color backgroundColor = new Color(233, 197, 105);
        panel.setBackground(backgroundColor);
 
        panel.add(Box.createVerticalStrut(20));

        String name = "Scientific name: Serpentes";
        String lifespan1 = "Lifespan: up to 20 years";
        String habitat = "Habitat: Any habitat that isn’t arctic or sub-arctic - tropical forests, dry deserts, taigas, forests, meadows";
        String fact = "One interesting thing about snakes: There are 725 species of venomous snakes but only 250 of them can eat a human with one bite.";
        String pop = "How many snakes are there in the world? There are more than 3,000 species";
        String story = "The story of the snake: The snake is the sixth animal of the Chinese zodiac sign. " + 
        "Long, long ago, the snake had four legs, but the snake was disliked by humans. When the snake heard about " + 
        "this, it ate animals and bit people. The Jade Emperor advised the snake to be good, but the snake refused. As a result, " + 
        "the Jade Emperor cut the snake’s four legs.  The snake realized its mistake and worked to do good deeds for humans. It learned " + 
        "water control from the dragon to prevent floods. The snake was placed after the dragon because the Jade Emperor saw that the snake " + 
        "corrected its mistakes.";
        String year = "Years: 1953, 1965, 1977, 1989, 2001, 2013, 2025, 2037";
        String you ="What does this say about you? People who are born in the year " + 
        "of the snake tend to be considerably intelligent, adaptable, and have a calm exterior. " + 
        "Snake personalities have a wide range of interests. They are both goal-orientated and have a " + 
        "keen intuition, which leads to high levels of creativity. A weakness of the snake is that they are " + 
        "emotionally detached, which makes it hard for romantic partners because they struggle with being vulnerable.";
        String success = "What does it say about your success? Snakes can find success in knowledge-based work, such as a politician, teacher, and psychologist. Snakes prefer to prioritize their ideas without considering what others have to say. This would be helpful in a leadership position.";
        String comp = "Your compatibility with the other animals:";
        String wSheep = "Snake & Sheep: You are both family-oriented. You can work together to create a harmonious family.";
        String wDog = "Snake & Dog: Both of you trust and understand each other to build a lasting and fresh relationship.";
        String wMonkey = "Snake & Monkey: Both of you have each other’s needs. Rabbits expect tenderness, warmth, and support from a partner. A dog can meet those needs and another plus is that dogs are romantic.";
        String wPig = "Snake & Pig: The pig’s personality matches well with the rabbit’s. Rabbits appreciate the pig’s simplicity and honesty.";
        String famous = "Famous people who is this zodiac: Wilhelm Röntgen, Johann Wolfgang von Goethe, J.K.Rowling, Oprah Winfrey, John F. Kennedy, Pablo Picasso, and Charles Darwin";
 
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
            comp + System.lineSeparator() + wSheep + System.lineSeparator() + wDog + System.lineSeparator() + wMonkey + System.lineSeparator() + wPig + System.lineSeparator() + famous);
        
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
        new Snake();
    }

}
