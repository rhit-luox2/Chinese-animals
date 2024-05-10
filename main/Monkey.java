package main;

import javax.swing.*;

public class Monkey extends AnimalMain{


    public Monkey(Language myLanguage, String[] monkeyInfoArray) {
        super(monkeyInfoArray[0], monkeyInfoArray[1], monkeyInfoArray[2], monkeyInfoArray[3], monkeyInfoArray[4], monkeyInfoArray[5], monkeyInfoArray[6], monkeyInfoArray[7], monkeyInfoArray[8], monkeyInfoArray[9], monkeyInfoArray[10], monkeyInfoArray[11], "picture/longMonkey.jpg", "picture/squaredMonkey.jpg", myLanguage);
        JFrame frame = new JFrame("Monkey");

        super.create(frame, panel, myLanguage);

        description(frame, panel);
        description2(frame, panel);
        description3(frame, panel);
    }

}