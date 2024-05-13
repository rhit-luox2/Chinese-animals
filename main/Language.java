//Kaila James
package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public interface Language {

    public boolean getisEnglish();
   
    //ChineseAnimal
    public String gettitleChineseAnimal();
    public String getdisclaimerChineseAnimal();
    public String getdescriptionChineseAnimal();

    //will use again
    public String getreadABoutZodiacs();
    public String getfindYourZodiac();
    public String gettoGoToGame();
    public String getgoBack();
    
    //animals' info
    public String[] getdogInfo();
    public String[] getdragonInfo();
    public String[] getgoatInfo();
    public String[] gethorseInfo();
    public String[] getmonkeyInfo();
    public String[] getoxInfo();
    public String[] getpigInfo();
    public String[] getrabbitInfo();
    public String[] getratInfo();
    public String[] getroosterInfo();
    public String[] getsnakeInfo();
    public String[] gettigerInfo();

    //Wheel Manager text
    public String getenterYearWheelManager();
    public String getzodiacButtonWheelManager();
    public String getresultWheelManager();
    public String[] getanimalListWheelManager();
    public String getinvalidWheelManager();
    public String geterrorWheelManager();

    //SelectAnimal
    public String gettitleSelectanimal();

    //Game
    public String getplayer1Game();
    public String getplayer2Game();
    public String getstartRaceGame();
    public String getcomputerWinsGame();
    public String getplayer1WinsGame();
    public String getplayer2WinsGame();
    public String getplayer1ChooseGame();
    public String getplayer2ChooseGame();
    public ArrayList<String> getanimalListGame();
    

    public default  HashMap<String, String> getCombinedAnimals() {
        HashMap<String, String> combinedAnimals = new HashMap<String, String>();
        ArrayList<String> englishAnimals = new ArrayList<>(Arrays.asList("Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"));
        ArrayList<String> germanAnimals = new ArrayList<>(Arrays.asList("Ratte", "Ochse", "Tiger", "Kaninchen", "Drache", "Schlange", "Pferd", "Ziege", "Affe", "Hahn", "Hund", "Schwein"));

        for (int i = 0; i < 12; i++){
            combinedAnimals.put(germanAnimals.get(i), englishAnimals.get(i));
        }
        return combinedAnimals;
    }

}