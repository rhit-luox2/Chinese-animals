package main;

import javax.swing.*;

public class Horse extends AnimalMain {

    public Horse(Language myLanguage) {
        super("Scientific name: Equus ferus caballus", "Lifespan: 30 years", "Habitat: Varies from grasslands to forests, mountains, wetlands, deserts, tundra, savannahs, coastal regions, steppes, and more.", "One interesting thing about horses: They were the most frequent transport means in ancient societies and are considered one of the six most important animals in China.", "How many horses are there in the world? Approximately 60 million", "The story of the horse: Legend goes that the horse had wings in ancient times and was named Holy Horse, capable of running on the ground, swimming, and flying. Due to its arrogance, the Jade Emperor ordered its wings cut and buried it under Kunlun Mountain. Human ancestor Ren Zu later freed it, and the horse dedicated its life to serving humans.", "Years: 1918, 1930, 1942, 1954, 1966, 1978, 1990, 2002, 2014, 2026", "What does this say about you? Horses are cheerful, enthusiastic, insightful, and considerate.", "What does it say about your success? The Horses have a quick wit and good judgment, which helps them to gain some chances at a career. However, an impulsive personality may cause them to suffer setbacks and failures. If the Horses can strengthen their willpower and don’t give up halfway, they can get extraordinary achievements. The Horses are active and love exploring the world, so adventurers and tour guides are suitable jobs for them. And they can always perform well in jobs like writers, businessmen, and artists, where they can display their talents without any restrictions.", "Your compatibility with other animals:", "Horse & tiger: Both of you are open-minded, good at communication, and exuberant. Tigers are thoughtful and charming, and horses balance that out well because they are virtuous and sweet. \nHorse & sheep: Goats are sentimental and kind; they also tend to be jealous. However, horses are very calm and able to keep the goat interested. They are most compatible as friends which strengthens their relationship as a couple. The only thing that is recommended is they need to have independence in their relationship and keep an open mind.  \nHorse & rabbit: Horses and rabbits are opposites. To work well together, they must be willing to compromise. Their compatibility is their unconscious need for each other. For example, the friendly, cautious rabbits are drawn to the resolute, hot-tempered horses. Their compatibility depends on the genders of the horse and rabbit.", "Famous people who is this zodiac: Helmut Kohl, Paul McCartney, Angela Merkel, Jackie Chan, Kobe Bryant, Kristen Stewart, and Greta Thunberg", "picture/horselong.jpg", "picture/squareHorse.jpg", myLanguage);
        JFrame frame = new JFrame("Horse");
        super.create(frame, panel, myLanguage);

        description(frame, panel);
        description2(frame, panel);
        description3(frame, panel);
    }

    public static void main(Language myLanguage) {
        new Horse(myLanguage);
    }
}
