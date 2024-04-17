package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tiger implements Animals{

    public class Tiger(){
        String scientificName = "Panthera tigris";
        String lifeSpan =  "26 years in captivity and about 15 years in the wild";
        String habitat = "Tigers are resilient creatures and can live in various different environments. 
                        They can typically be found in grasslands, forests, jungles, mangrove swamps and taigas. 
                        They can be found close to the eastern coast of Russia, North Korea, China, and Southeast 
                        Asia to parts of Indonesia.";

        String interestingFact = "A normal litter size for tigers is 2 to 4 cubs and when the cubs are born they are blind
                             and will not have vision until about 6 to 8 weeks.";
        String pop = "";
        String years = "1926, 1938, 1950, 1962, 1974, 1986, 1998, 2010, 2022, 2034";
        String sayAboutYou = "People that are born in the year of the tiger are thought to be brave," +
                            " competitive, charming and are bestowed good luck and authority. They are said " +
                            "to be very confident leaders with great fortitude. However some negative traits " +
                            "the year of the tiger has is likely to be boastful, impulsive, overindulged," + 
                            " and bad-tempered. ";
        String success = "Tigers would work well as leaders and are lucky when it comes to success. Suitable "+
                        "jobs for them are usually ones that have some sort of authoritarian position. Jobs " +
                        "that tigers would do well at are company managers, politicians, policemen, fashion " + 
                        "designers, authors/ journalists, revolutionists, principles, and economists. ";
        String compatability = "
        Tiger & Dog: /n
        Both of you are charming, gentle and kind. Both of you are respectful of others opinions" + 
        "and are not afraid to take a step back. Tigers are very outgoing and good at communicating" +
        "which works well with the dog who is kindhearted and considerate. /n
        Tiger & Pig: /n
        Both of you are very encouraging and are extremely loyal and devoted." +
        "Though you may have your differences you both admire your partner's qualities. /n
        Tiger & Horse: /n
        Both of you are open minded, good at communication and exuberant. Tigers are thoughtful" + 
        " and charming, and horses balance that out well because they are virtuous and sweet.";
        String story = "The Tiger is the 3rd zodiac in the Zodiac, the great race that brought" +
                    " all the animals together to meet the Jade Emperor to decree the years of the calendars."
                    + " They all need to cross the great river and reach him. The Tiger was third because "+ 
                    "although it’s strength and size the current had pushed it down stream as it swam across" +
                    " the river."
        String famousPeople = "Marilyn Monroe, Leonardo DiCaprio, Tom Cruise, Steven Irwin, Queen Elizabeth II,"+ 
                                "Robert Pattinson, and Usain Bolt. ";
    }


    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Tiger");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 900);
 
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
 
        Color backgroundColor = new Color(233, 197, 105);
        panel.setBackground(backgroundColor);
 
        panel.add(Box.createVerticalStrut(20));

       
        String habitat = "Habitat: ";
        String fact = "One Interesting thing about tigers: A normal litter size for tigers is 2 to 4 cubs and when the cubs are born they are blind and will not have vision until about 6 to 8 weeks.";
        String pop = "How many monkeys are there in the world? 505 known species";
        String story = "The story of the monkey: The monkey is the ninth animal of the Chinese zodiac sign. " + 
        "Even though the monkey is a common animal, it was able to participate in the Great Race because the tiger " + 
        "owed the monkey a favor for saving his life. However, the tiger king was unhappy that he was being compared to a common monkey. " +
        "The two have been incompatible ever since. During the race, the monkey won ninth place.";
        String year = "Years: 1956, 1968, 1980, 1992, 2004, 2016, 2028, 2040";
        String you ="What does this say about you? People who are born in the year of the monkey tend " + 
        "to be sociable, forward-thinking, and inventive. Monkey personalities are creative and unpredictable. " + 
        "They are naturally sharp-minded and fun to be around. A weakness of the rats is that they lack patience with anything that requires effort.";
        String success = "What does it say about your success? Monkeys are able to find success in the fields of sports and entertainment and any career that is tasked with solving complicated problems such as a detective or lawyer.";
        String comp = "Your compatibility with the other animals:";
        String wRat = "Monkey & rat: You are both understanding and care to support each other. This level of support is the solution when conflict arises.";
        String wDog = "Monkey & dog: Both of you treat each other with respect and know each other’s needs. This couple is mature and can handle conflicts well.";
        String wDragon = "Monkey & dragon: Both of you understand the importance of cherishing and bonding with each other. You know how to work with each other so that you can learn and help each other because are both ambitious and positive.";
        String famous = "Famous people who is this zodiac: Christina Aguilera, Celine Dion, Will Smith, Jennifer Aniston, Tom Hanks, and Justine Timberlake";
 
        JTextArea description = new JTextArea(
            name + System.lineSeparator() + lifespan1 + System.lineSeparator() + habitat +
            System.lineSeparator() + fact + System.lineSeparator() + pop);
        
        description.setWrapStyleWord(true);
        description.setLineWrap(true);
        description.setOpaque(false);
        description.setEditable(false);
        description.setAlignmentX(Component.CENTER_ALIGNMENT);
        description.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(description);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JTextArea description2 = new JTextArea(
            story + System.lineSeparator() + year + System.lineSeparator() + you + System.lineSeparator() + success);
        
        description2.setWrapStyleWord(true);
        description2.setLineWrap(true);
        description2.setOpaque(false);
        description2.setEditable(false);
        description2.setAlignmentX(Component.CENTER_ALIGNMENT);
        description2.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(description2);
    
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JTextArea description3 = new JTextArea(
            comp + System.lineSeparator() + wRat + System.lineSeparator() + wDog + System.lineSeparator() + wDragon + System.lineSeparator() + famous);
        
        description3.setWrapStyleWord(true);
        description3.setLineWrap(true);
        description3.setOpaque(false);
        description3.setEditable(false);
        description3.setAlignmentX(Component.CENTER_ALIGNMENT);
        description3.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(description3);
    
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    //hello5635

}
