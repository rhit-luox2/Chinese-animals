//Kaila James
package main;

import java.util.ArrayList;
import java.util.Arrays;

public class English implements Language{

    boolean isEnglish = true;
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
    String[] goatInfo = {"Scientific name: Capra hircus", "Lifespan: upto 18 years", "Habitat: Goats have been domesticated for many years and they typically have been used by humans for manual labor, for their milk and fur. They are excellent climbers and can pretty much survive in any climate except extreme temperatures but prefer grassy areas and migrate with a herd. They typically are found in Asia, North America, and parts of Europe.", "One interesting thing about goats: One interesting fact about the goat: There was a study done by Queen Mary University in London where they learned that goats will find humans for assistance if they cannot complete a task. They gave goats a box with a treat in it and when the goat could not open the box they brought it to the researchers to open the lid.", "How many goats are there in the world? around one billion goats", "The story of the goat: The goat was given 8th place in the zodiac race. The rooster, monkey, and goat had a plan to pull a raft to get themselves across the river.", "Years: 1907, 1919, 1931, 1943, 1955, 1967, 1979, 1991, 2003, 2015, 2027", "What does this zodiac say about you? Goats are typically polite, shy, mellow, and visionary. However, goats can be pessimistic, unrealistic, and have stubborn behavior. They tend to have high endurance and are very driven by the people around them. They are ideal innovators, creative and compassionate.", "What does your animal say about your success? Although goats are considered shy and more feminine. They are very charming, graceful and talented in art and music. Suitable jobs would be medicine, philanthropology, artists, writers, dancers, philosophers, teachers, nurses, service workers, and salesmen.", "Your compatibility with the other animals:", "Goat & rabbit: Both are very thoughtful of each other's desires. Sheep are very romantic, Rabbits are very reflective and they tend to compliment each other well. Rabbits tend to look ahead and plan, while sheep are very fearful of what might come. Goats are very willing to pursue their many dreams and Rabbits are more cautious and calculated. They both recognize each other's flaws and find ways to still get along. \nGoat & pig: The goat and pig have a very balanced, fun and loving relationship. Although the goat is impulsive, the pig steadies the goat. The pig is typically the organizer in the relationship, while the goat contributes with their creativity and enrichment. They might battle between structure and freedom between the two but they tend to share common values which cements their relationship. \nGoat & horse: Goats are sentimental and kind; they also tend to be jealous. However, horses are very calm and able to keep the goat interested. They are most compatible as friends which strengthens their relationship as a couple. The only thing that is recommended is they need to have independence in their relationship and keep an open mind.", "Famous people who is this zodiac: Claus von Stauffenberg, Steve Jobs, George Harrison, Bruce Willis, Bill Gates, Kurt Cobain, Billie Jean King, Tita Moerno, Mikhail Gorachev, Olivia Rodrigo, Julia Roberts, John Wayne, Mick Jagger, and Ed Sheeran"};
    String[] horseInfo = {"Scientific name: Equus ferus caballus", "Lifespan: 30 years", "Habitat: Varies from grasslands to forests, mountains, wetlands, deserts, tundra, savannahs, coastal regions, steppes, and more.", "One interesting thing about horses: They were the most frequent transport means in ancient societies and are considered one of the six most important animals in China.", "How many horses are there in the world? Approximately 60 million", "The story of the horse: Legend goes that the horse had wings in ancient times and was named Holy Horse, capable of running on the ground, swimming, and flying. Due to its arrogance, the Jade Emperor ordered its wings cut and buried it under Kunlun Mountain. Human ancestor Ren Zu later freed it, and the horse dedicated its life to serving humans.", "Years: 1918, 1930, 1942, 1954, 1966, 1978, 1990, 2002, 2014, 2026", "What does this say about you? Horses are cheerful, enthusiastic, insightful, and considerate.", "What does it say about your success? The Horses have a quick wit and good judgment, which helps them to gain some chances at a career. However, an impulsive personality may cause them to suffer setbacks and failures. If the Horses can strengthen their willpower and don’t give up halfway, they can get extraordinary achievements. The Horses are active and love exploring the world, so adventurers and tour guides are suitable jobs for them. And they can always perform well in jobs like writers, businessmen, and artists, where they can display their talents without any restrictions.", "Your compatibility with other animals:", "Horse & tiger: Both of you are open-minded, good at communication, and exuberant. Tigers are thoughtful and charming, and horses balance that out well because they are virtuous and sweet. \nHorse & sheep: Goats are sentimental and kind; they also tend to be jealous. However, horses are very calm and able to keep the goat interested. They are most compatible as friends which strengthens their relationship as a couple. The only thing that is recommended is they need to have independence in their relationship and keep an open mind.  \nHorse & rabbit: Horses and rabbits are opposites. To work well together, they must be willing to compromise. Their compatibility is their unconscious need for each other. For example, the friendly, cautious rabbits are drawn to the resolute, hot-tempered horses. Their compatibility depends on the genders of the horse and rabbit.", "Famous people who is this zodiac: Helmut Kohl, Paul McCartney, Angela Merkel, Jackie Chan, Kobe Bryant, Kristen Stewart, and Greta Thunberg"};
    String[] monkeyInfo = {"Scientific name: Ceropothecidae", "Lifespan: up to 40 years", "Habitat: rainforest - in almost every continent", "One interesting thing about monkeys: Monkeys are highly intelligent mammals. They understand numbers and can count. In rare cases, they can multiply.", "How many monkeys are there in the world? 505 known species", "The story of the monkey: The monkey is the ninth animal of the Chinese zodiac sign. " + 
    "Even though the monkey is a common animal, it was able to participate in the Great Race because the tiger " + 
    "owed the monkey a favor for saving his life. However, the tiger king was unhappy that he was being compared to a common monkey. " +
    "The two have been incompatible ever since. During the race, the monkey won ninth place.", "Years: 1956, 1968, 1980, 1992, 2004, 2016, 2028, 2040", "What does this zodiac say about you? People who are born in the year of the monkey tend " + 
    "to be sociable, forward-thinking, and inventive. Monkey personalities are creative and unpredictable. " + 
    "They are naturally sharp-minded and fun to be around. A weakness of the rats is that they lack patience with anything that requires effort.", "What does your zodiac say about your success? Monkeys are able to find success in the fields of sports and entertainment and any career that is tasked with solving complicated problems such as a detective or lawyer.", "Your compatibility with the other animals:", "Monkey & rat: You are both understanding and care to support each other. This level of support is the solution when conflict arises. \nMonkey & dog: Both of you treat each other with respect and know each other’s needs. This couple is mature and can handle conflicts well. \nMonkey & dragon: Both of you understand the importance of cherishing and bonding with each other. You know how to work with each other so that you can learn and help each other because are both ambitious and positive.", "Famous people who is this zodiac: Franz Kafka, Oskar Schindler, Christina Aguilera, Celine Dion, Will Smith, Jennifer Aniston, and Tom Hanks"};
    String[] oxInfo = {"Scientific name: Bos taurus", "Lifespan: about 15 years", "Habitat: North America, Europe, Asia, and Africa; no wild oxen in South America and Australia", "One interesting thing about oxen is: Oxen have been domesticated for over 6,000 years, used for agricultural purposes.", "How many oxen are there in the world? About 300 to 400 million", "The story of the ox: Ox ranks the second among the Chinese zodiacs because it helped the Rat but was later tricked by it. The myth goes that the Jade Emperor declared the order of zodiac signs would be based on the arrival orders of 12 animals. Ox could have arrived first but kindly gave a ride to Rat. However, when arriving, Rat just jumped to the terminus ahead of Ox, and thus Ox lost the first place.", "Years: 1913, 1925, 1937, 1949, 1961, 1973, 1985, 1997, 2009, 2021, 2033", "What does this say about you? Oxen are faithful, obliging, persistent, and sympathetic", "What does it say about your success? Oxen are typical realists, upright and simple, suited for roles like lawyers, consultants, doctors, and technicians.", "Your compatibility with the other animals:", "Ox & rat: Both of you are willing to share family responsibilities. You know how to work with your complementary characters to help each other work work and home lives. \nOx & snake: Their compatibility is considered to be excellent because they have similar preferences. This allows them to collaborate and understand each other well. The spontaneity of the snake is able to inspire the rational and meticulous ox. \nOx & rooster: Both animals like to think about long-term goals. They also have materialistic goals that they like to work towards because they are both hard-working zodiac animals.", "Famous people of this zodiac: Lothar Mattaus, Walt Disney, Margaret Thatcher, Diana Spencer, Barack Obama, and Bruno Mars"};
    String[] pigInfo = {"Scientific name: Sus scrofa domesticus", "Lifespan: 15 years", "Habitat: Pigs are adaptable animals that can live in a wide variety of habitats. They can occupy pastures, farmland, forests, shrublands, grasslands, wetlands, savanna, and even remote islands.", "One interesting thing about pigs: Pigs are highly intelligent and consistently rank between the top 4 and top 7 of the most intelligent animals on Earth.", "How many pigs are there in the world? about 778.64 million", "The story of the pig: The pig was selected as a Chinese zodiac sign for its efforts. The Jade Emperor stipulated that the first arrived animals on the competition day would be selected as the zodiac signs. The pig knew that it was heavy and walked slowly, so it got up at midnight to line up. However, the pig met many obstacles on the long journey; it exerted all its strength and crawled up to the Heavenly Southern Gate. The competition was over and the pig struggled to beg, other domestic animals also pleaded for it. Finally, the god was moved and let in, thus the pig became the last zodiac sign. In this way, all of the six domestic animals, namely horse, ox, sheep, rooster, dog, and pig, became the Chinese zodiac signs.", "Years: 1923, 1935, 1947, 1959, 1971, 1983, 1995, 2007, 2019, 2031, 2043", "What does this say about you? Pigs are diligent, upright, compassionate, and responsible.", "Chinese zodiac Pig signs are always more peaceful and upright, which means that the Pig is not suitable to seek development in competitive industries like finance and commerce. Instead, they can perform well in public service, being good teachers or civil servants. Pigs also have a strong thirst for knowledge and were born with a passion for science and art, thus professors and artists are suitable jobs for them. Last but not least, they love nature and are glad to work with animals and plants.", "Your compatibility with the other animals:", "Pig & tiger: Both of you are very encouraging and extremely loyal and devoted. Though you may have your differences you both admire your partner's qualities. \nPig & rabbit: The pig’s personality matches well with the rabbit’s. Rabbits appreciate the pig’s simplicity and honesty. \nPig & sheep: The sheep and pig have a very balanced, fun, and loving relationship. Although the sheep is impulsive, the pig steadies the sheep. The pig is typically the organizer in the relationship, while the sheep contribute with their creativity and enrichment. They might battle between structure and freedom between the two but they tend to share common values which cements their relationship.", "Famous people who is this zodiac: Nicole Brown Simpson, Ronald Reagan, Woody Allen, Arnold Schwarzenegger, Hillary Clinton, Mariah Carey, and Kendall Jenner"};
    String[] rabbitInfo = {"Scientific name: Oryctolagus cuniculus", "Lifespan: up to 12 years", "Habitat: Variety - meadows, wetlands, grasslands, marshes, mountain areas, volcanic areas, and every continent except Antartica", "One interesting thing about rabbits: Rabbits start breeding at a very young age. They start when they are three to four months old.", "How many rabbits are there in the world? 200 million to 600 million", "The story of the rabbit: The rabbit is the fourth animal of the Chinese zodiac sign. The rabbit decided to start the race before the rest of the animals. It almost reached the end but it got cocky and took a nap since there were no other animals in sight. The rabbit woke up and saw the speedy tiger pass him. The rabbit was not able to keep up with the fast tiger and persevering ox. Since the rat was hiding in the ox’s horns, the rabbit came fourth in the race.", "Years: 1951, 1963, 1975, 1987, 1999, 2011, 2023, 2035", "What does this say about you? People who are born in the year of the rabbit tend to be courteous to everyone, imaginative, and elegant. Rabbit personalities try to make life as interesting as possible. They seek excitement and tend to escape from reality. A weakness of the rabbits is that they can become paranoid and become jealous easily.", "What does it say about your success? Rabbits are able to find success in quality inspection or reception work. Rabbits prefer a career for a stable life, which means they tend to not be ambitious and seldom make meaningful achievements.", "Your compatibility with the other animals: ", "Rabbit & sheep: You are both family-oriented. You can work together to create a harmonious family.	 \nRabbit & monkey: Both of you have each other’s needs. Rabbits expect tenderness, warmth, and support from a partner. A dog can meet those needs and another plus is that dogs are romantic. \nRabbit & dog: Both of you trust and understand each other to build a lasting and fresh relationship. \nRabbit & pig: The pig’s personality matches well with the rabbit’s. Rabbits appreciate the pig’s simplicity and honesty.", "Famous people who is this zodiac: Albert Einstein, Johnny Depp, Michael Jordan, Kendrick Lamar, and Frank Sinatra"};
    String[] ratInfo = {"Scientific name: Rattus", "Lifespan: Domestic - 2-4 years, Wild - 10 years", "Habitat: Anywhere - ports, attic, alley, underground, cities, suburbs, and every continent except Antartica", "One interesting thing about rats is: Rats have many similar characteristics as humans. For example, a rat can be peer pressured. They feel the need to conform.", "How many rats are there in the world? More than 2 billion rats", "The story of the rat: The rat is the first animal of the 12-year cycle." +
    "The night before the big race, the rat hid under the ox horn." +
    "The rat planned to stay there during the race because it knew that the ox was the most " +
    "diligent and enduring animal. As expected, the ox was in the lead until the ox got close to " +
    "the finish line and the rat jumped off to become first place. The humans were unhappy by the rat " +
    "cheating, but the Emperor of Heaven viewed the rat’s tricks as a kind of wisdom. As a result, the rat is the first of the Zodiac Gods.", "Years: 1948, 1960, 1972, 1984, 1996, 2008, 2020, 2032", "What does this say about your? People who are born in the year of the rat tend " +
    "to be sociable, cheerful, and thrive in groups. Rat personalities are clever and quick-thinkers. " +
    "They are naturally cautious and tend to observe and avoid risk-taking. A weakness of the rats is that "
    +
    "they tend to be selfish and only care about improving themselves rather than worrying about others.", "What does it say about your success? Rats are able to find success in the fields of music, planning and management, and mathematics.", "Your compatibility with the other animals:", "Rat & rat: You are a committed couple with a lack of mystery because you know each other so well. \nRat & ox: Both of you are willing to share family responsibilities. You know how to work with your complementary characters to help each other work work and home lives. \nRat & dragon: Both of you can be mature and confident. You can trust and give space to each other. \nRat & monkey: You are both understanding and care to support each other. This level of support is the solution when conflict arises.", "Famous people who is this zodiac: Jackson Browne, Apple CEO TIm Cook, Katy Perry, Dwayne ‘The Rock’ Johnson, and Enimen"};
    String[] roosterInfo = {"Scientific name: Gallus gallus domesticus", "Lifespan: 5 years", 
    "Habitat: Roosters can be found in a variety of habitats, including farms, suburban chicken coops, forests, grasslands, and even deserts. They are adaptable creatures and can thrive in diverse environments, from the highlands of Scotland to the tropical regions of Asia and Africa. Roosters prefer to make their nests in secluded areas, such as under bushes or in tall grass." , 
    "One interesting thing about: Roosters have a bad sense of smell and taste, but have good hearing.", 
    "How many roosters are there in the world? 34.4 billion", 
    "The story of the rooster: The rooster always sought to prevail over others. When the Jade Emperor chose the animals to participate in the race, the rooster was not on the list because it was not helpful to humans. The horse told the rooster that it could use its golden voice to wake up humans. When the rooster did, the humans were very grateful, and the Jade Emperor added the rooster to the list. On the day of the race, the rooster and dog came to the race together. During the race, the dog was not able to catch up and placed right after the rooster. Today, the dog is still angry with the rooster. In Chinese culture, the concept of “the dog chasing after the rooster” is still visible today. For example, many Chinese dogs like to chase roosters.", 
    "Years: 1921, 1933, 1945, 1957, 1969, 1981, 1993, 2005, 2017, 2029", 
    "What does this say about you? Roosters are confident, sociable, intelligent and optimistic", 
    "What does it say about your success? Many Roosters have sharp views on hot issues and are good at materializing ideas. Plus their eloquence and great zeal for power, they are very suitable to be a politician, diplomat, or public speaker. For those with less political consciousness, they may consider being a tour guide or an actor/actress, because they barely feel shy when speaking or performing in public. In addition, some people born in the year of the Rooster have a discerning eye for the arts. After taking their interest in appearance into account, they will be in their elements as a fashion designer.", 
    "Your compatibility with the other animals:", "Rooster & ox: Both animals like to think about long-term goals. They also have materialistic goals that they like to work towards because they are both hard-working zodiac animals. \nRooster & snake: Snake and rooster compatibility is defined by common goals and dedication. They both have opposite personalities, but the horoscope predicts a favorable relationship ship because of mutual diligence.",
    "Famous people who is this zodiac: Sophie Scholl, Tom Selleck, Kelly McGillis, Jennifer Aniston, Britney Spears, Justin Timberlake, and Taylor Momsen"};
    String[] snakeInfo = {"Scientific name: Serpentes", "Lifespan: up to 20 years", "Habitat: Any habitat that isn’t arctic or sub-arctic - tropical forests, dry deserts, taigas, forests, meadows", "One interesting thing about snakes: There are 725 species of venomous snakes but only 250 of them can eat a human with one bite.", "How many snakes are there in the world? There are more than 3,000 species", "The story of the snake: The snake is the sixth animal of the Chinese zodiac sign. Long, long ago, the snake had four legs, but the snake was disliked by humans. When the snake heard about this, it ate animals and bit people. The Jade Emperor advised the snake to be good, but the snake refused. As a result, the Jade Emperor cut the snake’s four legs.  The snake realized its mistake and worked to do good deeds for humans. It learned water control from the dragon to prevent floods. The snake was placed after the dragon because the Jade Emperor saw that the snake corrected its mistakes.", "Years: 1953, 1965, 1977, 1989, 2001, 2013, 2025, 2037", "What does this say about you? People who are born in the year of the snake tend to be considerably intelligent, adaptable, and have a calm exterior. Snake personalities have a wide range of interests. They are both goal-orientated and have a keen intuition, which leads to high levels of creativity. A weakness of the snake is that they are emotionally detached, which makes it hard for romantic partners because they struggle with being vulnerable.", "What does it say about your success? Snakes can find success in knowledge-based work, such as a politician, teacher, and psychologist. Snakes prefer to prioritize their ideas without considering what others have to say. This would be helpful in a leadership position.", "Your compatibility with the other animals:", "Snake & sheep: You are both family-oriented. You can work together to create a harmonious family \nSnake & dog: Both of you trust and understand each other to build a lasting and fresh relationship. \nSnake & monkey: Both of you have each other’s needs. Snakes expect tenderness, warmth, and support from a partner. A monkey can meet those needs and another plus is that monkeys are romantic. \nSnake & pig: The pig’s personality matches well with the rabbit’s. Rabbits appreciate the pig’s simplicity and honesty.", "Famous people who is this zodiac: Wilhelm Röntgen, Johann Wolfgang von Goethe, J.K.Rowling, Oprah Winfrey, John F. Kennedy, Pablo Picasso, and Charles Darwin"};
    String[] tigerInfo = {"Scientific name: Panthera tigris", "Lifespan: 26 years in captivity and about 15 years in the wild", "Habitat: Tigers are resilient creatures and can live in various environments. They can typically be found in grasslands, forests, jungles, mangrove swamps and taigas. They can be found close to the eastern coast of Russia, North Korea, China, and Southeast Asia to parts of Indonesia.", "One Interesting thing about tigers: A normal litter size for tigers is 2 to 4 cubs and when the cubs are born they are blind and will not have vision until about 6 to 8 weeks.", "How many tigers are there in the world? There are only 4,500 tigers and some estimate lower.", "The story of the tiger: The Tiger is the 3rd zodiac in the Zodiac, the great race that brought all the animals together to meet the Jade Emperor to decree the years of the calendars. They all need to cross the great river and reach him. The Tiger was third because although it’s strength and size the current had pushed it downstream as it swam across the river.", "Years: 1926, 1938, 1950, 1962, 1974, 1986, 1998, 2010, 2022, 2034", "What does your animal say about you? People who are born in the year of the tiger are thought to be brave, competitive, and charming, and are bestowed good luck and authority. They are said to be very confident leaders with great fortitude. However some negative traits the Year of the Tiger has is likely to be boastful, impulsive, overindulgent, and bad-tempered.", "What does this say about your success? Tigers would work well as leaders and are lucky when it comes to success. Suitable jobs for them are usually ones that have some sort of authoritarian position. Jobs that tigers would do well at are company managers, politicians, policemen, fashion designers, authors/ journalists, revolutionists, principals, and economists.", "Your compatibility with the other animals:", "Tiger & Dog: Both of you are charming, gentle and kind. Both of you are respectful of others' opinions and are not afraid to take a step back. Tigers are very outgoing and good at communicating which works well with the dog who is kindhearted and considerate. \nTiger & Pig: Both of you are very encouraging and extremely loyal and devoted. Though you may have your differences you both admire your partner's qualities. \nTiger & Horse: Both of you are open-minded, good at communication, and exuberant. Tigers are thoughtful and charming, and horses balance that out well because they are virtuous and sweet.", "Famous people who is this zodiac: Rainer Maria Rilke, Marilyn Monroe, Leonardo DiCaprio, Tom Cruise, Steven Irwin, Queen Elizabeth II, Robert Pattinson, and Usain Bolt."};
    String downloadPage = "Download page";

