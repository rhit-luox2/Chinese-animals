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

    String[] dogInfo = {"Scientific name: Canis lupus familiaris", "Lifespan: Domestic 10 - 13 years", "Habitat: Anywhere - Dogs are very adaptable animals and have evolved to very different environments such as the Arctic tundra to tropical rainforests. They can survive in rural and urban areas and can adapt to pretty much any environment. Dogs can be found all over the world and most are domesticated and can pretty much live anywhere with appropriate resources and shelter.", "Interesting thing about the dog: Dogs tend to walk on their toes unlike most mammals walking on flat feet and they can be right or left pawed.", "How many dogs are there in the world? estimated to be 900 million with China having the highest dog population in Asia at 54.29 million" , "The story of the dog: The dog is 11th in the Zodiac, and in the great race the dog should have been quicker. Since it was a fast runner and the best swimmer, the dog stopped to play in the river and made the excuse that it needed a bath", "Years: 1922, 1934, 1946, 1958, 1970, 1982, 1994, 2006, 2018, 2030", "What does this say about your? People that are born in the year of the dog are thought of being honest, loyal, faith driven, smart, forthright, and cordial. They are also considered helpful and have a strong sense of justice.  Some negative traits about the dog are likely to be self-righteous, stubborn, distant, and struggle socially.", "What does your animal say about your success? Dogs are good at ordinary work and treated kindly and sincerely by coworkers and subordinates. They are also known for their sense of justice and ability to win respect. Dogs would work well as advisors, priests, teachers, lawyers, doctors, politicians, philosophers, nurses, and writers.", "Your compatibility with the other animals:", "Dog & tiger: Dogs are most compatible with their fellow quick witted animals, and dogs bring a lack of ego to relationships and tigers have to “protect them at all costs“ energy. Very loyal partners and have a great sense of kindness and right and wrong. \nDog & rabbit: Rabbit has a more playful charm that tries to get the dog to relax more. They usually build relationships on honesty and attraction. Rabbits can be insecure but the dog’s loyalty makes the relationship a safe space. \nDog & horse: Both very straight-forward and frank. Very strong communication skills and bring out the best aspects of each other. The dog convinces the horse that it is more freedom oriented to settle down. While the Dog is inspired by the horse’s outgoing personality.", "Famous people who is this zodiac: Ursula von der Leyen, Anne Hathaway, Michael Jackson, George W. Bush, Zhou Enlai, Winston Churchill, Donald Trump, Elvis Presley, Kim Jong-un, and Nicki Minaj"};

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

    @Override
    public String[] getdogInfo() {
        return dogInfo;
    }
}
