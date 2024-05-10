//Kaila James
package main;

import javax.swing.*;

public class Rat extends AnimalMain{
    
    public Rat(Language myLanguagee, String[] ratInfoArray) {
        super(ratInfoArray[0],ratInfoArray[1],ratInfoArray[2], ratInfoArray[3], ratInfoArray[4], ratInfoArray[5], ratInfoArray[6], ratInfoArray[7], ratInfoArray[8], ratInfoArray[9], ratInfoArray[10], ratInfoArray[11], "picture/longRat.jpg", "picture/squareRat.jpg", 
        myLanguagee);
        
        JFrame frame = new JFrame("rat");
        super.create(frame, panel, myLanguage);

        description(frame, panel);
        description2(frame, panel);
        description3(frame, panel);
    }
}