package io.github.jiangdequan;

public class Animals {

    protected String scientificName;
    protected String lifeSpan;
    protected String habitat;
    protected String interestingFact;
    protected String pop;
    protected String story;
    protected int year;
    protected String sayAboutYou;
    protected String success;
    protected String compatability;
    protected String famousPeople;


    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Rat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 900);
 
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
 
        Color backgroundColor = new Color(233, 197, 105);
        panel.setBackground(backgroundColor);
 
        panel.add(Box.createVerticalStrut(20));

        private String introScientificName = "Scientific Name: ";
        private String introLifespan = "Lifespan:";
        private String introHabitat = "Habitat: ";
        private String introFact = "Interesting fact:";
        private String introPop = "How many" + this.name "are there in the world?";
        private String introStory = "The story of the " + this.name + ":";
        private String introYear = "Years:";
        private String introAboutYou ="What does this say about you? ";
        private Srting introYourSuccess = "What does your zodiac say about your sucess?"
        private String introComp = "Your compatibility with the other animals:";
        private String introFamous = "Famous people who is this zodiac:";
 
        JTextArea description = new JTextArea(
            this.introScientificName + this.name + System.lineSeparator() + this.introLifespan + this.lifeSpan +  System.lineSeparator() + 
            this.introHabitat + this.habitat + System.lineSeparator() + this.introFact + this.interestingFact + System.lineSeparator();
            this.introPop + this.pop + System.lineSeparator());
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
            this.introStory + this.story + System.lineSeparator() + this.introYear + this.year + System.lineSeparator() + 
            this.introAboutYou + this.sayAboutYou + System.lineSeparator() + this.introYourSuccess + this.success);
        
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
            this.introComp + System.lineSeparator() + wRat + System.lineSeparator() + wOx + System.lineSeparator() + wDragon + System.lineSeparator() + wMonkey + System.lineSeparator() + famous);
        
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

        // hope
    }



    
}