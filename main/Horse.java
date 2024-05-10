//Kaila James
package main;

import javax.swing.*;

public class Horse extends AnimalMain {

    public Horse(Language myLanguage, String[] horseInfoArray) {
        super(horseInfoArray[0], horseInfoArray[1], horseInfoArray[2], horseInfoArray[3], horseInfoArray[4], horseInfoArray[5], horseInfoArray[6], horseInfoArray[7], horseInfoArray[8], horseInfoArray[9], horseInfoArray[10], horseInfoArray[11], 
        "picture/horselong.jpg", "picture/squareHorse.jpg", myLanguage);
        JFrame frame = new JFrame("Horse");
        super.create(frame, panel, myLanguage);

        description(frame, panel);
        description2(frame, panel);
        description3(frame, panel);
    }
}
