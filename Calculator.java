// Jeffrey Williams
// COP 3330 Object Oriented Programming
// Project 11 Calculator GUI (non-functioning)

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Calculator extends JFrame 
{
   private final JPanel buttonJPanel; // panel to hold buttons
   private final JButton[] buttons; 
   private static final String[] names = 
		{"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};   
   private final JTextField textField;
   
   // no-argument constructor
   public Calculator()
   {
      super("Calculator");      
      buttons = new JButton[names.length]; 
      buttonJPanel = new JPanel(); 

      buttonJPanel.setLayout(new GridLayout(4, 4, 10, 10));

      // create and add buttons
      for (int count = 0; count < buttons.length; count++) 
      {
    	  buttons[count] = new JButton(names[count]);
          buttonJPanel.add(buttons[count]); // add button to JFrame
      } 
      add(buttonJPanel, BorderLayout.CENTER); // add panel to JFrame
      buttonJPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

      textField = new JTextField();

      add(textField, BorderLayout.NORTH); // add text to JFrame
      textField.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
   } 
} // end class Calculator
