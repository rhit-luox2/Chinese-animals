package main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GermanFlag extends JPanel{
    
    private static final ImageIcon banner = new ImageIcon("picture/German Flag.PNG");
    private JPanel FlagPanel;
    private static int framewidth;

    public GermanFlag(int framewidth) {
        this.framewidth = framewidth;
        this.FlagPanel = new JPanel();
        setSize(framewidth, 100);
        
        JLabel imagLabel = new JLabel(banner);
        // imagLabel.setHorizontalAlignment(SwingConstants.NORTH);
        imagLabel.setBounds(0, 0, 700, 75);
        FlagPanel.add(imagLabel);
    }

    public static void main(String[] args) {
        GermanFlag picturePanel = new GermanFlag(framewidth);
        picturePanel.setVisible(true);
    }
}