package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WheelManager extends JFrame {

    private JTextField enterYear;
    private JButton getZodiacButton;
    private static final Color backgroundColor = new Color(233, 197, 105);
    private static final Color redColor = new Color(227, 33, 25);
    protected Wheel wheel;
    private JFrame wheelFrame;
    private Timer timer;
    //private SpinningWheelPanel wheelPanel;

    public WheelManager() {
        // Window setup
        wheelFrame = new JFrame();
        wheelFrame.setTitle("Find Your Zodiac!");
        wheelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wheelFrame.setSize(600, 900);
        wheelFrame.setLocationRelativeTo(null);
        wheelFrame.setVisible(true);

        // Main panel setup
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.setBackground(backgroundColor);
        wheelFrame.add(mainPanel);

        // Setting Title.
        JLabel title = new JLabel("Find Your Zodiac!");
        title.setFont(new Font("Serif", Font.BOLD, 36));
        title.setForeground(redColor);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(title);

        mainPanel.add(Box.createVerticalStrut(50));

        // Label and Text field
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        inputPanel.setBackground(backgroundColor);
        JLabel labelYear = new JLabel("Enter the Year You Were Born:");
        labelYear.setForeground(redColor);
        labelYear.setFont(new Font("Arial", Font.BOLD, 16));
        enterYear = new JTextField(10);
        inputPanel.add(labelYear);
        inputPanel.add(enterYear);
        mainPanel.add(inputPanel);

        mainPanel.add(Box.createVerticalStrut(20));

        // Button
        getZodiacButton = new JButton("Get Zodiac");
        styleButton(getZodiacButton, redColor);
        getZodiacButton.addActionListener(new ZodiacActionListener());
        inputPanel.add(getZodiacButton);
        mainPanel.add(getZodiacButton);

        // Arrow symbol
        JLabel arrowLabel = new JLabel("\u25BC");
        arrowLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        arrowLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(arrowLabel);

        wheel = new Wheel();
        mainPanel.add(wheel.wheelPanel);

    }


    private class ZodiacActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int year = Integer.parseInt(enterYear.getText().trim());
                double finalAngle = wheel.calculateFinalAngle(year);
                wheel.spinWheel(year);
                timer = new Timer(6700, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String zodiac = getZodiacFromAngle(finalAngle);
                        JOptionPane.showMessageDialog(wheelFrame, "Your Chinese zoidac is " + zodiac + "!");
                        navigateToZodiacPage(zodiac.toLowerCase());
                        timer.stop();
                        }
                    
                });
                

                timer.start();

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(wheelFrame, "Invalid input. Please enter a valid year.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                System.out.println(ex);
            }
        }
    }

    protected String getZodiacFromAngle(double finalAngle) {
        int zodiacIndex = (int) Math.round((Math.toDegrees(finalAngle) - 30)  / 30) % 12;
        String[] zodiacs = { "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster",
                "Dog", "Pig" };
        return zodiacs[zodiacIndex];
    }

    private void navigateToZodiacPage(String zodiac) {
        try {
            // Construct the full class name and attempt to load the class
            String className = "main." + capitalize(zodiac);
            Class<?> clazz = Class.forName(className);

            // Instantiate the class assuming it is a JFrame
            JFrame page = (JFrame) clazz.newInstance();

            // Display the new page and dispose of the current window
            page.setVisible(true);
            this.dispose();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Zodiac class not found: " + ex.getMessage(),
                    "Class Not Found", JOptionPane.ERROR_MESSAGE);
                    System.out.println(ex);

        } catch (Exception ex) {
            System.out.println(ex);

        }
    }

    private String capitalize(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    private void styleButton(JButton button, Color textColor) {
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setForeground(textColor);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new WheelManager();
            }
        });
    }
}
