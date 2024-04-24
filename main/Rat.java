package main;

import javax.swing.*;

public class Rat extends AnimalMain {

    public Rat() {
        super("Scientific name: Rattus", "Lifespan: Domestic - 2-4 years, Wild - 10 years", "Habitat: Anywhere - ports, attic, alley, underground, cities, suburbs, and every continent except Antartica", "One interesting thing about rats is: Rats have many similar characteristics as humans. For example, a rat can be peer pressured. They feel the need to conform.", "How many rats are there in the world? More than 2 billion rats", "The story of the rat: The rat is the first animal of the 12-year cycle." +
        "The night before the big race, the rat hid under the ox horn." +
        "The rat planned to stay there during the race because it knew that the ox was the most " +
        "diligent and enduring animal. As expected, the ox was in the lead until the ox got close to " +
        "the finish line and the rat jumped off to become first place. The humans were unhappy by the rat " +
        "cheating, but the Emperor of Heaven viewed the rat’s tricks as a kind of wisdom. As a result, the rat is the first of the Zodiac Gods.", "Years: 1948, 1960, 1972, 1984, 1996, 2008, 2020, 2032", "What does this say about your? People who are born in the year of the rat tend " +
        "to be sociable, cheerful, and thrive in groups. Rat personalities are clever and quick-thinkers. " +
        "They are naturally cautious and tend to observe and avoid risk-taking. A weakness of the rats is that "
        +
        "they tend to be selfish and only care about improving themselves rather than worrying about others.", "What does it say about your success? Rats are able to find success in the fields of music, planning and management, and mathematics.", "Your compatibility with the other animals:", "Rat & rat: You are a committed couple with a lack of mystery because you know each other so well. \nRat & ox: Both of you are willing to share family responsibilities. You know how to work with your complementary characters to help each other work work and home lives. \nRat & dragon: Both of you can be mature and confident. You can trust and give space to each other. \nRat & monkey: You are both understanding and care to support each other. This level of support is the solution when conflict arises.", "Famous people who is this zodiac: Apple CEO TIm Cook, Katy Perry, Dwayne ‘The Rock’ Johnson, and Enimen");
        JFrame frame = new JFrame("Rat");
        super.create(frame, panel);

        description(frame, panel);
        description2(frame, panel);
        description3(frame, panel);
    }

    public static void main(String[] args) {
        new Rat();
    }

}