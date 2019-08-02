package partD;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DisplayView {
	Controller myController;
	JFrame myFrame;
	DisplayPanel displayPanel;

	public DisplayView (Controller c){
		myController = c;
		myFrame = new JFrame("Display");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		displayPanel= new DisplayPanel();
		myFrame.getContentPane().add(displayPanel);
		myFrame.pack();
		myFrame.setVisible(true);
	}
	
	public void updateLabelOne(int value){
		displayPanel.setLabelOneNum(value);
	}
	
	public void updateLabelTwo(int value){
		displayPanel.setLabelTwoNum(value);
	}
	
	public void updateLabelThree(int value){
		displayPanel.setLabelThreeNum(value);
	}
	
}