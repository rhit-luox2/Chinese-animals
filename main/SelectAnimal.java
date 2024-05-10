package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectAnimal extends JFrame {

    static JFrame frame;

    public SelectAnimal(Language myLanguage) {
        System.out.println("Start of Select Animal");
        System.out.println(myLanguage);
        JFrame frame = new JFrame("Select Animal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 900);
        frame.setLayout(new BorderLayout());

        String titleSelectAnimaltext = myLanguage.gettitleSelectanimal();
        JLabel title = new JLabel(titleSelectAnimaltext);
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
        JButton animalButton = new JButton(icon);
        animalButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(animalName == "Rat"){
                    String[] ratInfoArray = myLanguage.getratInfo();
                    new Rat(myLanguage, ratInfoArray);
                }else if(animalName == "Ox"){
                    String[] oxInfoArray = myLanguage.getoxInfo();
                    new Ox(myLanguage, oxInfoArray);
                }else if(animalName == "Tiger"){
                    String[] tigerInfoArray = myLanguage.gettigerInfo();
                    new Tiger(myLanguage, tigerInfoArray);
                }else if(animalName == "Rabbit"){
                    String[] rabbitInfoArray = myLanguage.getrabbitInfo();
                    new Rabbit(myLanguage, rabbitInfoArray);
                }else if(animalName == "Dragon"){
                    String[] dragonInfoArray = myLanguage.getdragonInfo();
                    new Dragon(myLanguage, dragonInfoArray);
                }else if(animalName == "Horse"){
                    String[] horseInfoArray = myLanguage.gethorseInfo();
                    new Horse(myLanguage, horseInfoArray);
                }else if(animalName == "Snake"){
                    String[] snakeInfoArray = myLanguage.getsnakeInfo();
                    new Snake(myLanguage, snakeInfoArray);
                }else if(animalName == "Goat"){
                    String[] goatInfoArray = myLanguage.getgoatInfo();
                    new Goat(myLanguage, goatInfoArray);
                }else if(animalName == "Monkey"){
                    String[] monkeyInfoArray = myLanguage.getmonkeyInfo();
                    new Monkey(myLanguage, monkeyInfoArray);
                }else if(animalName ==  "Rooster"){
                    String[] roosterInfoArray = myLanguage.getroosterInfo();
                    new Rooster(myLanguage, roosterInfoArray);
                }else if(animalName == "Dog"){
                    String[] dogInfoArray = myLanguage.getdogInfo();
                    new Dog(myLanguage, dogInfoArray);
                }else{
                    String[] pigInfoArray = myLanguage.getpigInfo();
                    new Pig(myLanguage, pigInfoArray);
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
