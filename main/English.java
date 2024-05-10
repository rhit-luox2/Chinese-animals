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
    String[] dragonInfo = {"Scientific Name: N/A", "Lifespan: N/A", "Habitat: N/A", "One interesting fact about dragons: In China, dragons symbolize wealth, power, and leadership because Chinese emperors were believed to be descendants of dragons.", "How many dragons are there in the world? N/A", "The story of the dragon: The dragon was the fifth zodiac. Although it should have been faster, the dragon had stopped by a village to provide rain and helped the rabbit by blowing it to shore.", "Years: 1904, 1916, 1928, 1940, 1952, 1964, 1976, 1988, 2000, 2012, 2024", "What does this zodiac say about you? Dragons are seen as powerful, kind-hearted, prosperous, brave, leaders, and innovative. They can also be scrutinizing, egotistical, easy to anger, and overconfident.", "What does your zodiac say about your success? Dragons can do almost any job with high proficiency and efficiency. They can succeed in the science or art fields. Jobs recommended for dragons are healthcare workers, entrepreneurs, teachers, psychologists, and writers.", "Your compatibility with other animals:", "Dragon & Rat: Appreciative of each other's traits despite differences.\nDragon & Monkey: They bring out the best in each other, balancing passion and humor.\nDragon & Rooster: Driven and straight forward, they both know what they want.", "Famous People: Ruth Westheimer, John Lennon, Bruce Lee, Rihanna, Martin Luther King Jr., Vladimir Putin, Shakira, Jeb Bush, Christian Dior, Robert Oppenheimer, Shirley Temple, Adele, Dr. Seuss, Sandra Bullock, Alexei Nikolaevich"};
    String[] goatInfo = {"Scientific name: Capra hircus", "Lifespan: upto 18 years", "Habitat: Goats have been domesticated for many years and they typically have been used by humans for manual labor, for their milk and fur. They are excellent climbers and can pretty much survive in any climate except extreme temperatures but prefer grassy areas and migrate with a herd. They typically are found in Asia, North America, and parts of Europe.", "", "How many goats are there in the world? around one billion goats", "The story of the goat: The goat was given 8th place in the zodiac race. The rooster, monkey, and goat had a plan to pull a raft to get themselves across the river.", "Years: 1907, 1919, 1931, 1943, 1955, 1967, 1979, 1991, 2003, 2015, 2027", "What does this zodiac say about you? Goats are typically polite, shy, mellow, and visionary. However, goats can be pessimistic, unrealistic, and have stubborn behavior. They tend to have high endurance and are very driven by the people around them. They are ideal innovators, creative and compassionate.", "What does your animal say about your success? Although goats are considered shy and more feminine. They are very charming, graceful and talented in art and music. Suitable jobs would be medicine, philanthropology, artists, writers, dancers, philosophers, teachers, nurses, service workers, and salesmen.", "Your compatibility with the other animals:", "Goat & rabbit: Both are very thoughtful of each other's desires. Sheep are very romantic, Rabbits are very reflective and they tend to compliment each other well. Rabbits tend to look ahead and plan, while sheep are very fearful of what might come. Goats are very willing to pursue their many dreams and Rabbits are more cautious and calculated. They both recognize each other's flaws and find ways to still get along. \nGoat & pig: The goat and pig have a very balanced, fun and loving relationship. Although the goat is impulsive, the pig steadies the goat. The pig is typically the organizer in the relationship, while the goat contributes with their creativity and enrichment. They might battle between structure and freedom between the two but they tend to share common values which cements their relationship. \nGoat & horse: Goats are sentimental and kind; they also tend to be jealous. However, horses are very calm and able to keep the goat interested. They are most compatible as friends which strengthens their relationship as a couple. The only thing that is recommended is they need to have independence in their relationship and keep an open mind.", "Famous people who is this zodiac: Claus von Stauffenberg, Steve Jobs, George Harrison, Bruce Willis, Bill Gates, Kurt Cobain, Billie Jean King, Tita Moerno, Mikhail Gorachev, Olivia Rodrigo, Julia Roberts, John Wayne, Mick Jagger, and Ed Sheeran"};
    String[] horseInfo = {"Scientific name: Equus ferus caballus", "Lifespan: 30 years", "Habitat: Varies from grasslands to forests, mountains, wetlands, deserts, tundra, savannahs, coastal regions, steppes, and more.", "One interesting thing about horses: They were the most frequent transport means in ancient societies and are considered one of the six most important animals in China.", "How many horses are there in the world? Approximately 60 million", "The story of the horse: Legend goes that the horse had wings in ancient times and was named Holy Horse, capable of running on the ground, swimming, and flying. Due to its arrogance, the Jade Emperor ordered its wings cut and buried it under Kunlun Mountain. Human ancestor Ren Zu later freed it, and the horse dedicated its life to serving humans.", "Years: 1918, 1930, 1942, 1954, 1966, 1978, 1990, 2002, 2014, 2026", "What does this say about you? Horses are cheerful, enthusiastic, insightful, and considerate.", "What does it say about your success? The Horses have a quick wit and good judgment, which helps them to gain some chances at a career. However, an impulsive personality may cause them to suffer setbacks and failures. If the Horses can strengthen their willpower and don’t give up halfway, they can get extraordinary achievements. The Horses are active and love exploring the world, so adventurers and tour guides are suitable jobs for them. And they can always perform well in jobs like writers, businessmen, and artists, where they can display their talents without any restrictions.", "Your compatibility with other animals:", "Horse & tiger: Both of you are open-minded, good at communication, and exuberant. Tigers are thoughtful and charming, and horses balance that out well because they are virtuous and sweet. \nHorse & sheep: Goats are sentimental and kind; they also tend to be jealous. However, horses are very calm and able to keep the goat interested. They are most compatible as friends which strengthens their relationship as a couple. The only thing that is recommended is they need to have independence in their relationship and keep an open mind.  \nHorse & rabbit: Horses and rabbits are opposites. To work well together, they must be willing to compromise. Their compatibility is their unconscious need for each other. For example, the friendly, cautious rabbits are drawn to the resolute, hot-tempered horses. Their compatibility depends on the genders of the horse and rabbit.", "Famous people who is this zodiac: Helmut Kohl, Paul McCartney, Angela Merkel, Jackie Chan, Kobe Bryant, Kristen Stewart, and Greta Thunberg"};

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
}
