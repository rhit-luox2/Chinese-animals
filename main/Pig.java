//Kaila James
package main;

import javax.swing.*;

public class Pig extends AnimalMain{
    
    public Pig(Language myLanguagee, String[] pigInfoArray) {
        super(pigInfoArray[0],pigInfoArray[1],pigInfoArray[2], pigInfoArray[3], pigInfoArray[4], pigInfoArray[5], pigInfoArray[6], pigInfoArray[7], pigInfoArray[8], pigInfoArray[9], pigInfoArray[10], pigInfoArray[11], "picture/piglong.jpg", "picture/squarePig.jpg", 
        myLanguagee);
        
        JFrame frame = new JFrame("pig");
        super.create(frame, panel, myLanguage);

        description(frame, panel);
        description2(frame, panel);
        description3(frame, panel);
    }
}