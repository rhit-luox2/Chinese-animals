//Kaila James
package main;

import javax.swing.*;

public class Snake extends AnimalMain{
    
    public Snake(Language myLanguagee, String[] snakeInfoArray) {
        super(snakeInfoArray[0],snakeInfoArray[1],snakeInfoArray[2], snakeInfoArray[3], snakeInfoArray[4], snakeInfoArray[5], snakeInfoArray[6], snakeInfoArray[7], snakeInfoArray[8], snakeInfoArray[9], snakeInfoArray[10], snakeInfoArray[11], "picture/longSnake.jpg", "picture/squareSnake.jpg", 
        myLanguagee);
        
        JFrame frame = new JFrame("snake");
        super.create(frame, panel, myLanguage);

        description(frame, panel);
        description2(frame, panel);
        description3(frame, panel);
    }
}