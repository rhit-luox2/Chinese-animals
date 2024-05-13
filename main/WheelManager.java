package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Main Writers: Xiaoxi
// Editor: Liz Purintun
public class WheelManager extends JFrame {

    private JTextField enterYear;
    private JButton getZodiacButton;
    private static final Color backgroundColor = new Color(233, 197, 105);
    private static final Color redColor = new Color(227, 33, 25);
    protected Wheel wheel;
    private JFrame wheelFrame;
    private Timer timer;
    private static Language myLanguage;
    // private SpinningWheelPanel wheelPanel;

    public WheelManager(Language myLanguage) {
        WheelManager.myLanguage = myLanguage;
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
        String titletext = myLanguage.gettitleChineseAnimal();
        JLabel title = new JLabel(titletext);
        title.setFont(new Font("Serif", Font.BOLD, 36));
        title.setForeground(redColor);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(title);

        mainPanel.add(Box.createVerticalStrut(50));

        // Label and Text field
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        inputPanel.setBackground(backgroundColor);
        String enterYeartext = myLanguage.getenterYearWheelManager();
        JLabel labelYear = new JLabel(enterYeartext);
        labelYear.setForeground(redColor);
        labelYear.setFont(new Font("Arial", Font.BOLD, 16));
        enterYear = new JTextField(10);
        inputPanel.add(labelYear);
        inputPanel.add(enterYear);
        mainPanel.add(inputPanel);

        mainPanel.add(Box.createVerticalStrut(20));

        // Button
        String zodiacButtontext = myLanguage.getzodiacButtonWheelManager();
        getZodiacButton = new JButton(zodiacButtontext);
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
                        String zodiac = getZodiacFromAngle(finalAngle, myLanguage);
                        String resulttext = myLanguage.getresultWheelManager();
                        JOptionPane.showMessageDialog(wheelFrame, resulttext + zodiac + "!");
                        navigateToZodiacPage(zodiac.toLowerCase());
                        timer.stop();
                    }
                });

                timer.start();

            } catch (NumberFormatException ex) {
                String invalidtext = myLanguage.getinvalidWheelManager();
                String errortext = myLanguage.geterrorWheelManager();
                JOptionPane.showMessageDialog(wheelFrame, invalidtext, errortext, JOptionPane.ERROR_MESSAGE);
                System.out.println(ex);
            }
        }
    }

    protected static String getZodiacFromAngle(double finalAngle, Language myLanguage) {
        int zodiacIndex = (int) Math.round((Math.toDegrees(finalAngle) - 30) / 30) % 12;
        String[] zodiacs = myLanguage.getanimalListWheelManager();
        return zodiacs[zodiacIndex];
    }

    private void navigateToZodiacPage(String zodiac) {
        try {
            String className = "main.";
            ArrayList<String> animals = myLanguage.getanimalListGame();
            HashMap<String, String> combinedAnimals = myLanguage.getCombinedAnimals();
            System.out.println("zodiac: " + zodiac);
            System.out.println("combgetZ: " + combinedAnimals.get(capitalize(zodiac)));
            if (!myLanguage.getisEnglish()){
                zodiac = combinedAnimals.get(capitalize(zodiac));
                className += zodiac;
            } else {
            // Translate display name to class name
            zodiac = capitalize(zodiac);
            className += zodiac;
            }

            System.out.println("className: " + className);
            Class<?> clazz = Class.forName(className);
            String[] infoArray = getInfoArrayForZodiac(zodiac, myLanguage);

            // Instantiate the class assuming it has a constructor that takes Language and
            // String[]
            JFrame page = (JFrame) clazz.getConstructor(Language.class, String[].class).newInstance(myLanguage,
                    infoArray);
            page.setVisible(true);
            this.dispose();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Zodiac class not found: " + ex.getMessage(), "Class Not Found",
                    JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    // private static final Map<String, String> classNameMap;

    // static {
    //     classNameMap = new HashMap<>();
    //     classNameMap.put("Ratte", "Rat");
    //     classNameMap.put("Ochse", "Ox");
    //     classNameMap.put("Tiger", "Tiger");
    //     classNameMap.put("Kaninchen", "Rabbit");
    //     classNameMap.put("Drache", "Dragon");
    //     classNameMap.put("Schlange", "Snake");
    //     classNameMap.put("Pferd", "Horse");
    //     classNameMap.put("Ziege", "Goat");
    //     classNameMap.put("Affe", "Monkey");
    //     classNameMap.put("Hahn", "Rooster");
    //     classNameMap.put("Hund", "Dog");
    //     classNameMap.put("Schwein", "Pig");
    // }

    private String[] getInfoArrayForZodiac(String zodiac, Language myLanguage) {
        switch (zodiac) {
            case "Rat":
                return myLanguage.getratInfo();
            case "Ox":
                return myLanguage.getoxInfo();
            case "Tiger":
                return myLanguage.gettigerInfo();
            case "Rabbit":
                return myLanguage.getrabbitInfo();
            case "Dragon":
                return myLanguage.getdragonInfo();
            case "Horse":
                return myLanguage.gethorseInfo();
            case "Snake":
                return myLanguage.getsnakeInfo();
            case "Goat":
                return myLanguage.getgoatInfo();
            case "Monkey":
                return myLanguage.getmonkeyInfo();
            case "Rooster":
                return myLanguage.getroosterInfo();
            case "Dog":
                return myLanguage.getdogInfo();
            case "Pig":
                return myLanguage.getpigInfo();
            default:
                return new String[0];
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
                new WheelManager(myLanguage);
            }
        });
    }
}
