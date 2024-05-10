//Kaila James
package main;

import javax.swing.*;

public class Ox extends AnimalMain{

    public Ox(Language myLanguagee, String[] oxInfoArray) {
        super(oxInfoArray[0],oxInfoArray[1],oxInfoArray[2], oxInfoArray[3], oxInfoArray[4], oxInfoArray[5], oxInfoArray[6], oxInfoArray[7], oxInfoArray[8], oxInfoArray[9], oxInfoArray[10], oxInfoArray[11], "picture/oxlong.jpg", "picture/squareox.jpg", myLanguagee);
        
        JFrame frame = new JFrame("ox");
        super.create(frame, panel, myLanguage);

        description(frame, panel);
        description2(frame, panel);
        description3(frame, panel);
    }
}