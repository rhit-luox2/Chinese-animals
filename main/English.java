package main;

public class English implements Language{

    String titleChineseAnimal = "12 Chinese Zodiacs";
    String disclaimerChineseAnimal = "Disclaimer: Goat and Sheep are interchangeable in Chinese astrology";
    String descriptionChineseAnimal = "The Lunar New Year has been celebrated for almost 3,500 years starting in the Shang Dynasty. "
    + "Celebrations begin with the second new moon after the winter solstice. The Lunar New Year is heavily correlated with "
    + "Chinese zodiacs and each new year symbolizes the transition from one animal to the next."
    + System.lineSeparator()
    + "Legend has it that the Jade Emperor summoned all the animals to his palace in a “Great Race” (or possibly for a banquet), and the order in which they arrived determined the animal’s place in the zodiac. Several animals raced to the Southern Heavenly Gate. The zodiac winners are Rat, Ox, Tiger, Dragon, Rabbit, Snake, Horse, Goat, Monkey, Rooster, Dog, and Pig.";

    String readAboutZodiacs = "Click here to read about the Chinese zodiacs";
    String findYourZodiac = "Click here to find your zodiac or your friend's zodiac";
    String toGoToGame = "Click here to race your friends in the Great Race";
    String goBack = "Go back";

    //ChineseAnimal
    @Override
    public String gettitleChineseAnimal() {
        return titleChineseAnimal;
    }
    @Override
    public String getdisclaimerChineseAnimal() {
        return disclaimerChineseAnimal;
    }
    @Override
    public String getdescriptionChineseAnimal() {
        return descriptionChineseAnimal;
    }

    //will use on all pages
    @Override
    public String getreadABoutZodiacs() {
        return readAboutZodiacs;
    }
    @Override
    public String getfindYourZodiac() {
        return findYourZodiac;
    }
    @Override
    public String gettoGoToGame() {
        return toGoToGame;
    }
    @Override
    public String getgoBack() {
        return goBack;
    }
}
