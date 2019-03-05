import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverters implements ActionListener{
	
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	JTextField textfield = new JTextField(20);
	JButton button = new JButton("Convert");
	
public static void main(String[] args) {
	BinaryConverters binaryconverter = new BinaryConverters();
	
}
BinaryConverters(){

	frame.setVisible(true);
	panel.add(label);
	button.setSize(100,20);
	panel.add(button);
	panel.add(textfield);
	frame.add(panel);
	button.setVisible(true);
	button.addActionListener(this);
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	String input = textfield.getText();
	String text = convert(input);
	label.setText(text);
	frame.pack();
}

String convert(String input) {
	System.out.println("Converting !");
    if(input.length() != 8){
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    
    String binary = "[0-1]+";    //must contain numbers in the given range
    if (!input.matches(binary)) {
         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         return "-";
    }
    try {
         int asciiValue = Integer.parseInt(input, 2);
         char theLetter = (char) asciiValue;
         return "" + theLetter;
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
         return "-";
    }
}
}


