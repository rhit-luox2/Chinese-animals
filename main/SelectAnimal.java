package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectAnimal extends JFrame {

    public SelectAnimal() {
        JFrame frame = new JFrame("Select Animal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 900);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        Color backgroundColor = new Color(233, 197, 105);
        panel.setBackground(backgroundColor);

        JLabel title = new JLabel("Please select an animal that you would like to know about");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(Box.createVerticalStrut(20));

        panel.add(title);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        // 1
        JButton rat = new JButton("Rat");
        rat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Rat();
            }
        });
        panel.add(rat);

        // 2
        JButton ox = new JButton("Ox");
        ox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ox();
            }
        });
        panel.add(ox);

        // 3
        JButton tiger = new JButton("Tiger");
        tiger.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "You selected: Tiger");
            }
        });
        panel.add(tiger);

        // 4
        JButton rabbit = new JButton("Rabbit");
        rabbit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "You selected: Rabbit");
            }
        });
        panel.add(rabbit);

        // 5
        JButton dragon = new JButton("Dragon");
        dragon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "You selected: Dragon");
            }
        });
        panel.add(dragon);

        // 6
        JButton horse = new JButton("Horse");
        horse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Horse();
            }
        });
        panel.add(horse);

        // 7
        JButton snake = new JButton("Snake");
        snake.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "You selected: Snake");
            }
        });
        panel.add(snake);

        // 8
        JButton goat = new JButton("Goat");
        goat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "You selected: Goat");
            }
        });
        panel.add(goat);

        // 9
        JButton monkey = new JButton("Monkey");
        monkey.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Monkey();
            }
        });
        panel.add(monkey);

        // 10
        JButton rooster = new JButton("Rooster");
        rooster.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "You selected: Rooster");
            }
        });
        panel.add(rooster);

        // 11
        JButton dog = new JButton("Dog");
        dog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "You selected: Dog");
            }
        });
        panel.add(dog);

        // 12
        JButton pig = new JButton("Pig");
        pig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Pig();
            }
        });
        panel.add(pig);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SelectAnimal();

    }
}