package main;

import javax.swing.*;

public class Rabbit extends AnimalMain{


    public Rabbit(Language myLanguage){
        super("Scientific name: Oryctolagus cuniculus", "Lifespan: up to 12 years", "Habitat: Variety - meadows, wetlands, grasslands, marshes, mountain areas, volcanic areas, and every continent except Antartica", "One interesting thing about rabbits: Rabbits start breeding at a very young age. They start when they are three to four months old.", "How many rabbits are there in the world? 200 million to 600 million", "The story of the rabbit: The rabbit is the fourth animal of the Chinese zodiac sign. The rabbit decided to start the race before the rest of the animals. It almost reached the end but it got cocky and took a nap since there were no other animals in sight. The rabbit woke up and saw the speedy tiger pass him. The rabbit was not able to keep up with the fast tiger and persevering ox. Since the rat was hiding in the ox’s horns, the rabbit came fourth in the race.", "Years: 1951, 1963, 1975, 1987, 1999, 2011, 2023, 2035", "What does this say about you? People who are born in the year of the rabbit tend to be courteous to everyone, imaginative, and elegant. Rabbit personalities try to make life as interesting as possible. They seek excitement and tend to escape from reality. A weakness of the rabbits is that they can become paranoid and become jealous easily.", "What does it say about your success? Rabbits are able to find success in quality inspection or reception work. Rabbits prefer a career for a stable life, which means they tend to not be ambitious and seldom make meaningful achievements.", "Your compatibility with the other animals: ", "Rabbit & sheep: You are both family-oriented. You can work together to create a harmonious family.	 \nRabbit & monkey: Both of you have each other’s needs. Rabbits expect tenderness, warmth, and support from a partner. A dog can meet those needs and another plus is that dogs are romantic. \nRabbit & dog: Both of you trust and understand each other to build a lasting and fresh relationship. \nRabbit & pig: The pig’s personality matches well with the rabbit’s. Rabbits appreciate the pig’s simplicity and honesty.", "Famous people who is this zodiac: Albert Einstein, Johnny Depp, Michael Jordan, Kendrick Lamar, and Frank Sinatra", "picture/longRabbit.jpg", "picture/squareRabbit.jpg", myLanguage);
    JFrame frame = new JFrame("Rabbit");
    super.create(frame, panel, myLanguage);

    description(frame, panel);
    description2(frame, panel);
    description3(frame, panel);
    }
    public static void main(Language myLanguage) {
        new Rabbit(myLanguage);
    }
}
