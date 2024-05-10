package main;

import java.util.ArrayList;

public interface Language {

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
}