    String enterYearWheelManager = "Enter the Year You Were Born:";
    String zodiacButtonWheelManager = "Get Zodiac";
    String resultWheelManager = "Your Chinese zoidac is the ";
    String[] animalListWheelManager = { "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster",
    "Dog", "Pig" };
    String invalidWheelManager = "Invalid input. Please enter a valid year.";
    String errorWheelManager = "Error";

    String titleSelectAnimal = "Please select an animal that you would like to learn about";

    String player1Game = "Player 1";
    String player2Game = "Player 2";
    String startRaceGame = "Start Race";
    String computerWinsGame = "Winners: ";
    String player1WinsGame = "Player 1 wins!";
    String player2WinsGame = "Player 2 wins!";
    String player1ChooseGame = "Player 1, please choose your zodiac";
    String player2ChooseGame = "Player 2, please choose your zodiac";
     ArrayList<String> animalListGame = new ArrayList<>(Arrays.asList("Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster",
     "Dog", "Pig" ));
    String instructionsGame = "Since the Chinese zodiac animals were chosen based on the Great Race, we invite you to play this racing game. This is a two player game. \n1. Select the animal that you would like to race with \n2. If you are player one, press on the ‘1’ button to move forward \n3. If you are player two, pres on the ‘0’ button to move forward \n4. The first player to the finish line wins the game";
    String instructionsTitleGame = "Instructions";

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

