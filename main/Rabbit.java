//Kaila James
package main;

import javax.swing.*;

public class Rabbit extends AnimalMain{
    
    public Rabbit(Language myLanguagee, String[] rabbitInfoArray) {
        super(rabbitInfoArray[0],rabbitInfoArray[1],rabbitInfoArray[2], rabbitInfoArray[3], rabbitInfoArray[4], rabbitInfoArray[5], rabbitInfoArray[6], rabbitInfoArray[7], rabbitInfoArray[8], rabbitInfoArray[9], rabbitInfoArray[10], rabbitInfoArray[11], "picture/longRabbit.jpg", "picture/squareRabbit.jpg", 
        myLanguagee);
        
        JFrame frame = new JFrame("rabbit");
        super.create(frame, panel, myLanguage);

        description(frame, panel);
        description2(frame, panel);
        description3(frame, panel);
    }
}