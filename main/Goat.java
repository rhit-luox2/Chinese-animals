//Kaila James
//Liz Purintun
package main;

import javax.swing.*;

public class Goat extends AnimalMain{

    public Goat(Language myLanguage, String[] goatInfoArray) {
        super(goatInfoArray[0], goatInfoArray[1], goatInfoArray[2], goatInfoArray[3], goatInfoArray[4], goatInfoArray[5], goatInfoArray[6], goatInfoArray[7], goatInfoArray[8], goatInfoArray[9], goatInfoArray[10], goatInfoArray[11], 
        "picture/HappyGoat.jpg", "picture/image2Goat.jpg", myLanguage);
        JFrame frame = new JFrame("Goat");
        super.create(frame, panel, myLanguage);

        description(frame, panel);
        description2(frame, panel);
        description3(frame, panel);
    }
    
}