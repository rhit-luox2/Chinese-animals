package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class AnimalMain {

    String name;
    String lifespan;
    String habitat;
    String fact;
    String pop;

    String story;
    String year;
    String you;
    String success;

    String comp;
    String w;
    String famous;

    JFrame frame;
    JPanel panel;
    String text;
    Color textColor;
    ActionListener listener;

    String image1Icon;
    String image2Icon;
    Image image1;
    Image image2;

    JScrollPane jsp;
    JPanel scrollBarPanel;

    public AnimalMain(String a, String b, String c, String d, String e, String f,
            String g, String h, String i, String j, String k, String l, String m,
            String n) {
        this.name = a;
        this.lifespan = b;
        this.habitat = c;
        this.fact = d;
        this.pop = e;

        this.story = f;
        this.year = g;
        this.you = h;
        this.success = i;

        this.comp = j;
        this.w = k;
        this.famous = l;

        this.image1Icon = m;
        this.image2Icon = n;

        this.panel = new JPanel();
        this.frame = new JFrame();
    }

    public void create(JFrame frame, JPanel panel) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 1200);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        //addScrollBar();

        
        Color backgroundColor = new Color(233, 197, 105);
        panel.setBackground(backgroundColor);

        panel.add(Box.createVerticalStrut(20));
        

    }

    public void description(JFrame frame, JPanel panel) {

        JTextArea description = new JTextArea(
                name + System.lineSeparator() + lifespan + System.lineSeparator()
                        + habitat +
                        System.lineSeparator() + fact + System.lineSeparator() + pop);

        description.setWrapStyleWord(true);
        description.setLineWrap(true);
        description.setOpaque(false);
        description.setEditable(false);
        description.setAlignmentX(Component.CENTER_ALIGNMENT);
        description.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(description);

        ImageIcon originalIcon = new ImageIcon(image1Icon);
        Image image1 = originalIcon.getImage();
        Image resizedImage = image1.getScaledInstance(240, 240, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        JLabel imageLabel = new JLabel(resizedIcon);
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(imageLabel);

        // jsp = new JScrollPane(panel);
        // jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        // frame.add(jsp);

       // addScrollBar();
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }

    public void description2(JFrame frame, JPanel panel) {
        JTextArea description2 = new JTextArea(
                story + System.lineSeparator() + year + System.lineSeparator()
                        + you +
                        System.lineSeparator() + success);

        description2.setWrapStyleWord(true);
        description2.setLineWrap(true);
        description2.setOpaque(false);
        description2.setEditable(false);
        description2.setAlignmentX(Component.CENTER_ALIGNMENT);
        description2.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(description2);

       // addScrollBar();

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // jsp = new JScrollPane(panel);
        // jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        // frame.add(jsp);

        ImageIcon originalIcon = new ImageIcon(image2Icon);
        Image image2 = originalIcon.getImage();
        Image resizedImage = image2.getScaledInstance(240, 240, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        JLabel imageLabel = new JLabel(resizedIcon);
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(imageLabel);
    

    }

    public void description3(JFrame frame, JPanel panel) {
        JTextArea description3 = new JTextArea(
                comp + System.lineSeparator() + w + System.lineSeparator()
                        + famous);

        description3.setWrapStyleWord(true);
        description3.setLineWrap(true);
        description3.setOpaque(false);
        description3.setEditable(false);
        description3.setAlignmentX(Component.CENTER_ALIGNMENT);
        description3.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(description3);
        createButton(textColor, listener);
    

        // jsp = new JScrollPane(panel);
        // jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        // frame.add(jsp);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public void createButton(Color textColor, ActionListener listener) {
        JButton learnMoreButton = new JButton("Click here to read about the Chinese zodiacs");
        learnMoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Learn More button clicked");
                new SelectAnimal();
            }
        });
        learnMoreButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(learnMoreButton);

        JButton findyourZod = new JButton("Click here to find your zodiac or your friend's zodiac");
        findyourZod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Find Your Zodiac button clicked");
                new WheelManager();
            }
        });
        findyourZod.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(findyourZod);

        // jsp = new JScrollPane(panel);
        // jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        // frame.add(jsp);


        panel.revalidate();
        panel.repaint();
    }
    public void addScrollBar(){

        panel.add(jsp);
        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        frame.add(jsp);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }

    public void finalizeFrame() {
        addScrollBar();
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}