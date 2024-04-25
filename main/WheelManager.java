package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class WheelManager extends JFrame {

    private JTextField enterYear;
    private JButton getZodiacButton;
    private SpinningWheelPanel wheelPanel;
    private Timer spinTimer;
    private final double angleIncrement = 0.3;
    private double currentAngle = 0;
    private double finalAngle;
    private static final Color backgroundColor = new Color(233, 197, 105);
    private static final Color redColor = new Color(227, 33, 25);

    public WheelManager() {
        // Window setup
        setTitle("Find Your Zodiac!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 900);
        setLocationRelativeTo(null);

        // Main panel setup
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.setBackground(backgroundColor);
        getContentPane().add(mainPanel);

        // Arrow symbol
        JLabel arrowLabel = new JLabel("\u25BC");
        arrowLabel.setFont(new Font("SansSerif", Font.BOLD, 24));

        mainPanel.add(arrowLabel);

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

        // Load wheel image and set up the spinning wheel panel
        try {
            BufferedImage wheelImage = ImageIO.read(new File("picture/main1.png"));
            wheelPanel = new SpinningWheelPanel(wheelImage);
            mainPanel.add(wheelPanel);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Failed to load wheel image.", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }

        setVisible(true);
    }

    private class ZodiacActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int year = Integer.parseInt(enterYear.getText().trim());
                finalAngle = calculateFinalAngle(year); // Calculates the final angle based on the zodiac year
                spinWheel();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(WheelManager.this, "Invalid input. Please enter a valid year.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void spinWheel() {
        spinTimer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentAngle < finalAngle) {
                    currentAngle += angleIncrement;
                    if (currentAngle > finalAngle) {
                        currentAngle = finalAngle;
                        spinTimer.stop();
                        String zodiac = getZodiacFromAngle(finalAngle);
                        JOptionPane.showMessageDialog(WheelManager.this, "You are the " + zodiac + "!");
                        navigateToZodiacPage(zodiac.toLowerCase());
                    }
                    wheelPanel.setAngle(currentAngle);
                }
            }
        });
        spinTimer.start();
    }

    private String getZodiacFromAngle(double finalAngle) {
        // This will convert the final angle to the zodiac index
        int zodiacIndex = (int) Math.round((360 - finalAngle) / 30) % 12;
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
        } catch (Exception ex) {
        }
    }

    private String capitalize(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    private double calculateFinalAngle(int year) {
        int yearDifference = (year - 1984) % 12;
        if (yearDifference < 0) {
            yearDifference += 12;
        }
        return (360.0 - ((yearDifference) * 30.0)) % 360;
    }

    private void styleButton(JButton button, Color textColor) {
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setForeground(textColor);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    private class SpinningWheelPanel extends JPanel {
        private final BufferedImage wheelImage;
        private double angle;

        public SpinningWheelPanel(BufferedImage wheelImage) {
            this.wheelImage = wheelImage;
            setPreferredSize(new Dimension(wheelImage.getWidth(), wheelImage.getHeight()));
            setBackground(Color.BLACK);
        }

        public void setAngle(double angle) {
            this.angle = angle;
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            int x = (getWidth() - wheelImage.getWidth()) / 2;
            int y = (getHeight() - wheelImage.getHeight()) / 2;
            AffineTransform at = AffineTransform.getRotateInstance(Math.toRadians(angle),
                    x + wheelImage.getWidth() / 2.0, y + wheelImage.getHeight() / 2.0);
            at.translate(x, y);
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.drawImage(wheelImage, at, this);
            g2d.dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new WheelManager();
            }
        });
    }
}
