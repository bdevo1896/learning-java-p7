package partCB;
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
		myFrame = new JFrame("This is our Frame");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPanel= new JPanel();
		mainPanel.setPreferredSize(new Dimension(800,600));
		buttonPanel = new ButtonPanel(myController);
		displayPanel = new DisplayPanel(myController);
		mainPanel.add(displayPanel);
		mainPanel.add(buttonPanel);
		myFrame.getContentPane().add(mainPanel);
		myFrame.pack();
		myFrame.setVisible(true);
	}

	public void updatePieceOne(int x, int y){
		displayPanel.setPieceOnePosition(x, y);
	}
	
	public void updatePieceTwo(int x, int y){
		displayPanel.setPieceTwoPosition(x, y);
	}
	
	public void updatePieceThree(int x, int y){
		displayPanel.setPieceThreePosition(x, y);
	}
	
	public void updatePieceFour(int x, int y){
		displayPanel.setPieceFourPosition(x, y);
	}
	
	public ButtonPanel getButtonPanel(){
		return buttonPanel;
	}

}