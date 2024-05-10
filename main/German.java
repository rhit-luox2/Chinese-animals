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
"Ihre Verträglichkeit mit anderen Tieren:", "Drache und Ratte: Wertschätzen die Eigenschaften des anderen trotz der Unterschiede. \nDrache und Affe: Sie holen das Beste aus einander heraus und bringen Leidenschaft und Humor in Einklang. \nDrache und Hahn: Zielstrebig und geradlinig wissen beide, was sie wollen.", "Berühmte Personen: Ruth Westheimer, John Lennon, Bruce Lee, Rihanna, Martin Luther King Jr., Wladimir Putin, Shakira, Jeb Bush, Christian Dior, Robert Oppenheimer, Shirley Temple, Adele, Dr. Seuss, Sandra Bullock, and Alexei Nikolaevich"};
    String[] goatInfo = {"Wissenschaftlicher Name: Capra hircus", 
    "Lebensdauer: bis zu 18 Jahre", 
    "Lebensraum: Ziegen werden seit vielen Jahren domestiziert und von Menschen typischerweise für Handarbeit, Milch und Fell verwendet. Sie sind ausgezeichnete Kletterer und können praktisch in jedem Klima außer extremen Temperaturen überleben, bevorzugen aber Grasflächen und ziehen in Herden. Sie kommen typischerweise in Asien, Nordamerika und Teilen Europas vor.", 
    "Eine interessante Tatsache über die Ziege: Es gab eine Studie der Queen Mary University in London, in der sie herausfanden, dass Ziegen Menschen um Hilfe bitten, wenn sie eine Aufgabe nicht erledigen können. Sie gaben Ziegen eine Schachtel mit einem Leckerli darin und als die Ziege die Schachtel nicht öffnen konnte, brachten sie sie zu den Forschern, damit diese den Deckel öffneten.",
    "Wie viele Ziegen gibt es auf der Welt? rund eine Milliarde Ziegen", 
    "Die Geschichte der Ziege: Die Ziege belegte im Tierkreisrennen den 8. Platz. Der Hahn, der Affe und die Ziege hatten den Plan, ein Floß zu ziehen, um über den Fluss zu gelangen.", 
"Jahre: 1907, 1919, 1931, 1943, 1955, 1967, 1979, 1991, 2003, 2015, 2027", 
"Was sagt dieses Sternzeichen über Sie aus? Ziegen sind typischerweise höflich, schüchtern, sanftmütig und visionär. Allerdings können Ziegen pessimistisch und unrealistisch sein und sich stur verhalten. Sie neigen dazu, eine hohe Ausdauer zu haben und werden von den Menschen um sie herum sehr motiviert. Sie sind ideale Innovatoren, kreativ und mitfühlend.", 
"Was sagt Ihr Tier zu Ihrem Erfolg? Obwohl Ziegen als schüchtern und weiblicher gelten. Sie sind sehr charmant, anmutig und talentiert in Kunst und Musik. Geeignete Berufe wären Medizin, Philanthropologie, Künstler, Schriftsteller, Tänzer, Philosophen, Lehrer, Krankenschwestern, Servicekräfte und Verkäufer.", 
"Ihre Kompatibilität mit den anderen Tieren:", 
"Ziege und Kaninchen: Beide gehen sehr aufmerksam auf die Wünsche des anderen ein. Schafe sind sehr romantisch, Kaninchen sind sehr nachdenklich und neigen dazu, einander gut zu ergänzen. Kaninchen neigen dazu, vorauszuschauen und zu planen, während Schafe große Angst vor dem haben, was kommen könnte. Ziegen sind sehr bereit, ihre vielen Träume zu verwirklichen, und Kaninchen sind vorsichtiger und kalkulierter. Beide erkennen die Fehler des anderen und finden Wege, trotzdem miteinander auszukommen. \nZiege und Schwein: Die Ziege und das Schwein haben eine sehr ausgeglichene, lustige und liebevolle Beziehung. Obwohl die Ziege impulsiv ist, gibt das Schwein der Ziege Halt. Das Schwein ist in der Regel der Organisator der Beziehung, während die Ziege mit ihrer Kreativität und Bereicherung beiträgt. Sie mögen zwischen Struktur und Freiheit streiten, neigen aber dazu, gemeinsame Werte zu teilen, die ihre Beziehung festigen. \nZiege und Pferd: Ziegen sind sentimental und freundlich; Sie neigen auch dazu, eifersüchtig zu sein. Pferde sind jedoch sehr ruhig und können das Interesse der Ziege wecken. Als Freunde passen sie am besten zusammen, was ihre Beziehung als Paar stärkt. Das Einzige, was empfohlen wird, ist, dass sie in ihrer Beziehung unabhängig sein und aufgeschlossen sein müssen.", 
"Berühmte Persönlichkeiten dieses Sternzeichens: Claus von Stauffenberg, Steve Jobs, George Harrison, Bruce Willis, Bill Gates, Kurt Cobain, Billie Jean King, Tita Moerno, Mikhail Gorachev, Olivia Rodrigo, Julia Roberts, John Wayne, Mick Jagger und Ed Sheeran"};
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

    //animals' info
    @Override
    public String[] getdogInfo() {
        return dogInfo;
    }
    @Override
    public String[] getdragonInfo() {
        return dragonInfo;
    }
    @Override
    public String[] getgoatInfo() {
        return goatInfo;
    }
}
