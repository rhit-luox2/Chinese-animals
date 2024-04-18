package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class SelectAnimal extends JFrame {

    public SelectAnimal() {
        JFrame frame = new JFrame("Select Animal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 1200);

        JPanel panel = new JPanel(new GridLayout(4, 3, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setBackground(new Color(233, 197, 105));

        // JLabel title = new JLabel("Please select an animal that you would like to
        // know about");
        // title.setFont(new Font("Arial", Font.BOLD, 24));
        // title.setAlignmentX(Component.CENTER_ALIGNMENT);
        // title.setBorder(new EmptyBorder(10, 0, 20, 0));
        // panel.add(title);

        frame.add(panel);

        String[] animals = { "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Horse", "Snake", "Goat", "Monkey", "Rooster",
                "Dog", "Pig" };
        for (String animalName : animals) {
            JButton animalButton = createAnimalButton(animalName);
            panel.add(animalButton);
        }

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    private JButton createAnimalButton(String animalName) {
        ImageIcon icon = new ImageIcon("picture/" + animalName + ".PNG");
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
        animalButton.setBorder(BorderFactory.createEmptyBorder());
        animalButton.setContentAreaFilled(false);
        animalButton.setPreferredSize(new Dimension(120, 120));
        return animalButton;
    }

    public static void main(String[] args) {
        new SelectAnimal();
    }
}
