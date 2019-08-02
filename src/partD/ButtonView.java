package partD;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonView {
	Controller myController;
	JFrame myFrame;
	ButtonPanel buttonPanel;

	public ButtonView (Controller c){
		myController = c;
		myFrame = new JFrame("Changing Labels");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttonPanel = new ButtonPanel(myController);
		myFrame.getContentPane().add(buttonPanel);
		myFrame.pack();
		myFrame.setVisible(true);
	}
	
	public ButtonPanel getButtonPanel(){
		return buttonPanel;
	}

}