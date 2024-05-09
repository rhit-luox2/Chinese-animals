package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectAnimal extends JFrame {

    static JFrame frame;
    Language myLanguage;

    public SelectAnimal(Language myLanguage) {
        this.myLanguage = myLanguage;
    
        JFrame frame = new JFrame("Select Animal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 900);
        frame.setLayout(new BorderLayout());

        JLabel title = new JLabel("Please select an animal that you would like to know about");
        title.setFont(new Font("Arial", Font.BOLD, 18));
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        Color backgroundColor = new Color(233, 197, 105);
        title.setOpaque(true);
        title.setBackground(backgroundColor);

        // Create the grid panel for the buttons
        JPanel panel = new JPanel(new GridLayout(4, 3, 0, 0));
        panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        panel.setBackground(new Color(233, 197, 105));

        String[] animals = { "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Horse",
                "Snake", "Goat", "Monkey", "Rooster", "Dog", "Pig" };
        for (String animalName : animals) {
            JButton animalButton = createAnimalButton(animalName);
            panel.add(animalButton);
        }

        frame.add(title, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    
    @SuppressWarnings("deprecation")
    private static JButton createAnimalButton(String animalName) {
        ImageIcon originalIcon = new ImageIcon("picture/" + animalName + ".PNG");
        Image scaledImage = originalIcon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(scaledImage);

        JButton animalButton = new JButton(icon);
        animalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("main." + animalName).getDeclaredConstructor().newInstance();
                } catch (Exception ex) {
                    ex.printStackTrace();
                    
                }
                
            }
        });
        if (animalButton.action(null, animalButton) == true){ 
            frame.dispose();
        }

        animalButton.setBorder(BorderFactory.createEmptyBorder());
        animalButton.setContentAreaFilled(false);
        animalButton.setPreferredSize(new Dimension(150, 150));
        return animalButton;
        
    }


    public static void main(Language myLanguage) {
        new SelectAnimal(myLanguage);
    }
}
