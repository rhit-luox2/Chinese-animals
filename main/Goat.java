package main;

import javax.swing.*;

public class Goat extends AnimalMain{


    public Goat() {
        super("Scientific name: Capra hircus", "Lifespan: upto 18 years", "Habitat: Goats have been domesticated for many years and they typically have been used by humans for manual labor, for their milk and fur. They are excellent climbers and can pretty much survive in any climate except for extreme heat or cold. They typically like grassy areas and migrate with a herd. They typically are found in Asia, North America, and parts of Europe.", "One interesting thing about rats is: Rats have many similar characteristics as humans. For example, a rat can be peer pressured. They feel the need to conform.", "How many goats are there in the world? around one billion goats", "The story of the goat: The goat was given 8th place in the zodiac race. The rooster, monkey, and goat had a plan to pull a raft to get themselves across the river.", "Years: 1907, 1919, 1931, 1943, 1955, 1967, 1979, 1991, 2003, 2015, 2027", "What does this zodiac say about you? Goats are typically polite, shy, mellow, and visionary. However, goats can be pessimistic, unrealistic, only see things one way and slow in behavior. They tend to have high endurance and are very driven by the people around them. They are also ideal innovators, creative and compassionate.", "What does your animal say about your success? Although goats are considered shy, weak, and more feminine. They are very charming and graceful and talented in art and music. Suitable jobs would be medicine, philanthropology, artists, writers, dancers, philosophers, teachers, nurses, service workers, and salesmen.", "Your compatibility with the other animals:", "Goat & rabbit: Both are very thoughtful of each other's desires. Sheep are very romantic, Rabbits are very reflective and they tend to compliment each other well. Rabbits tend to look ahead and plan, while sheep are very fearful of what might come. Goats are very willing to pursue their many dreams and Rabbits are more cautious and calculated. They both recognize each other's flaws and find ways to still get along. \nGoat & pig: The goat and pig have a very balanced, fun and loving relationship. Although the goat is impulsive, the pig steadies the goat. The pig is typically the organizer in the relationship, while the goat contributes with their creativity and enrichment. They might battle between structure and freedom between the two but they tend to share common values which cements their relationship. \nGoat & horse: Goats are sentimental and kind; they also tend to be jealous. However, horses are very calm and able to keep the goat interested. They are most compatible as friends which strengthens their relationship as a couple. The only thing that is recommended is they need to have independence in their relationship and keep an open mind.", "Famous people who is this zodiac: Steve Jobs, George Harrison, Bruce Willis, Bill Gates, Kurt Cobain, Billie Jean King, Tita Moerno, Mikhail Gorachev, Olivia Rodrigo, Julia Roberts, John Wayne, Mick Jagger, Ed Sheeran");
        JFrame frame = new JFrame("Goat");
        super.create(frame, panel);

        description(frame, panel);
        description2(frame, panel);
        description3(frame, panel);
    }

    public static void main(String[] args) {
        new Goat();
    }
    
}
