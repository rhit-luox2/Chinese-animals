package main;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GermanFlag extends JFrame{
    
    private static final ImageIcon banner = new ImageIcon("picture/German Flag.PNG");
    JFrame frame;
    JPanel panel;

    public GermanFlag() {
        this.frame = new JFrame();
        this.panel = new JPanel();
        setTitle("Picture Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        // JLabel imagLabel = new JLabel(banner);
        // imagLabel.setHorizontalAlignment(SwingConstants.NORTH);
        // panel.add(imagLabel);
    }

    public void create(JFrame frame, JPanel panel){
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(233, 197, 105));
        panel.add(banner, BorderLayout.WEST);
    }

    public static void main(String[] args) {
        GermanFlag pictureFrame = new GermanFlag();
        pictureFrame.setVisible(true);
    }
}