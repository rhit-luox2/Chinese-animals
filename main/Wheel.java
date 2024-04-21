package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Wheel {

    private JButton zodiacWheel;
    private String enterYear;


    Wheel(){

        zodiacWheel = new JButton("Get Zodiac");
        zodiacWheel.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            try {
                int userentered = Integer.parseInt(enterYear.getText());
                JOptionPane.showMessageDialog(null, "Entered integer: " + userentered);
    
            }
            catch (NumberFormatException eNumberFormatException){
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter an integer.");
            }
        }
        });

        



    }
    
}
