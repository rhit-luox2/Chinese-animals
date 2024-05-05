package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChineseAnimal {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        // Initialize Main Page
        JFrame frame = new JFrame("12 Chinese Zodiac");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 1000);

        // Layout and Creating Borders
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Setting Background
        Color backgroundColor = new Color(233, 197, 105);
        panel.setBackground(backgroundColor);

        // Red Color
        Color redColor = new Color(227, 33, 25);

        // Setting Title
        JLabel title = new JLabel("12 Chinese Zodiacs");
        title.setFont(new Font("Serif", Font.BOLD, 36));
        title.setForeground(redColor);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(title);

        panel.add(Box.createVerticalStrut(30)); // Space between title and image

        // Insert image
        ImageIcon originalIcon = new ImageIcon("picture/main2.jpg");
        Image image = originalIcon.getImage();
        Image resizedImage = image.getScaledInstance(540, 540, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        JLabel imageLabel = new JLabel(resizedIcon);
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(imageLabel);
        
        // Set disclaimer
        JLabel disclaimer = new JLabel("Disclaimer: Goat and Sheep are interchangeable in Chinese astrology");
        disclaimer.setFont(new Font("Serif", Font.BOLD, 14));
        disclaimer.setForeground(redColor);
        disclaimer.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(disclaimer);

        // Adds Text Box
        panel.add(Box.createVerticalStrut(20)); // Space between image and text box

        JTextArea description = new JTextArea(
                "The Lunar New Year has been celebrated for almost 3,500 years starting in the Shang Dynasty. "
                        + "Celebrations begin with the second new moon after the winter solstice. The Lunar New Year is heavily correlated with "
                        + "Chinese zodiacs and each new year symbolizes the transition from one animal to the next." + System.lineSeparator() + "Legend has it that the Jade Emperor summoned all the animals to his palace in a “Great Race” (or possibly for a banquet), and the order in which they arrived determined the animal’s place in the zodiac. Several animals raced to the Southern Heavenly Gate. The zodiac winners are Rat, Ox, Tiger, Dragon, Rabbit, Snake, Horse, Goat, Monkey, Rooster, Dog, and Pig. ");
        description.setFont(new Font("Serif", Font.ITALIC, 16));
        description.setWrapStyleWord(true);
        description.setLineWrap(true);
        description.setOpaque(false);
        description.setEditable(false);
        description.setAlignmentX(Component.CENTER_ALIGNMENT);
        description.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(description);

        // JScrollPane scrollPane = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); 
  
        //     // Create a vertical scrollbar 
        //     JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar(); 
  
        //     // Add components to the content panel
        //     panel.add(description);
        //     frame.add(scrollPane, BorderLayout.CENTER);
  
        //     // Add the content panel to the frame 
        //     // frame.add(panel);
  
        //     frame.setVisible(true);

        // Add Buttons to Lead to Other Pages
        JButton learnMoreButton = createButton("Click here to read about the Chinese zodiacs", redColor,
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Learn More button clicked");
                        new SelectAnimal();
                        frame.dispose();
                    }
                });
        panel.add(learnMoreButton);

        JButton findyourZod = createButton("Click here to find your zodiac or your friend's zodiac", redColor,
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Find Your Zodiac button clicked");
                        new WheelManager();
                        frame.dispose();
                    }
                });
        panel.add(findyourZod);

        JButton gameButton = createButton("Click here to race your friends in the Great Race", redColor,
        new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Game button clicked");
                Game game = new Game();
                game.main(null);
                frame.dispose();
            }
        });
        panel.add(gameButton); 

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static JButton createButton(String text, Color textColor, ActionListener listener) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setForeground(textColor);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.addActionListener(listener);
        return button;
    }
}
