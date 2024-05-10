package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChineseAnimal extends JFrame {

    static JFrame frame;
    Language myLanguage;

    public static void main(Language myLanguage) {
        new ChineseAnimal(myLanguage);
        // GermanFlag pictureFrame = new GermanFlag();
        // pictureFrame.setVisible(true);
    }

    public ChineseAnimal(Language myLanguage) {
        this.myLanguage = myLanguage;
        // Initialize Main Page
        String hello = myLanguage.gettitleChineseAnimal();
        JFrame frame = new JFrame(hello);
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
        JLabel title = new JLabel(hello);
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
        String disclaimertext = myLanguage.getdisclaimerChineseAnimal();
        JLabel disclaimer = new JLabel();
        disclaimer.setText(disclaimertext);
        disclaimer.setFont(new Font("Serif", Font.BOLD, 14));
        disclaimer.setForeground(redColor);
        disclaimer.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(disclaimer);

        // Adds Text Box
        panel.add(Box.createVerticalStrut(20)); // Space between image and text box

        String descriptiontext = myLanguage.getdescriptionChineseAnimal();
        JTextArea description = new JTextArea();
        description.setText(descriptiontext);
        description.setFont(new Font("Serif", Font.ITALIC, 16));
        description.setWrapStyleWord(true);
        description.setLineWrap(true);
        description.setOpaque(false);
        description.setEditable(false);
        description.setAlignmentX(Component.CENTER_ALIGNMENT);
        description.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(description);

        String readAboutZodiacstext = myLanguage.getreadABoutZodiacs();
        JButton learnMoreButton = createButton(readAboutZodiacstext, redColor,
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Learn More button clicked");
                        new SelectAnimal(myLanguage);
                        frame.dispose();
                    }
                });
        panel.add(learnMoreButton);

        String findYourZodiactext = myLanguage.getfindYourZodiac();
        JButton findyourZod = createButton(findYourZodiactext, redColor,
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Find Your Zodiac button clicked");
                        new WheelManager(myLanguage);
                        frame.dispose();
                    }
                });
        panel.add(findyourZod);

        String toGoToGametext = myLanguage.gettoGoToGame();
        JButton gameButton = createButton(toGoToGametext, redColor,
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Game button clicked");
                        Game Game = new Game(myLanguage);
                        Game.main(null);
                        frame.dispose();
                    }
                });
        panel.add(gameButton);

        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        frame.add(scrollPane);
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