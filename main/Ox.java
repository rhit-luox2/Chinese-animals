package main;

import javax.swing.*;

public class Ox extends AnimalMain {

    public Ox(Language myLanguage) {
        super("Scientific name: Bos taurus", "Lifespan: about 15 years", "Habitat: North America, Europe, Asia, and Africa; no wild oxen in South America and Australia", "One interesting thing about oxen is: Oxen have been domesticated for over 6,000 years, used for agricultural purposes.", "How many oxen are there in the world? About 300 to 400 million", "The story of the ox: Ox ranks the second among the Chinese zodiacs because it helped the Rat but was later tricked by it. The myth goes that the Jade Emperor declared the order of zodiac signs would be based on the arrival orders of 12 animals. Ox could have arrived first but kindly gave a ride to Rat. However, when arriving, Rat just jumped to the terminus ahead of Ox, and thus Ox lost the first place.", "Years: 1913, 1925, 1937, 1949, 1961, 1973, 1985, 1997, 2009, 2021, 2033", "What does this say about you? Oxen are faithful, obliging, persistent, and sympathetic", "What does it say about your success? Oxen are typical realists, upright and simple, suited for roles like lawyers, consultants, doctors, and technicians.", "Your compatibility with the other animals:", "Ox & rat: Both of you are willing to share family responsibilities. You know how to work with your complementary characters to help each other work work and home lives. \nOx & snake: Their compatibility is considered to be excellent because they have similar preferences. This allows them to collaborate and understand each other well. The spontaneity of the snake is able to inspire the rational and meticulous ox. \nOx & rooster: Both animals like to think about long-term goals. They also have materialistic goals that they like to work towards because they are both hard-working zodiac animals.", "Famous people of this zodiac: Lothar Mattaus, Walt Disney, Margaret Thatcher, Diana Spencer, Barack Obama, and Bruno Mars", "picture/oxlong.jpg", "picture/squareox.jpg", myLanguage);
        JFrame frame = new JFrame("Ox");
        super.create(frame, panel, myLanguage);

        description(frame, panel);
        description2(frame, panel);
        description3(frame, panel);
    }

    public static void main(Language myLanguage) {
        new Ox(myLanguage);
    }
}