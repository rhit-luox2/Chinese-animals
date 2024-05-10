package main;

import javax.swing.*;

public class Monkey extends AnimalMain{


    public Monkey(Language myLanguage) {
        super("Scientific name: Ceropothecidae", "Lifespan: up to 40 years", "Habitat: rainforest - in almost every continent", "One interesting thing about monkeys: Monkeys are highly intelligent mammals. They understand numbers and can count. In rare cases, they can multiply.", "How many monkeys are there in the world? 505 known species", "The story of the monkey: The monkey is the ninth animal of the Chinese zodiac sign. " + 
        "Even though the monkey is a common animal, it was able to participate in the Great Race because the tiger " + 
        "owed the monkey a favor for saving his life. However, the tiger king was unhappy that he was being compared to a common monkey. " +
        "The two have been incompatible ever since. During the race, the monkey won ninth place.", "Years: 1956, 1968, 1980, 1992, 2004, 2016, 2028, 2040", "What does this zodiac say about you? People who are born in the year of the monkey tend " + 
        "to be sociable, forward-thinking, and inventive. Monkey personalities are creative and unpredictable. " + 
        "They are naturally sharp-minded and fun to be around. A weakness of the rats is that they lack patience with anything that requires effort.", "What does your zodiac say about your success? Monkeys are able to find success in the fields of sports and entertainment and any career that is tasked with solving complicated problems such as a detective or lawyer.", "Your compatibility with the other animals:", "Monkey & rat: You are both understanding and care to support each other. This level of support is the solution when conflict arises. \nMonkey & dog: Both of you treat each other with respect and know each other’s needs. This couple is mature and can handle conflicts well. \nMonkey & dragon: Both of you understand the importance of cherishing and bonding with each other. You know how to work with each other so that you can learn and help each other because are both ambitious and positive.", "Famous people who is this zodiac: Franz Kafka, Oskar Schindler, Christina Aguilera, Celine Dion, Will Smith, Jennifer Aniston, and Tom Hanks", "picture/longMonkey.jpg", "picture/squaredMonkey.jpg", myLanguage);
        JFrame frame = new JFrame("Monkey");

        super.create(frame, panel, myLanguage);

        description(frame, panel);
        description2(frame, panel);
        description3(frame, panel);
    }

    public static void main(Language myLanguage) {
        new Monkey(myLanguage);
    }

}