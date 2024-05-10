//Kaila James
package main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GermanFlag extends JFrame{
    
    private static final ImageIcon banner = new ImageIcon("picture/German Flag.PNG");
    private JPanel FlagPanel;

    public GermanFlag() {
        this.FlagPanel = new JPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        JLabel imagLabel = new JLabel(banner);
        imagLabel.setHorizontalAlignment(SwingConstants.NORTH);
        imagLabel.setBounds(0, 0, 700, 75);
        FlagPanel.add(imagLabel);
    }

    private class FlagPanel extends JPanel{

        public SpinningWheelPanel(BufferedImage wheelImage) {
            this.banner = wheelImage;
            setPreferredSize(new Dimension(wheelImage.getWidth(), wheelImage.getHeight()));
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.drawi;
            g2d.dispose();
        }
    }

    public static void main(String[] args) {
        GermanFlag pictureFrame = new GermanFlag();
        pictureFrame.setVisible(true);
    }
}