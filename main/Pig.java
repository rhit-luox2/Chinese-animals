package main;

import javax.swing.*;

public class Pig extends AnimalMain{

    public Pig() {
        super("Scientific name: Sus scrofa domesticus", "Lifespan: 15 years", "Habitat: Pigs are adaptable animals that can live in a wide variety of habitats. They can occupy pastures, farmland, forests, shrublands, grasslands, wetlands, savanna, and even remote islands.", "One interesting thing about pigs: Pigs are highly intelligent and consistently rank between the top 4 and top 7 of the most intelligent animals on Earth.", "How many pigs are there in the world? about 778.64 million", "The story of the pig: The pig was selected as a Chinese zodiac sign for its efforts. The Jade Emperor stipulated that the first arrived animals on the competition day would be selected as the zodiac signs. The pig knew that it was heavy and walked slowly, so it got up at midnight to line up. However, the pig met many obstacles on the long journey; it exerted all its strength and crawled up to the Heavenly Southern Gate. The competition was over and the pig struggled to beg, other domestic animals also pleaded for it. Finally, the god was moved and let in, thus the pig became the last zodiac sign. In this way, all of the six domestic animals, namely horse, ox, sheep, rooster, dog, and pig, became the Chinese zodiac signs.", "Years: 1923, 1935, 1947, 1959, 1971, 1983, 1995, 2007, 2019, 2031, 2043", "What does this say about you? Pigs are diligent, upright, compassionate, and responsible.", "Chinese zodiac Pig signs are always more peaceful and upright, which means that the Pig is not suitable to seek development in competitive industries like finance and commerce. Instead, they can perform well in public service, being good teachers or civil servants. Pigs also have a strong thirst for knowledge and were born with a passion for science and art, thus professors and artists are suitable jobs for them. Last but not least, they love nature and are glad to work with animals and plants.", "Your compatibility with the other animals:", "Pig & tiger: Both of you are very encouraging and extremely loyal and devoted. Though you may have your differences you both admire your partner's qualities. \nPig & rabbit: The pig’s personality matches well with the rabbit’s. Rabbits appreciate the pig’s simplicity and honesty. \nPig & sheep: The sheep and pig have a very balanced, fun, and loving relationship. Although the sheep is impulsive, the pig steadies the sheep. The pig is typically the organizer in the relationship, while the sheep contribute with their creativity and enrichment. They might battle between structure and freedom between the two but they tend to share common values which cements their relationship.", "Famous people who is this zodiac: Nicole Brown Simpson, Ronald Reagan, Woody Allen, Arnold Schwarzenegger, Hillary Clinton, Mariah Carey, and Kendall Jenner", "picture/piglong.jpg", "picture/squarePig.jpg");
        JFrame frame = new JFrame("Pig");
        super.create(frame, panel);

        description(frame, panel);
        description2(frame, panel);
        description3(frame, panel);
    }

    public static void main(String[] args) {
        new Pig();
    }
}
