package main;

public class German implements Language{

    String titleChineseAnimal = "12 chinesische Tierkreiszeichen";
    String disclaimerChineseAnimal = "Haftungsausschluss: Ziege und Schaf sind in der chinesischen Astrologie austauschbar";
    String descriptionChineseAnimal = "Das Mondneujahr wird seit der Shang-Dynastie seit fast 3.500 Jahren gefeiert. Die Feierlichkeiten beginnen mit dem zweiten Neumond nach der Wintersonnenwende. Das neue Mondjahr steht in engem Zusammenhang mit den chinesischen Tierkreisen und jedes neue Jahr symbolisiert den Übergang von einem Tier zum nächsten." + 
    System.lineSeparator() + "Der Legende nach rief der Jadekaiser alle Tiere zu einem „Großen Rennen“ (oder möglicherweise zu einem Bankett) in seinen Palast und die Reihenfolge, in der sie ankamen, bestimmte den Platz des Tieres im Tierkreis. Mehrere Tiere rannten zum südlichen Himmelstor. Die Gewinner des Tierkreiszeichens sind Ratte, Ochse, Tiger, Drache, Kaninchen, Schlange, Pferd, Ziege, Affe, Hahn, Hund und Schwein.";

    String readAboutZodiacs = "Klicken Sie hier, um mehr über die chinesischen Tierkreiszeichen zu erfahren";
    String findYourZodiac = "Klicken Sie hier, um Ihr Sternzeichen oder das Sternzeichen Ihres Freundes zu finden.";
    String toGoToGame = "Klicken Sie hier, um das Rennspiel zu spielen";

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
}
