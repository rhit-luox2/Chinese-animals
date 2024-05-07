package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;


public class Wheel{

    private int year;
    private Timer spinTimer;
    private final double angleIncrement = 0.3;
    private double currentAngle = 0;
    private double finalAngle;
    protected SpinningWheelPanel wheelPanel;


    public Wheel(){
       
        SpinningWheelPanel wheelPanel = new SpinningWheelPanel(null);

         // Load wheel image and set up the spinning wheel panel
        try {
            BufferedImage wheelImage = ImageIO.read(new File("picture/main1.png"));
            wheelPanel = new SpinningWheelPanel(wheelImage);
        } catch (IOException ex) {
            //JOptionPane.showMessageDialog(this, "Failed to load wheel image.", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }

    }


    void spinWheel() {

        spinTimer = new Timer(10, new ActionListener() {

        
        @Override
        public void actionPerformed(ActionEvent e) {
            if (currentAngle < finalAngle) {
                currentAngle += angleIncrement;
                if (currentAngle > finalAngle) {
                    currentAngle = finalAngle;
                        spinTimer.stop();
                        }
                wheelPanel.setAngle(currentAngle);
            }
        }});
        spinTimer.start();
    
    }

        
        // 10, new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         if (currentAngle < finalAngle) {
        //             currentAngle += angleIncrement;
        //             if (currentAngle > finalAngle) {
        //                 currentAngle = finalAngle;
        //                 spinTimer.stop();
        //                 String zodiac = getZodiacFromAngle(finalAngle);
        //                 JOptionPane.showMessageDialog(WheelManager.this, "Your Chinese zoidac is " + zodiac + "!");
        //                 navigateToZodiacPage(zodiac.toLowerCase());
        //             }
        //             wheelPanel.setAngle(currentAngle);
        //         }
        //     }
        // }

        //spinTimer.start();

    

    double calculateFinalAngle(int year) {
        int yearDifference = (year - 1984) % 12;
        if (yearDifference < 0) {
            yearDifference += 12;
        }
        return (360.0 - ((yearDifference) * 30.0)) % 360;
    }

    private class SpinningWheelPanel extends JPanel {
        private final BufferedImage wheelImage;
        private double angle;

        public SpinningWheelPanel(BufferedImage wheelImage) {
            this.wheelImage = wheelImage;
            setPreferredSize(new Dimension(wheelImage.getWidth(), wheelImage.getHeight()));
            setBackground(Color.BLACK);
        }

        public void setAngle(double angle) {
            this.angle = angle;
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            int x = (getWidth() - wheelImage.getWidth()) / 2;
            int y = (getHeight() - wheelImage.getHeight()) / 2;
            AffineTransform at = AffineTransform.getRotateInstance(Math.toRadians(angle),
                    x + wheelImage.getWidth() / 2.0, y + wheelImage.getHeight() / 2.0);
            at.translate(x, y);
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.drawImage(wheelImage, at, this);
            g2d.dispose();
        }
    }


    
}
