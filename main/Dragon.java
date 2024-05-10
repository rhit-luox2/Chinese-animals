package main;

import javax.swing.*;

public class Dragon extends AnimalMain {

    public Dragon(Language myLanguage) {
        super("Scientific Name: N/A", "Lifespan: N/A", "Habitat: N/A", "One interesting fact about dragons: In China, dragons symbolize wealth, power, and leadership because Chinese emperors were believed to be descendants of dragons.", "How many dragons are there in the world? N/A", "The story of the dragon: The dragon was the fifth zodiac. Although it should have been faster, the dragon had stopped by a village to provide rain and helped the rabbit by blowing it to shore.", "Years: 1904, 1916, 1928, 1940, 1952, 1964, 1976, 1988, 2000, 2012, 2024", "What does this zodiac say about you? Dragons are seen as powerful, kind-hearted, prosperous, brave, leaders, and innovative. They can also be scrutinizing, egotistical, easy to anger, and overconfident.", "What does your zodiac say about your success? Dragons can do almost any job with high proficiency and efficiency. They can succeed in the science or art fields. Jobs recommended for dragons are healthcare workers, entrepreneurs, teachers, psychologists, and writers.", "Your compatibility with other animals:", "Dragon & Rat: Appreciative of each other's traits despite differences.\nDragon & Monkey: They bring out the best in each other, balancing passion and humor.\nDragon & Rooster: Driven and straight forward, they both know what they want.", "Famous People: Ruth Westheimer, John Lennon, Bruce Lee, Rihanna, Martin Luther King Jr., Vladimir Putin, Shakira, Jeb Bush, Christian Dior, Robert Oppenheimer, Shirley Temple, Adele, Dr. Seuss, Sandra Bullock, Alexei Nikolaevich", "picture/longDragon.jpg", "picture/squareDragonPicture.jpg", myLanguage);
        JFrame frame = new JFrame("Dragon");
        super.create(frame, panel, myLanguage);

        description(frame, panel);
        description2(frame, panel);
        description3(frame, panel);
    }

    public static void main(Language myLanguage) {
        new Dragon(myLanguage);
    }
}
