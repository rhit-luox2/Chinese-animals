//Kaila James
package main;

import javax.swing.*;

public class Dog extends AnimalMain{
    
    public Dog(Language myLanguagee, String[] dogInfoArray) {
        super(dogInfoArray[0],dogInfoArray[1],dogInfoArray[2], dogInfoArray[3], dogInfoArray[4], dogInfoArray[5], dogInfoArray[6], dogInfoArray[7], 
        dogInfoArray[8], dogInfoArray[9], dogInfoArray[10], dogInfoArray[11], "picture/longdogimage.jpg", "picture/squaredDog.jpg", 
        myLanguagee);
        
        JFrame frame = new JFrame("Dog");
        super.create(frame, panel, myLanguage);

        description(frame, panel);
        description2(frame, panel);
        description3(frame, panel);
    }
}