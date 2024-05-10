//Kaila James
package main;

import javax.swing.*;

public class Dragon extends AnimalMain {

    public Dragon(Language myLanguage, String[] dragonInfoArray) {
        super(dragonInfoArray[0], dragonInfoArray[1], dragonInfoArray[2], dragonInfoArray[3], dragonInfoArray[4], dragonInfoArray[5], dragonInfoArray[6], dragonInfoArray[7],
        dragonInfoArray[8], dragonInfoArray[9], dragonInfoArray[10], dragonInfoArray[11],"picture/longDragon.jpg", "picture/squareDragonPicture.jpg", myLanguage);
        JFrame frame = new JFrame("Dragon");
        super.create(frame, panel, myLanguage);

        description(frame, panel);
        description2(frame, panel);
        description3(frame, panel);
    }
}
