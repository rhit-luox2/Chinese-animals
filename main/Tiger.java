//Kaila James
//Liz Purintun
package main;
import javax.swing.*;

public class Tiger extends AnimalMain{
    
    public Tiger(Language myLanguagee, String[] tigerInfoArray) {
        super(tigerInfoArray[0],tigerInfoArray[1],tigerInfoArray[2], tigerInfoArray[3], tigerInfoArray[4], tigerInfoArray[5], tigerInfoArray[6], tigerInfoArray[7], tigerInfoArray[8], tigerInfoArray[9], tigerInfoArray[10], tigerInfoArray[11], "picture/longTiger.jpg", "picture/squareTiger.jpg", 
        myLanguagee);
        
        JFrame frame = new JFrame("tiger");
        super.create(frame, panel, myLanguage);

        description(frame, panel);
        description2(frame, panel);
        description3(frame, panel);
    }
}