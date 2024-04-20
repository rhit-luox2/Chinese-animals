package main;

import javax.swing.*;
import javax.swing.GroupLayout.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WheelManager extends JFrame {

    private static JTextField enterYear;
    private JLabel labelYear;
    private JButton getZodiacFYButton;
    private JSplitPane splitPane;

    WheelManager(){
        // initialize components
        enterYear = new JTextField();
        labelYear = new JLabel();
        splitPane = new JSplitPane();
        


        //initComponents();

        // Initialize Wheel Page
        JFrame frame = new JFrame("Find Your Zodiac!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 900);
     

        // Setting Background
        Color backgroundColor = new Color(233, 197, 105);
        enterYear.setBackground(backgroundColor);
        //enterYear.getDocument().addDocumentListener(this);

        // Red Color
        Color redColor = new Color(227, 33, 25);

        // Setting Title
        JLabel title = new JLabel("Find Your Zodiac!");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setAlignmentY(Component.TOP_ALIGNMENT);

        //// Adds Text Box
        // panel.add(Box.createVerticalStrut(20)); 

        getZodiacFYButton = new JButton("Get Zodiac");
        getZodiacFYButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            try {
                int userentered = Integer.parseInt(enterYear.getText());
                JOptionPane.showMessageDialog(null, "Entered integer: " + userentered);
    
            }
            catch (NumberFormatException eNumberFormatException){
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter an integer.");
            }
        }
        });
        // getZodiacFYButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        // getZodiacFYButton.setAlignmentY(20);

        JButton learnMoreButton = new JButton("Click here to read about the Chinese zodiacs");
        // learnMoreButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        // learnMoreButton.setAlignmentY(20);
        learnMoreButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame selectAnimalFrame = new SelectAnimal();
            selectAnimalFrame.setVisible(true);
            }
        });
        
        labelYear.setText("Enter the Year You Were Born: ");
        
        // Layout and Creating Borders
        JPanel panel = new JPanel(new GridLayout(1, 3, 30, 50));
        panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        //panel.setComponentOrientation(getComponentOrientation());
        panel.setBackground(backgroundColor);

        JPanel panel2 = new JPanel();
        panel2.add(learnMoreButton);
        panel2.setBackground(backgroundColor);

        JPanel inputPanel = new JPanel();


        panel.add(labelYear);
        panel.add(enterYear);
        panel.add(getZodiacFYButton);


        getContentPane().setLayout(new GridLayout()); 
         // the default GridLayout is like a grid with 1 column and 1 row,
        // we only add one element to the window itself
        getContentPane().add(splitPane);               
        // due to the GridLayout, our splitPane will now fill the whole window

        // let's configure our splitPane:
        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT); 
        // we want it to split the window verticaly
        splitPane.setDividerLocation(200);                    
        // the initial position of the divider is 200 (our window is 400 pixels high)
        splitPane.setTopComponent(panel);                  
        // at the top we want our "topPanel"
        splitPane.setBottomComponent(panel2);            
        // and at the bottom we want our "bottomPanel"
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS)); 
        // BoxLayout.Y_AXIS will arrange the content vertically
    

        // Enter their Year
        // panel.add(Box.createVerticalStrut(20));

        // JTextField enterYear = new JTextField(
        //         "ex. 1999");
        // enterYear.setPreferredSize(new Dimension(20, 20) );;
        // enterYear.setOpaque(false);
        // enterYear.setEditable(true);
        // enterYear.setAlignmentX(Component.CENTER_ALIGNMENT);
        // enterYear.setBorder(BorderFactory.createDashedBorder(redColor, 1, 0));

        
       
        // panel.add(description);
        // panel.add(Box.createRigidArea(new Dimension(0, 20)));
        // panel.add(enterYear);
        // panel.add(Box.createRigidArea(new Dimension(0, 5)));
        // panel.add(learnMoreButton);
        // panel.add(Box.createRigidArea(new Dimension(0, 30)));

        inputPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 75));     
        // we set the max height to 75 and the max width to (almost) unlimited
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.X_AXIS));   
        // X_Axis will arrange the content horizontally

        inputPanel.add(enterYear); 
        
        frame.add(panel);
        frame.add(panel2);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    
        // setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // GroupLayout layout = new GroupLayout(getContentPane());
        // getContentPane().setLayout(layout);
	
    }

        public static void main(String[] args) {
            new WheelManager();   
    }
}
