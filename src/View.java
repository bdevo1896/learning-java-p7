import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class View {
	Controller myController;
	JFrame myFrame;
	JPanel mainPanel;
	CirclePanel circlePanel;
	ButtonPanel buttonPanel;

	public View (Controller c){
		myController = c;
		myFrame = new JFrame("This is our Frame");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPanel= new JPanel();
		mainPanel.setPreferredSize(new Dimension(800,600));
		buttonPanel = new ButtonPanel(myController);
		circlePanel = new CirclePanel();
		mainPanel.add(circlePanel);
		mainPanel.add(buttonPanel);
		myFrame.getContentPane().add(mainPanel);
		myFrame.pack();
		myFrame.setVisible(true);
	}

	public void updateCirclePostion(int x, int y){
		circlePanel.setCirclePosition(x, y);
	}
	
	public void updateSquarePostion(int x, int y){
		circlePanel.setSquarePosition(x, y);
	}
	
	public ButtonPanel getButtonPanel(){
		return buttonPanel;
	}

}