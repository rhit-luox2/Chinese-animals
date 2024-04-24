package main;

import javax.swing.*;

public class Snake extends AnimalMain{


    public Snake() {
        super("Scientific name: Serpentes", "Lifespan: up to 20 years", "Habitat: Any habitat that isn’t arctic or sub-arctic - tropical forests, dry deserts, taigas, forests, meadows", "One interesting thing about snakes: There are 725 species of venomous snakes but only 250 of them can eat a human with one bite.", "How many snakes are there in the world? There are more than 3,000 species", "The story of the snake: The snake is the sixth animal of the Chinese zodiac sign. Long, long ago, the snake had four legs, but the snake was disliked by humans. When the snake heard about this, it ate animals and bit people. The Jade Emperor advised the snake to be good, but the snake refused. As a result, the Jade Emperor cut the snake’s four legs.  The snake realized its mistake and worked to do good deeds for humans. It learned water control from the dragon to prevent floods. The snake was placed after the dragon because the Jade Emperor saw that the snake corrected its mistakes.", "Years: 1953, 1965, 1977, 1989, 2001, 2013, 2025, 2037", "What does this say about you? People who are born in the year of the snake tend to be considerably intelligent, adaptable, and have a calm exterior. Snake personalities have a wide range of interests. They are both goal-orientated and have a keen intuition, which leads to high levels of creativity. A weakness of the snake is that they are emotionally detached, which makes it hard for romantic partners because they struggle with being vulnerable.", "What does it say about your success? Snakes can find success in knowledge-based work, such as a politician, teacher, and psychologist. Snakes prefer to prioritize their ideas without considering what others have to say. This would be helpful in a leadership position.", "Your compatibility with the other animals:", "Snake & sheep: You are both family-oriented. You can work together to create a harmonious family.", " Snake & dog: Both of you trust and understand each other to build a lasting and fresh relationship.", " Snake & monkey: Both of you have each other’s needs. Snakes expect tenderness, warmth, and support from a partner. A monkey can meet those needs and another plus is that monkeys are romantic." , " Snake & pig: The pig’s personality matches well with the rabbit’s. Rabbits appreciate the pig’s simplicity and honesty.", "Famous people who is this zodiac: Wilhelm Röntgen, Johann Wolfgang von Goethe, J.K.Rowling, Oprah Winfrey, John F. Kennedy, Pablo Picasso, and Charles Darwin", "picture/longSnake.jpg", "picture/squareSnake.jpg");
        JFrame frame = new JFrame("Snake");
        super.create(frame, panel);

        description(frame, panel);
        description2(frame, panel);
        description3(frame, panel);
    }

    public static void main(String[] args) {
        new Snake();
    }

}
