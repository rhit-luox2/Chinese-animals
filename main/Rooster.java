package main;

import javax.swing.*;

public class Rooster extends AnimalMain{
    
    public Rooster(Language myLanguagee, String[] roosterInfoArray) {
        super(roosterInfoArray[0],roosterInfoArray[1],roosterInfoArray[2], roosterInfoArray[3], roosterInfoArray[4], roosterInfoArray[5], roosterInfoArray[6], roosterInfoArray[7], roosterInfoArray[8], roosterInfoArray[9], roosterInfoArray[10], roosterInfoArray[11], "picture/longRooster.jpg", "picture/squareRooster.jpg", 
        myLanguagee);
        
        JFrame frame = new JFrame("rooster");
        super.create(frame, panel, myLanguage);

        description(frame, panel);
        description2(frame, panel);
        description3(frame, panel);
    }
}