    //will use again
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

    //animals' page
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
    public String getdownloadPage(){
        return downloadPage;
    }

    //Wheel Manager
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

    // Select animal
    @Override
    public String gettitleSelectanimal() {
        return titleSelectAnimal;
    }

    // Game1
    @Override
    public String getplayer1Game() {
        return player1Game;
    }
    @Override
    public String getplayer2Game() {
        return player2Game;
    }
    @Override
    public String getstartRaceGame() {
        return startRaceGame;
    }
    @Override
    public String getcomputerWinsGame() {
        return computerWinsGame;
    }
    @Override
    public String getplayer1WinsGame() {
        return player1WinsGame;
    }
    @Override
    public String getplayer2WinsGame() {
        return player2WinsGame;
    }
    @Override
    public String getplayer1ChooseGame() {
        return player1ChooseGame;
    }
    @Override
    public String getplayer2ChooseGame() {
        return player2ChooseGame;
    }
    @Override
    public ArrayList<String> getanimalListGame() {
        return animalListGame;
    }
    @Override
    public String getinstructionsGame() {
        return instructionsGame;
    }
    @Override
    public String getinstructionsTitleGame() {
        return instructionsTitleGame;
    }
    @Override
    public boolean getisEnglish(){
        return isEnglish;
    }
}