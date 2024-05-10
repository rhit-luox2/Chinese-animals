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
    String[] horseInfo = {"Wissenschaftlicher Name: Equus ferus caballus", "Lebensdauer: 30 Jahre", "Lebensraum: Variiert von Grasland über Wälder, Berge, Feuchtgebiete, Wüsten, Tundra, Savannen, Küstenregionen, Steppen und mehr.", "Eine interessante Sache über Pferde: Sie waren das häufigste Transportmittel in alten Gesellschaften und gelten als eines der sechs wichtigsten Tiere in China.", 
"Wie viele Pferde gibt es auf der Welt? Ungefähr 60 Millionen", "Die Geschichte des Pferdes: Der Legende nach hatte das Pferd in der Antike Flügel und wurde „Heiliges Pferd“ genannt, das auf dem Boden laufen, schwimmen und fliegen konnte. Aufgrund seiner Arroganz befahl der Jadekaiser, ihm die Flügel abzuschneiden und begrub ihn unter dem Kunlun-Berg. Der menschliche Vorfahre Ren Zu befreite es später und das Pferd widmete sein Leben dem Dienst an den Menschen.", 
"Jahre: 1918, 1930, 1942, 1954, 1966, 1978, 1990, 2002, 2014, 2026", "Was sagt das über Sie aus? Pferde sind fröhlich, enthusiastisch, einsichtig und rücksichtsvoll.", "Was sagt es über Ihren Erfolg aus? Die Pferde haben eine schnelle Auffassungsgabe und ein gutes Urteilsvermögen, was ihnen hilft, einige Karrierechancen zu eröffnen. Eine impulsive Persönlichkeit kann jedoch dazu führen, dass sie Rückschläge und Misserfolge erleiden. Wenn die Pferde ihre Willenskraft stärken und nicht auf halbem Weg aufgeben, können sie außergewöhnliche Erfolge erzielen. Die Pferde sind aktiv und lieben es, die Welt zu erkunden, daher sind Abenteurer und Reiseleiter geeignete Berufe für sie. Und sie können in Berufen wie Schriftstellern, Geschäftsleuten und Künstlern immer gute Leistungen erbringen und ihre Talente ohne Einschränkungen unter Beweis stellen.",
"Ihre Verträglichkeit mit anderen Tieren:", "Pferd & Tiger: Ihr seid beide aufgeschlossen, kommunikationsstark und ausgelassen. Tiger sind rücksichtsvoll und charmant, und Pferde gleichen das gut aus, weil sie tugendhaft und freundlich sind. \nPferd und Schafe: Ziegen sind sentimental und freundlich; Sie neigen auch dazu, eifersüchtig zu sein. Pferde sind jedoch sehr ruhig und können das Interesse der Ziege wecken. Als Freunde passen sie am besten zusammen, was ihre Beziehung als Paar stärkt. Das Einzige, was empfohlen wird, ist, dass sie in ihrer Beziehung unabhängig sein und aufgeschlossen sein müssen. \nPferd & Kaninchen: Pferde und Kaninchen sind Gegensätze. Um gut zusammenzuarbeiten, müssen sie kompromissbereit sein. Ihre Kompatibilität ist ihr unbewusstes Bedürfnis nacheinander. Beispielsweise fühlen sich die freundlichen, vorsichtigen Kaninchen zu den resoluten, hitzigen Pferden hingezogen. Ihre Verträglichkeit hängt vom Geschlecht von Pferd und Kaninchen ab.", 
"Berühmte Persönlichkeiten dieses Sternzeichens: Paul McCartney, Angela Merkel, Jackie Chan, Kobe Bryant, Kristen Stewart und Greta Thunberg"};
    String[] monkeyInfo = {"Wissenschaftlicher Name: Ceropothecidae", "Lebensdauer: bis zu 40 Jahre", "Lebensraum: Regenwald – auf fast allen Kontinenten", "Eine interessante Sache über Affen: Affen sind hochintelligente Säugetiere. Sie verstehen Zahlen und können zählen. In seltenen Fällen können sie sich vermehren.", "Wie viele Affen gibt es auf der Welt? 505 bekannte Arten", "Die Geschichte des Affen: Der Affe ist das neunte Tier des chinesischen Sternzeichens. Obwohl der Affe ein gewöhnliches Tier ist, konnte er am Großen Rennen teilnehmen, weil der Tiger dem Affen einen Gefallen schuldete, weil er ihm das Leben rettete. Der Tigerkönig war jedoch unglücklich darüber, dass er mit einem gewöhnlichen Affen verglichen wurde. Seitdem sind die beiden unvereinbar. Während des Rennens belegte der Affe den neunten Platz.", "ahre: 1956, 1968, 1980, 1992, 2004, 2016, 2028, 2040",
"Was sagt dieses Sternzeichen über Sie aus? Menschen, die im Jahr des Affen geboren wurden, neigen dazu, kontaktfreudig, vorausschauend und erfinderisch zu sein. Affenpersönlichkeiten sind kreativ und unberechenbar. Sie sind von Natur aus scharfsinnig und es macht Spaß, mit ihnen zusammen zu sein. Eine Schwäche der Ratten besteht darin, dass sie bei allem, was Anstrengung erfordert, keine Geduld haben.", "Was sagt Ihr Sternzeichen über Ihren Erfolg aus? Affen können in den Bereichen Sport und Unterhaltung sowie in jeder Karriere erfolgreich sein, in der es darum geht, komplizierte Probleme zu lösen, beispielsweise als Detektiv oder Anwalt.", "Ihre Kompatibilität mit den anderen Tieren:", "Affe und Ratte: Sie verstehen sich gegenseitig und unterstützen sich gegenseitig. Dieses Maß an Unterstützung ist die Lösung, wenn Konflikte auftreten. \nAffe & Hund: Ihr geht beide respektvoll miteinander um und kennt die Bedürfnisse des anderen. Dieses Paar ist reif und kann gut mit Konflikten umgehen. \nAffe und Drache: Sie beide verstehen, wie wichtig es ist, einander zu schätzen und eine Bindung zueinander aufzubauen. Sie wissen, wie man miteinander arbeitet, sodass Sie lernen und sich gegenseitig helfen können, weil Sie sowohl ehrgeizig als auch positiv sind.", 
"Berühmte Persönlichkeiten dieses Sternzeichens: Franz Kafka, Oskar Schindler, Christina Aguilera, Celine Dion, Will Smith, Jennifer Aniston und Tom Hanks"};
    String[] oxInfo = {"Wissenschaftlicher Name: Bos taurus", "Lebensdauer: ca. 15 Jahre", "Lebensraum: Nordamerika, Europa, Asien und Afrika; keine Wildochsen in Südamerika und Australien", "Eine interessante Sache an Ochsen ist: Ochsen werden seit über 6.000 Jahren domestiziert und für landwirtschaftliche Zwecke genutzt.", "Wie viele Ochsen gibt es auf der Welt? Ungefähr 300 bis 400 Millionen", "Die Geschichte des Ochsen: Der Ochse steht an zweiter Stelle unter den chinesischen Tierkreiszeichen, weil er der Ratte half, später aber von ihr ausgetrickst wurde. Der Mythos besagt, dass der Jadekaiser erklärte, dass die Reihenfolge der Tierkreiszeichen auf der Ankunftsreihenfolge von 12 Tieren basieren würde. Ox hätte zuerst ankommen können, nahm aber freundlicherweise Rat mit. Als Rat jedoch ankam, sprang er knapp vor Ox zur Endstation und so verlor Ox den ersten Platz.", "Jahre: 1913, 1925, 1937, 1949, 1961, 1973, 1985, 1997, 2009, 2021, 2033", 
"Was sagt das über Sie aus? Ochsen sind treu, zuvorkommend, ausdauernd und mitfühlend", "Was sagt es über Ihren Erfolg aus? Ochsen sind typische Realisten, aufrecht und einfach, geeignet für Rollen wie Anwälte, Berater, Ärzte und Techniker.", "Ihre Kompatibilität mit den anderen Tieren:", "Ochse und Ratte: Ihr seid beide bereit, die familiären Pflichten zu teilen. Sie wissen, wie Sie mit Ihren komplementären Charakteren zusammenarbeiten, um sich gegenseitig bei der Arbeit, im Beruf und im Privatleben zu unterstützen. \nOchse & Schlange: Ihre Verträglichkeit gilt als hervorragend, da sie ähnliche Vorlieben haben. Dadurch können sie zusammenarbeiten und sich gut verstehen. Die Spontaneität der Schlange kann den rationalen und akribischen Ochsen inspirieren. \nOchse & Hahn: Beide Tiere denken gerne über langfristige Ziele nach. Sie haben auch materialistische Ziele, auf die sie gerne hinarbeiten, da sie beide fleißige Tierkreistiere sind.", "Berühmte Persönlichkeiten dieses Tierkreises: Lothar Mattaus, Walt Disney, Margaret Thatcher, Diana Spencer, Barack Obama und Bruno Mars"};
    String[] pigInfo = {"Wissenschaftlicher Name: Sus scrofa Domesticus",
    "Lebensdauer: 15 Jahre",
    "Lebensraum: Schweine sind anpassungsfähige Tiere, die in den unterschiedlichsten. Lebensräumen leben können. Sie können Weiden, Ackerland, Wälder, Buschland, Grasland, Feuchtgebiete, Savannen und sogar abgelegene Inseln besiedeln.",
    "Eine interessante Sache über Schweine: Schweine sind hochintelligent und rangieren regelmäßig unter den Top 4 und Top 7 der intelligentesten Tiere der Erde.",
    "Wie viele Schweine gibt es auf der Welt? etwa 778,64 Millionen",
    "Die Geschichte des Schweins: Aufgrund seiner Bemühungen wurde das Schwein zum chinesischen Sternzeichen gewählt. Der Jadekaiser legte fest, dass die ersten am Wettkampftag eingetroffenen Tiere als Tierkreiszeichen ausgewählt würden. Das Schwein wusste, dass es schwer war und ging langsam, also stand es um Mitternacht auf, um sich aufzustellen. Allerdings stieß das Schwein auf der langen Reise auf viele Hindernisse; es nahm seine ganze Kraft auf und kroch zum Himmlischen Südtor hinauf. Der Wettbewerb war vorbei und das Schwein hatte Mühe zu betteln, andere Haustiere flehten ebenfalls darum. Schließlich wurde der Gott bewegt und hereingelassen, so dass das Schwein zum letzten Sternzeichen wurde. Auf diese Weise wurden alle sechs Haustiere, nämlich Pferd, Ochse, Schaf, Hahn, Hund und Schwein, zu chinesischen Tierkreiszeichen.", 
"Jahre: 1923, 1935, 1947, 1959, 1971, 1983, 1995, 2007, 2019, 2031, 2043",
"Was sagt das über Sie aus? Schweine sind fleißig, aufrecht, mitfühlend und verantwortungsbewusst.",
"Das chinesische Tierkreiszeichen Schwein ist immer friedlicher und aufrechter, was bedeutet, dass das Schwein nicht für die Entwicklung in wettbewerbsintensiven Branchen wie Finanzen und Handel geeignet ist. Stattdessen können sie im öffentlichen Dienst gute Leistungen erbringen, indem sie gute Lehrer oder Beamte sind. Schweine haben außerdem einen starken Wissensdurst und wurden mit einer Leidenschaft für Wissenschaft und Kunst geboren, sodass Professoren und Künstler geeignete Berufe für sie sind. Nicht zuletzt lieben sie die Natur und arbeiten gerne mit Tieren und Pflanzen.",
"Ihre Kompatibilität mit den anderen Tieren:",
"Was sagt es über Ihren Erfolg aus? Schwein und Tiger: Ihr seid beide sehr ermutigend und äußerst loyal und hingebungsvoll. Auch wenn Sie vielleicht unterschiedlich sind, bewundern Sie beide die Qualitäten Ihres Partners. \nSchwein und Kaninchen: Die Persönlichkeit des Schweins passt gut zur Persönlichkeit des Kaninchens. Kaninchen schätzen die Einfachheit und Ehrlichkeit des Schweins. \nSchwein und Schaf: Das Schaf und das Schwein haben eine sehr ausgeglichene, lustige und liebevolle Beziehung. Obwohl das Schaf impulsiv ist, gibt das Schwein dem Schaf Halt. Das Schwein ist typischerweise der Organisator der Beziehung, während die Schafe mit ihrer Kreativität und Bereicherung beitragen. Sie mögen zwischen Struktur und Freiheit streiten, neigen aber dazu, gemeinsame Werte zu teilen, die ihre Beziehung festigen.",
"Berühmte Persönlichkeiten dieses Sternzeichens: Nicole Brown Simpson, Ronald Reagan, Woody Allen, Arnold Schwarzenegger, Hillary Clinton, Mariah Carey und Kendall Jenner"};
    String[] rabbitInfo = {"Wissenschaftlicher Name: Oryctolagus cuniculus", "Lebensdauer: bis zu 12 Jahre", "Lebensraum: Vielfalt – Wiesen, Feuchtgebiete, Grasland, Sümpfe, Berggebiete, Vulkangebiete und alle Kontinente außer der Antarktis", "Eine interessante Sache bei Kaninchen: Kaninchen beginnen schon in sehr jungem Alter mit der Zucht. Sie beginnen, wenn sie drei bis vier Monate alt sind.", "Wie viele Kaninchen gibt es auf der Welt? 200 Millionen bis 600 Millionen", "Die Geschichte des Hasen: Der Hase ist das vierte Tier des chinesischen Sternzeichens. Der Hase beschloss, das Rennen vor den anderen Tieren zu starten. Es war fast am Ende, aber es wurde übermütig und machte ein Nickerchen, da keine anderen Tiere in Sicht waren. Der Hase wachte auf und sah, wie der schnelle Tiger an ihm vorbeiging. Der Hase konnte mit dem schnellen Tiger und dem ausdauernden Ochsen nicht mithalten. Da sich die Ratte in den Hörnern des Ochsen versteckte, kam der Hase im Rennen auf den vierten Platz.", "Jahre: 1951, 1963, 1975, 1987, 1999, 2011, 2023, 2035", "Was sagt das über Sie aus? Menschen, die im Jahr des Hasen geboren wurden, neigen dazu, allen gegenüber höflich, einfallsreich und elegant zu sein. Kaninchenpersönlichkeiten versuchen, das Leben so interessant wie möglich zu gestalten. Sie suchen Spannung und neigen dazu, der Realität zu entfliehen. Eine Schwäche der Kaninchen besteht darin, dass sie leicht paranoid und eifersüchtig werden können.", 
"Was sagt es über Ihren Erfolg aus? Kaninchen können bei Qualitätskontrollen oder Empfangsarbeiten erfolgreich sein. Kaninchen ziehen eine Karriere einem stabilen Leben vor, was bedeutet, dass sie dazu neigen, nicht ehrgeizig zu sein und selten bedeutende Erfolge zu erzielen.", "Ihre Kompatibilität mit den anderen Tieren:", "Kaninchen und Schaf: Sie sind beide familienorientiert. Sie können zusammenarbeiten, um eine harmonische Familie zu gründen. \nKaninchen und Affe: Ihr habt beide die Bedürfnisse des anderen. Kaninchen erwarten von einem Partner Zärtlichkeit, Wärme und Unterstützung. Ein Hund kann diese Bedürfnisse erfüllen und ein weiterer Pluspunkt ist, dass Hunde romantisch sind. \nKaninchen und Hund: Sie beide vertrauen und verstehen einander, um eine dauerhafte und frische Beziehung aufzubauen. \nKaninchen und Schwein: Die Persönlichkeit des Schweins passt gut zur Persönlichkeit des Kaninchens. Kaninchen schätzen die Einfachheit und Ehrlichkeit des Schweins.", "Berühmte Persönlichkeiten dieses Sternzeichens: Albert Einstein, Johnny Depp, Michael Jordan, Kendrick Lamar und Frank Sinatra"};
    String[] ratInfo = {"Wissenschaftlicher Name: Rattus", "Lebensdauer: Inländisch – 2–4 Jahre, Wild – 10 Jahre", "Lebensdauer: Inländisch – 2–4 Jahre, Wild – 10 Jahre", "Eine interessante Sache an Ratten ist: Ratten haben viele ähnliche Eigenschaften wie Menschen. Beispielsweise kann eine Ratte unter Gruppenzwang stehen. Sie verspüren das Bedürfnis, sich anzupassen.", "Wie viele Ratten gibt es auf der Welt? Mehr als 2 Milliarden Ratten", "Die Geschichte der Ratte: Die Ratte ist das erste Tier des 12-Jahres-Zyklus. In der Nacht vor dem großen Rennen versteckte sich die Ratte unter dem Ochsenhorn. Die Ratte hatte vor, während des Rennens dort zu bleiben, weil sie wusste, dass es der Ochse war das fleißigste und ausdauerndste Tier. Wie erwartet lag der Ochse an der Spitze, bis der Ochse sich der Ziellinie näherte und die Ratte absprang und sich den ersten Platz sicherte. Die Menschen waren mit dem Betrug der Ratte unzufrieden, aber der Kaiser des Himmels betrachtete die Tricks der Ratte als eine Art Weisheit. Daher ist die Ratte der erste der Tierkreisgötter.", "Jahre: 1948, 1960, 1972, 1984, 1996, 2008, 2020, 2032", 
"Was sagt das über Sie aus? Menschen, die im Jahr der Ratte geboren wurden, sind in der Regel gesellig, fröhlich und gedeihen in Gruppen. Rattenpersönlichkeiten sind kluge und schnelle Denker. Sie sind von Natur aus vorsichtig und neigen dazu, das Eingehen von Risiken zu beobachten und zu vermeiden. Eine Schwäche der Ratten besteht darin, dass sie dazu neigen, egoistisch zu sein und sich nur darum kümmern, sich selbst zu verbessern, anstatt sich um andere zu kümmern.", "Was sagt es über Ihren Erfolg aus? Ratten können in den Bereichen Musik, Planung und Management sowie Mathematik Erfolg haben.", "Ihre Kompatibilität mit den anderen Tieren:", "Ratte & Ratte: Ihr seid ein engagiertes Paar, dem es an Geheimnissen mangelt, weil ihr euch so gut kennt. \nRatte und Ochse: Ihr seid beide bereit, die familiären Pflichten zu teilen. Sie wissen, wie Sie mit Ihren komplementären Charakteren zusammenarbeiten, um sich gegenseitig bei der Arbeit, im Beruf und im Privatleben zu unterstützen. \nRatte und Drache: Ihr könnt beide reif und selbstbewusst sein. Man kann einander vertrauen und Raum geben. \nRatte und Affe: Sie verstehen sich gegenseitig und unterstützen sich gegenseitig. Dieses Maß an Unterstützung ist die Lösung, wenn Konflikte auftreten.", 
"Berühmte Persönlichkeiten dieses Sternzeichens: Jackson Browne, Apple-CEO TIm Cook, Katy Perry, Dwayne „The Rock“ Johnson und Enimen"};
    String[] roosterInfo = {"Wissenschaftlicher Name: Gallus gallusDomesticus", "Lebensdauer: 5 Jahre", "Lebensraum: Hähne kommen in einer Vielzahl von Lebensräumen vor, darunter Bauernhöfe, vorstädtische Hühnerställe, Wälder, Grasland und sogar Wüsten. Sie sind anpassungsfähige Lebewesen und können in unterschiedlichen Umgebungen gedeihen, vom schottischen Hochland bis zu den tropischen Regionen Asiens und Afrikas. Hähne bauen ihre Nester am liebsten an abgelegenen Stellen, etwa unter Büschen oder im hohen Gras.", "Eine interessante Sache: Hähne haben einen schlechten Geruchs- und Geschmackssinn, aber ein gutes Gehör.", "Wie viele Hähne gibt es auf der Welt? 34,4 Milliarden", "Die Geschichte vom Hahn: Der Hahn versuchte immer, die anderen zu besiegen. Als der Jadekaiser die Tiere für die Teilnahme am Rennen auswählte, stand der Hahn nicht auf der Liste, da er für den Menschen nicht hilfreich war. Das Pferd sagte dem Hahn, dass es seine goldene Stimme nutzen könne, um Menschen aufzuwecken. Als der Hahn es tat, waren die Menschen sehr dankbar und der Jadekaiser fügte den Hahn der Liste hinzu. Am Tag des Rennens kamen Hahn und Hund gemeinsam zum Rennen. Während des Rennens konnte der Hund nicht aufholen und platzierte sich direkt hinter dem Hahn. Auch heute noch ist der Hund wütend auf den Hahn. In der chinesischen Kultur ist das Konzept „der Hund, der dem Hahn nachjagt“ noch heute sichtbar. Viele chinesische Hunde jagen beispielsweise gerne Hähne.", 
"Jahre: 1921, 1933, 1945, 1957, 1969, 1981, 1993, 2005, 2017, 2029", "Was sagt das über Sie aus? Hähne sind selbstbewusst, kontaktfreudig, intelligent und optimistisch", "Was sagt es über Ihren Erfolg aus? Viele Hähne haben scharfe Ansichten zu aktuellen Themen und sind gut darin, Ideen zu verwirklichen. Aufgrund ihrer Beredsamkeit und ihres großen Machteifers eignen sie sich hervorragend als Politiker, Diplomaten oder Redner. Wer über weniger politisches Bewusstsein verfügt, könnte darüber nachdenken, Reiseleiter oder Schauspieler/Schauspielerin zu werden, da er kaum schüchtern ist, wenn er in der Öffentlichkeit spricht oder auftritt. Darüber hinaus haben manche Menschen, die im Jahr des Hahns geboren wurden, ein anspruchsvolles Auge für die Künste. Unter Berücksichtigung ihres Interesses am Aussehen sind sie als Modedesigner in ihrem Element.", "Your compatibility with the other animals:",
        "Hahn & Ochse: Beide Tiere denken gerne über langfristige Ziele nach. Sie haben auch materialistische Ziele, auf die sie gerne hinarbeiten, da sie beide fleißige Tierkreistiere sind. \nHahn und Schlange: Die Kompatibilität von Schlange und Hahn wird durch gemeinsame Ziele und Hingabe definiert. Sie haben beide gegensätzliche Persönlichkeiten, aber das Horoskop sagt aufgrund des gegenseitigen Fleißes eine günstige Beziehung voraus.", "Berühmte Persönlichkeiten dieses Sternzeichens: Sophie Scholl, Tom Selleck, Kelly McGillis, Jennifer Aniston, Britney Spears, Justin Timberlake und Taylor Momsen"};
    String[] snakeInfo = {"Wissenschaftlicher Name: Serpentes", "Lebensdauer: bis zu 20 Jahre", "Lebensraum: Jeder Lebensraum, der nicht arktisch oder subarktisch ist – tropische Wälder, trockene Wüsten, Taigas, Wälder, Wiesen", "Eine interessante Sache über Schlangen: Es gibt 725 Arten giftiger Schlangen, aber nur 250 von ihnen können einen Menschen mit einem Biss fressen.", "Wie viele Schlangen gibt es auf der Welt? Es gibt mehr als 3.000 Arten", "Die Geschichte der Schlange: Die Schlange ist das sechste Tier des chinesischen Sternzeichens. Vor langer, langer Zeit hatte die Schlange vier Beine, aber die Schlange war bei den Menschen unbeliebt. Als die Schlange davon hörte, fraß sie Tiere und biss Menschen. Der Jadekaiser riet der Schlange, gut zu sein, aber die Schlange lehnte ab. Daraufhin schnitt der Jadekaiser der Schlange die vier Beine ab. Die Schlange erkannte ihren Fehler und arbeitete daran, Gutes für die Menschen zu tun. Vom Drachen lernte es die Wasserkontrolle, um Überschwemmungen zu verhindern. Die Schlange wurde hinter dem Drachen platziert, weil der Jadekaiser sah, dass die Schlange ihre Fehler korrigierte.", "Jahre: 1953, 1965, 1977, 1989, 2001, 2013, 2025, 2037", "Was sagt das über Sie aus? Menschen, die im Jahr der Schlange geboren wurden, sind in der Regel äußerst intelligent, anpassungsfähig und haben ein ruhiges Äußeres. Schlangenpersönlichkeiten haben ein breites Spektrum an Interessen. Sie sind zielorientiert und verfügen über eine ausgeprägte Intuition, die zu einem hohen Maß an Kreativität führt. Eine Schwäche der Schlange besteht darin, dass sie emotional distanziert ist, was es für romantische Partner schwierig macht, weil sie Schwierigkeiten haben, verletzlich zu sein.", 
"Was sagt es über Ihren Erfolg aus? Schlangen können in einer wissensbasierten Arbeit Erfolg haben, beispielsweise als Politiker, Lehrer und Psychologe. Schlangen ziehen es vor, ihre Ideen zu priorisieren, ohne darüber nachzudenken, was andere zu sagen haben. Dies wäre in einer Führungsposition hilfreich.", "Ihre Kompatibilität mit den anderen Tieren:", "Schlange und Schaf: Ihr seid beide familienorientiert. Sie können zusammenarbeiten, um eine harmonische Familie zu gründen. \nSchlange und Hund: Sie beide vertrauen und verstehen einander, um eine dauerhafte und frische Beziehung aufzubauen. \nSchlange und Affe: Ihr habt beide die Bedürfnisse des anderen. Schlangen erwarten von einem Partner Zärtlichkeit, Wärme und Unterstützung. Ein Affe kann diese Bedürfnisse erfüllen und ein weiterer Pluspunkt ist, dass Affen romantisch sind. \nSchlange und Schwein: Die Persönlichkeit des Schweins passt gut zur des Kaninchens. Kaninchen schätzen die Einfachheit und Ehrlichkeit des Schweins.", "Berühmte Persönlichkeiten dieses Sternzeichens: Wilhelm Röntgen, Johann Wolfgang von Goethe, J.K.Rowling, Oprah Winfrey, John F. Kennedy, Pablo Picasso und Charles Darwin"};
    String[] tigerInfo = {"Wissenschaftlicher Name: Panthera tigris", 
    "Lebensdauer: 26 Jahre in Gefangenschaft und etwa 15 Jahre in freier Wildbahn", 
    "Lebensraum: Tiger sind widerstandsfähige Wesen und können in verschiedenen Umgebungen leben. Sie kommen typischerweise in Grasland, Wäldern, Dschungeln, Mangrovensümpfen und Taigas vor. Man findet sie nahe der Ostküste Russlands, Nordkoreas, Chinas und Südostasiens bis hin zu Teilen Indonesiens.", 
    "Eine interessante Sache bei Tigern: Eine normale Wurfgröße für Tiger beträgt 2 bis 4 Junge, und wenn die Jungen geboren werden, sind sie blind und können erst nach etwa 6 bis 8 Wochen sehen.", 
    "Wie viele Tiger gibt es auf der Welt? Es gibt nur 4.500 Tiger, manche schätzen sogar weniger.", 
    "Die Geschichte des Tigers: Der Tiger ist der dritte Tierkreis im Tierkreis, der großen Rasse, die alle Tiere zusammenbrachte, um den Jadekaiser zu treffen, um die Jahre der Kalender festzulegen. Sie alle müssen den großen Fluss überqueren und ihn erreichen. Der Tiger war Dritter, weil ihn die Strömung trotz seiner Stärke und Größe flussabwärts getrieben hatte, als er über den Fluss schwamm.", 
    "Jahre: 1926, 1938, 1950, 1962, 1974, 1986, 1998, 2010, 2022, 2034", 
    "Was sagt Ihr Tier über Sie? Menschen, die im Jahr des Tigers geboren wurden, gelten als mutig, ehrgeizig und charmant und werden mit Glück und Autorität beschenkt. Sie gelten als sehr selbstbewusste Anführer mit großer Standhaftigkeit. Einige negative Eigenschaften des Jahres des Tigers dürften jedoch sein: prahlerisch, impulsiv, übermäßig nachsichtig und schlecht gelaunt.", 
    "Was sagt das über Ihren Erfolg aus? Tiger eignen sich gut als Anführer und haben Glück, wenn es um Erfolg geht. Für sie geeignete Jobs sind in der Regel solche, die eine autoritäre Position einnehmen. Berufe, in denen Tiger gut zurechtkommen würden, sind Unternehmensmanager, Politiker, Polizisten, Modedesigner, Autoren/Journalisten, Revolutionäre, Direktoren und Wirtschaftswissenschaftler.", 
    "Ihre Kompatibilität mit den anderen Tieren:", 
    "Tiger und Hund: Ihr seid beide charmant, sanft und freundlich. Sie beide respektieren die Meinungen anderer und haben keine Angst davor, einen Schritt zurückzutreten. Tiger sind sehr kontaktfreudig und kommunikationsstark, was bei Hunden, die gutherzig und rücksichtsvoll sind, gut funktioniert. \nTiger und Schwein: Sie sind beide sehr ermutigend und äußerst loyal und hingebungsvoll. Auch wenn Sie vielleicht unterschiedlich sind, bewundern Sie beide die Qualitäten Ihres Partners. \nTiger & Pferd: Ihr seid beide aufgeschlossen, kommunikationsstark und ausgelassen. Tiger sind rücksichtsvoll und charmant, und Pferde gleichen das gut aus, weil sie tugendhaft und freundlich sind.", 
    "Berühmte Persönlichkeiten dieses Sternzeichens: Rainer Maria Rilke, Marilyn Monroe, Leonardo DiCaprio, Tom Cruise, Steven Irwin, Königin Elizabeth II., Robert Pattinson und Usain Bolt."};


    String enterYearWheelManager = "Geben Sie Ihr Geburtsjahr ein:";
    String zodiacButtonWheelManager = "Holen Sie sich Zodiac";
    String resultWheelManager = "Dein Sternzeichen ist der ";
    String[] animalListWheelManager = {"Ratte", "Ochse", "Tiger", "Kaninchen", "Drache", "Schlange", "Pferd", "Ziege", "Affe", "Hahn", "Hund", "Schwein"};
    String invalidWheelManager = "Ungültige Eingabe. Bitte ein gültiges Jahr eingeben.";
    String errorWheelManager = "Fehler";
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

    //use again
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
    @Override
    public String[] gethorseInfo() {
        return horseInfo;
    }
    @Override
    public String[] getmonkeyInfo() {
        return monkeyInfo;
    }
    @Override
    public String[] getoxInfo() {
        return oxInfo;
    }
    @Override
    public String[] getpigInfo() {
        return pigInfo;
    }
    @Override
    public String[] getrabbitInfo() {
        return rabbitInfo;
    }
    @Override
    public String[] getratInfo() {
        return ratInfo;
    }
    @Override
    public String[] getroosterInfo() {
        return roosterInfo;
    }
    @Override
    public String[] getsnakeInfo() {
        return snakeInfo;
    }
    @Override
    public String[] gettigerInfo() {
        return tigerInfo;
    }

    @Override
    public String getenterYearWheelManager() {
        return enterYearWheelManager;
    }
    @Override
    public String getzodiacButtonWheelManager() {
        return zodiacButtonWheelManager;
    }
    @Override
    public String getresultWheelManager() {
        return resultWheelManager;
    }
    @Override
    public String[] getanimalListWheelManager() {
        return animalListWheelManager;
    }
    @Override
    public String getinvalidWheelManager() {
        return invalidWheelManager;
    }
    @Override
    public String geterrorWheelManager() {
        return errorWheelManager;
    }
}
