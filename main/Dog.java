package main;

public class Dog extends JFrame{
    public Dog() {
        JFrame frame = new JFrame("Dog");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 900);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        Color backgroundColor = new Color(233, 197, 105);
        panel.setBackground(backgroundColor);

        panel.add(Box.createVerticalStrut(20));

        String name = "Scientific name: Canis lupus familiaris";
        String lifespan1 = "Lifespan: Domestic 10 - 13 years";
        String habitat = "Habitat: Anywhere - Dogs are very adaptable animals and have evolved to very different environments such as the Arctic tundra to tropical rainforests. They can survive in rural and urban areas and can adapt to pretty much any environment. Dogs can be found all over the world and most are domesticated and can pretty much live anywhere with appropriate resources and shelter.";
        String fact = "Interesting thing about the dog:
        Dogs tend to walk on their toes unlike most mammals walking on flat feet and they can be right or left pawed.";
        String pop = "";
        String story = "The dog is 11th in the Zodiac, and in the great race the dog should have been quicker. Since it was a fast runner and the best swimmer, the dog stopped to play in the river and made the excuse that it needed a bath.";
        String year = "Years: 1922, 1934, 1946, 1958, 1970, 1982, 1994, 2006, 2018, 2030";
        String you = "What does this say about your? People that are born in the year of the dog are thought of being honest, loyal, faith driven, smart, forthright, and cordial. They are also considered helpful and have a strong sense of justice.  Some negative traits about the dog are likely to be self-righteous, stubborn, distant, and struggle socially.";
        String success = "What does it say about your success? Rats are able to find success in the fields of music, planning and management, and mathematics.";
        String comp = "Your compatibility with the other animals:";
        String wTiger = "Dog & Tiger:
        Dogs are most compatible with their fellow quick witted animals, and dogs bring a lack of ego to relationships and tigers have to “protect them at all costs“ energy. Very loyal partners and have a great sense of kindness and right and wrong.";
        String wRabbit = "Dog & Rabbit
        Rabbit has a more playful charm that tries to get the dog to relax more. They usually build relationships on honesty and attraction. Rabbits can be insecure but the dog’s loyalty makes the relationship a safe space";
        String wHorse = "Dog & Horse
        Both very straight-forward and frank. Very strong communication skills and bring out the best aspects of each other. The dog convinces the horse that it is more freedom oriented to settle down. While the Dog is inspired by the horse’s outgoing personality.";
        String famous = "Famous people who is this zodiac:Anne Hathaway, Michael Jackson, George W. Bush, Zhou Enlai, Winston Churchill, Donald Trump, Elvis Presley, Kim Jong-un, and Nicki Minaj";

        JTextArea description = new JTextArea(
                name + System.lineSeparator() + lifespan1 + System.lineSeparator()
                        + habitat +
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
                story + System.lineSeparator() + year + System.lineSeparator() + you + System.lineSeparator()
                        + success);

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
                comp + System.lineSeparator() + wRabbit + System.lineSeparator() + wHorse + 
                        + System.lineSeparator() + wTiger + System.lineSeparator() + famous);

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
        new Dog();
    }
    
}
