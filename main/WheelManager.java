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

    WheelManager(){
        // initialize components
        enterYear = new JTextField();
        labelYear = new JLabel();

        //initComponents();

        // Initialize Wheel Page
        JFrame frame = new JFrame("Find Your Zodiac!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 900);
     

        // Setting Background
        Color backgroundColor = new Color(233, 197, 105);
        backgroundColor = enterYear.getBackground();
        //enterYear.getDocument().addDocumentListener(this);

        // Red Color
        Color redColor = new Color(227, 33, 25);

        // Setting Title
        JLabel title = new JLabel("Find Your Zodiac!");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

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

        JButton learnMoreButton = new JButton("Click here to read about the Chinese zodiacs");
        learnMoreButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        learnMoreButton.setAlignmentY(BOTTOM_ALIGNMENT);
        learnMoreButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame selectAnimalFrame = new SelectAnimal();
            selectAnimalFrame.setVisible(true);
            }
        });
        
        labelYear.setText("Enter the Year You Were Born: ");
        
        // Layout and Creating Borders
        JPanel panel = new JPanel(new GridLayout(1, 3, 0, 0));
        panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        panel.setBackground(new Color(233, 197, 105));

        panel.add(labelYear);
        panel.add(enterYear);
        panel.add(getZodiacFYButton);
        panel.add(learnMoreButton);
    }

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
        
        // frame.add(panel);
        // frame.setLocationRelativeTo(null);
        // frame.setVisible(true);
    
        // setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // GroupLayout layout = new GroupLayout(getContentPane());
        // getContentPane().setLayout(layout);
        
	// //Create a parallel group for the horizontal axis
	// ParallelGroup hGroup = layout.createParallelGroup(GroupLayout.Alignment.LEADING);
	
	// //Create a sequential and a parallel groups
	
	// ParallelGroup h1 = layout.createParallelGroup(GroupLayout.Alignment.TRAILING);
	
	// //Add a container gap to the sequential group h1
	
	// //Add our zodiac button and a label to the parallel group h2
	// h1.addComponent(getZodiacFYButton, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE);
	
	// //Create a sequential group h3
	// SequentialGroup h2 = layout.createSequentialGroup();
	// h2.addComponent(labelYear);
	// h2.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED);
	// h2.addComponent(enterYear, GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE);
	 
	// //Add the group h3 to the group h2
	// h1.addGroup(h2);
	// //Add the group h2 to the group h1

	
	// //Add the group h1 to the hGroup
	// hGroup.addGroup(GroupLayout.Alignment.TRAILING, h1);
	// //Create the horizontal group
	// layout.setHorizontalGroup(hGroup);
	
        
	// //Create a parallel group for the vertical axis
	// ParallelGroup vGroup = layout.createParallelGroup(GroupLayout.Alignment.LEADING);
	
	// //Create a parallel group v2
	// ParallelGroup v2 = layout.createParallelGroup(GroupLayout.Alignment.BASELINE);
	// v2.addComponent(labelYear);
	// v2.addComponent(enterYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE);   
  
	// //Add the group v1 to the group vGroup
	// vGroup.addGroup(v2);
	// //Create the vertical group
	// layout.setVerticalGroup(vGroup);
	// pack();
    // }


    // public void search() {
        
    //     String s = enterYear.getText();
    //     if (s.length() <= 1900) {
    //         message("Invalid Search");
    //         return;
    //     }

            // private boolean isItTheYear(String input) {
        //     if (input.contains(enterYear)){
        //         return true;
        //     }
        //     return false;
        // }
        
    //     String content = textArea.getText();
    //     int index = content.indexOf(s, 0);
    //     if (index >= 1900) {   // match found
    //         // try {
    //         //     int end = index + s.length();
    //         //     textArea.setCaretPosition(end);
    //         //     message("'" + s + "' found. Press ESC to end search");
    //         // } 
    //         // catch (BadLocationException e) {
    //         //     e.printStackTrace();
    //         // }
        
    // }
    // }

    // void message(String msg) {
    //     status.setText(msg);
    // }

    // // DocumentListener methods
    
    // public void insertUpdate(DocumentEvent ev) {
    //     search();
    // }
    
    // public void removeUpdate(DocumentEvent ev) {
    //     search();
    // }
    
    // public void changedUpdate(DocumentEvent ev) {
    // }
    
    // class CancelAction extends AbstractAction {
    //     public void actionPerformed(ActionEvent ev) {
    //         enterYear.setText("");
    //     }
    // }



        public static void main(String[] args) {
            new WheelManager();   
    }
}
