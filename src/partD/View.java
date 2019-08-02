package partD;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class View {
	Controller myController;
	JFrame myFrame;
	JPanel mainPanel;
	DisplayPanel displayPanel;
	ButtonPanel buttonPanel;

	public View (Controller c){
		myController = c;
		myFrame = new JFrame("Changing Labels");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPanel= new JPanel();
		mainPanel.setPreferredSize(new Dimension(600,600));
		buttonPanel = new ButtonPanel(myController);
		displayPanel= new DisplayPanel();
		mainPanel.add(displayPanel);
		mainPanel.add(buttonPanel);
		myFrame.getContentPane().add(mainPanel);
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
	
	public ButtonPanel getButtonPanel(){
		return buttonPanel;
	}

}