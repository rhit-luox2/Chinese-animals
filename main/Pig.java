package main;

import javax.swing.*;

public class Pig extends AnimalMain{

    public Pig() {
        super("Scientific name: Sus scrofa domesticus", "Lifespan: 15 years")
        JFrame frame = new JFrame("Pig");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 900);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        Color backgroundColor = new Color(233, 197, 105);
        panel.setBackground(backgroundColor);

        panel.add(Box.createVerticalStrut(20));

        // Add text areas with various details about the Pig zodiac
        addTextAreas(panel);

        // Add Return Button
        JButton returnButton = createReturnButton();
        panel.add(returnButton);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void addTextAreas(JPanel panel) {
        String infoText = "Scientific name: Sus scrofa domesticus" + System.lineSeparator() +
                "Lifespan: 15 years" + System.lineSeparator() +
                "Habitat: Pigs can live in a wide variety of habitats including pastures, farmland, forests, grasslands, wetlands, savannas, and even remote islands."
                + System.lineSeparator() +
                "One interesting thing about pigs: They are highly intelligent, ranking among the top 4 to 7 most intelligent animals on Earth."
                + System.lineSeparator() +
                "How many pigs are there in the world? About 778.64 million";
        JTextArea description = new JTextArea(infoText);
        configureTextArea(description);
        panel.add(description);

        String storyText = "The story of the pig: The pig became the last zodiac sign after it struggled to reach the Heavenly Southern Gate, overcoming many obstacles on its long journey."
                + System.lineSeparator() +
                "Years: 1923, 1935, 1947, 1959, 1971, 1983, 1995, 2007, 2019, 2031, 2043" + System.lineSeparator() +
                "What does this say about you? Pigs are diligent, upright, compassionate, and responsible."
                + System.lineSeparator() +
                "What does it say about your success? Pigs excel in public service, education, and the arts, but are less suited for competitive industries.";
        JTextArea description2 = new JTextArea(storyText);
        configureTextArea(description2);
        panel.add(description2);

        String famousText = "Famous people of this zodiac: Ronald Reagan, Woody Allen, Arnold Schwarzenegger, Hillary Clinton, Mariah Carey, Kendall Jenner";
        JTextArea description3 = new JTextArea(famousText);
        configureTextArea(description3);
        panel.add(description3);
    }

    private JButton createReturnButton() {
        JButton returnButton = new JButton("Return to Animal Selection");
        returnButton.setFont(new Font("Arial", Font.BOLD, 14));
        returnButton.setForeground(new Color(227, 33, 25));
        returnButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SelectAnimal selectAnimal = new SelectAnimal();
                selectAnimal.setVisible(true);
            }
        });
        return returnButton;
    }

    private void configureTextArea(JTextArea textArea) {
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        textArea.setOpaque(false);
        textArea.setEditable(false);
        textArea.setAlignmentX(Component.CENTER_ALIGNMENT);
        textArea.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        textArea.setFont(new Font("Serif", Font.ITALIC, 16));
    }

    public static void main(String[] args) {
        new Pig();
    }
}
