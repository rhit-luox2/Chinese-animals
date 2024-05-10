package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectAnimal extends JFrame {

    static JFrame frame;
    // static Language myLanguage;

    public SelectAnimal(Language myLanguage) {
        System.out.println("Start of Select Animal");
        System.out.println(myLanguage);
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

        String[] animals = {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Horse",
                "Snake", "Goat", "Monkey", "Rooster", "Dog", "Pig" };
        for (String animalName : animals) {
            // System.out.println("hello" + myLanguage);
            JButton animalButton = createAnimalButton(animalName, myLanguage);
            panel.add(animalButton);
        }

        frame.add(title, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    
    @SuppressWarnings("deprecation")
    private static JButton createAnimalButton(String animalName, Language myLanguage) {
        ImageIcon originalIcon = new ImageIcon("picture/" + animalName + ".PNG");
        Image scaledImage = originalIcon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(scaledImage);
        System.out.println("Start of create Animal");
        System.out.println(myLanguage);
        JButton animalButton = new JButton(icon);
        animalButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Start of action listener");
                System.out.println(myLanguage);
                if(animalName == "Rat"){
                    new Rat(myLanguage);
                }else if(animalName == "Ox"){
                    new Ox(myLanguage);
                }else if(animalName == "Tiger"){
                    new Tiger(myLanguage);
                }else if(animalName == "Rabbit"){
                    new Rabbit(myLanguage);
                }else if(animalName == "Dragon"){
                    new Dragon(myLanguage);
                }else if(animalName == "Horse"){
                    new Horse(myLanguage);
                }else if(animalName == "Snake"){
                    new Snake(myLanguage);
                }else if(animalName == "Goat"){
                    new Goat(myLanguage);
                }else if(animalName == "Monkey"){
                    new Monkey(myLanguage);
                }else if(animalName ==  "Rooster"){
                    new Rooster(myLanguage);
                }else if(animalName == "Dog"){
                    // System.out.println("hello" + myLanguage);
                    String[] dogInfoArray = myLanguage.getdogInfo();
                    System.out.println(dogInfoArray[1]);
                    new Dog(myLanguage, dogInfoArray);
                }else{
                    new Pig(myLanguage);
                }
                frame.dispose();
                
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
