package main;

public class German implements Language{

    String titleChineseAnimal = "12 chinesische Tierkreiszeichen";
    String disclaimerChineseAnimal = "Haftungsausschluss: Ziege und Schaf sind in der chinesischen Astrologie austauschbar";
    String descriptionChineseAnimal = "Das Mondneujahr wird seit der Shang-Dynastie seit fast 3.500 Jahren gefeiert. Die Feierlichkeiten beginnen mit dem zweiten Neumond nach der Wintersonnenwende. Das neue Mondjahr steht in engem Zusammenhang mit den chinesischen Tierkreisen und jedes neue Jahr symbolisiert den Übergang von einem Tier zum nächsten." + 
    System.lineSeparator() + "Der Legende nach rief der Jadekaiser alle Tiere zu einem „Großen Rennen“ (oder möglicherweise zu einem Bankett) in seinen Palast und die Reihenfolge, in der sie ankamen, bestimmte den Platz des Tieres im Tierkreis. Mehrere Tiere rannten zum südlichen Himmelstor. Die Gewinner des Tierkreiszeichens sind Ratte, Ochse, Tiger, Drache, Kaninchen, Schlange, Pferd, Ziege, Affe, Hahn, Hund und Schwein.";

    String readAboutZodiacs = "Klicken Sie hier, um mehr über die chinesischen Tierkreiszeichen zu erfahren";
    String findYourZodiac = "Klicken Sie hier, um Ihr Sternzeichen oder das Sternzeichen Ihres Freundes zu finden.";
    String toGoToGame = "Klicken Sie hier, um das Rennspiel zu spielen";
    String goBack = "Geh zurück";

    String[] dogInfo = {"Wissenschaftlicher Name: Canis lupus Familiaris", 
"Lebensdauer: Inland 10 - 13 Jahre", "Lebensraum: Überall – Hunde sind sehr anpassungsfähige Tiere und haben sich in sehr unterschiedlichen Umgebungen entwickelt, von der arktischen Tundra bis hin zu tropischen Regenwäldern. Sie können in ländlichen und städtischen Gebieten überleben und sich an nahezu jede Umgebung anpassen. Hunde kommen auf der ganzen Welt vor und die meisten sind domestiziert und können praktisch überall mit geeigneten Ressourcen und Unterkünften leben.", 
"Interessantes am Hund: Im Gegensatz zu den meisten Säugetieren neigen Hunde dazu, auf Zehenspitzen zu laufen, und sie können sowohl mit der rechten als auch mit der linken Pfote laufen.", 
"Wie viele Hunde gibt es auf der Welt? Die Zahl wird auf 900 Millionen geschätzt, wobei China mit 54,29 Millionen die höchste Hundepopulation in Asien hat", 
"Die Geschichte des Hundes: Der Hund liegt im Tierkreis auf Platz 11, und im großen Rennen hätte der Hund schneller sein müssen. Da der Hund ein schneller Läufer und bester Schwimmer war, blieb er stehen, um im Fluss zu spielen, und entschuldigte sich, dass er ein Bad brauchte.", 
"Jahre: 1922, 1934, 1946, 1958, 1970, 1982, 1994, 2006, 2018, 2030", 
"Was sagt das über Sie aus? Menschen, die im Jahr des Hundes geboren wurden, gelten als ehrlich, loyal, glaubensorientiert, klug, offen und herzlich. Sie gelten zudem als hilfsbereit und verfügen über einen ausgeprägten Gerechtigkeitssinn. Einige negative Eigenschaften des Hundes sind wahrscheinlich Selbstgerechtigkeit, Sturheit, Distanziertheit und soziale Schwierigkeiten.", 
"Was sagt Ihr Tier zu Ihrem Erfolg? Hunde sind bei gewöhnlichen Arbeiten gut und werden von Kollegen und Untergebenen freundlich und aufrichtig behandelt. Sie sind außerdem für ihren Gerechtigkeitssinn und ihre Fähigkeit, Respekt zu gewinnen, bekannt. Hunde würden gut als Berater, Priester, Lehrer, Anwälte, Ärzte, Politiker, Philosophen, Krankenschwestern und Schriftsteller funktionieren.", 
"Ihre Kompatibilität mit den anderen Tieren:", "Hund und Tiger: Hunde vertragen sich am besten mit ihren schlagfertigen Artgenossen, und Hunde bringen einen Mangel an Ego in Beziehungen mit sich, und Tiger müssen sie mit der Energie „um jeden Preis beschützen“. Sehr treue Partner und ein großes Gespür für Freundlichkeit und Recht und Unrecht. \nHund und Kaninchen: Kaninchen haben einen eher verspielten Charme, der den Hund dazu bringen soll, sich mehr zu entspannen. Sie bauen Beziehungen normalerweise auf Ehrlichkeit und Anziehung auf. Kaninchen können unsicher sein, aber die Loyalität des Hundes macht die Beziehung zu einem sicheren Ort. \nHund & Pferd: Beide sehr direkt und offenherzig. Sehr ausgeprägte Kommunikationsfähigkeiten und bringen das Beste voneinander zum Vorschein. Der Hund überzeugt das Pferd davon, dass es eher freiheitsorientiert ist, sich niederzulassen. Während der Hund von der aufgeschlossenen Persönlichkeit des Pferdes inspiriert ist.", "Berühmte Persönlichkeiten dieses Sternzeichens: \"Famous people who is this zodiac: Ursula von der Leyen, Anne Hathaway, Michael Jackson, George W. Bush, Zhou Enlai, Winston Churchill, Donald Trump, Elvis Presley, Kim Jong-un, and Nicki Minaj"};
    String[] dragonInfo = {"Wissenschaftlicher Name: N/A", "Lebensdauer: N/A", "Lebensraum: N/A", "Eine interessante Tatsache über Drachen: In China symbolisieren Drachen Reichtum, Macht und Führung, da angenommen wurde, dass chinesische Kaiser Nachkommen von Drachen seien.", "Wie viele Drachen gibt es auf der Welt? N / A", "Die Geschichte des Drachen: Der Drache war das fünfte Tierkreiszeichen. Obwohl es schneller hätte gehen sollen, hatte der Drache bei einem Dorf angehalten, um für Regen zu sorgen, und half dem Kaninchen, indem er ihn ans Ufer blies.", 
"Jahre: 1904, 1916, 1928, 1940, 1952, 1964, 1976, 1988, 2000, 2012, 2024", "Was sagt dieses Sternzeichen über Sie aus? Drachen gelten als mächtig, gutherzig, wohlhabend, mutig, führend und innovativ. Sie können auch prüfend, egoistisch, leicht verärgert und übermütig sein.", "Was sagt Ihr Sternzeichen über Ihren Erfolg aus? Drachen können fast jeden Job mit hoher Kompetenz und Effizienz erledigen. Sie können im wissenschaftlichen oder künstlerischen Bereich erfolgreich sein. Für Drachen werden Jobs im Gesundheitswesen, Unternehmer, Lehrer, Psychologen und Schriftsteller empfohlen",
"Ihre Verträglichkeit mit anderen Tieren:", }

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

    //on all pages
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

    @Override
    public String[] getdogInfo() {
        return dogInfo;
    }
}
