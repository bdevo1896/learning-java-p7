import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {
	JButton moveRightButtonCircle; 
	JButton moveDownButtonCircle; 
	JButton moveLeftButtonCircle; 
	JButton moveUpButtonCircle;
	JButton moveRightButtonSquare; 
	JButton moveDownButtonSquare; 
	JButton moveLeftButtonSquare; 
	JButton moveUpButtonSquare; 

	
	public ButtonPanel(ActionListener controller){
		super();

		moveRightButtonCircle=null;
		moveDownButtonCircle=null;
		moveLeftButtonCircle=null;
		moveUpButtonCircle=null;
		
		moveRightButtonCircle = new JButton();
		moveRightButtonCircle.setText("Move Circle Right");
		add(moveRightButtonCircle);
		moveRightButtonCircle.addActionListener(controller);
		
		moveDownButtonCircle = new JButton();
		moveDownButtonCircle.setText("Move Circle Down");
		add(moveDownButtonCircle);
		moveDownButtonCircle.addActionListener(controller);

		moveLeftButtonCircle = new JButton();
		moveLeftButtonCircle.setText("Move Circle Left");
		add(moveLeftButtonCircle);
		moveLeftButtonCircle.addActionListener(controller);
		
		moveUpButtonCircle = new JButton();
		moveUpButtonCircle.setText("Move Circle Down");
		add(moveUpButtonCircle);
		moveUpButtonCircle.addActionListener(controller);
		
		moveRightButtonSquare=null;
		moveDownButtonSquare=null;
		moveLeftButtonSquare=null;
		moveUpButtonSquare=null;
		
		moveRightButtonSquare = new JButton();
		moveRightButtonSquare.setText("Move Square Right");
		add(moveRightButtonSquare);
		moveRightButtonSquare.addActionListener(controller);
		
		moveDownButtonSquare = new JButton();
		moveDownButtonSquare.setText("Move Square Down");
		add(moveDownButtonSquare);
		moveDownButtonSquare.addActionListener(controller);

		moveLeftButtonSquare = new JButton();
		moveLeftButtonSquare.setText("Move Square Left");
		add(moveLeftButtonSquare);
		moveLeftButtonSquare.addActionListener(controller);
		
		moveUpButtonSquare = new JButton();
		moveUpButtonSquare.setText("Move Square vcDown");
		add(moveUpButtonSquare);
		moveUpButtonSquare.addActionListener(controller);
		
		this.setBackground(Color.cyan);
		this.setPreferredSize(new Dimension(100,600));	
	}
	
	public JButton getMoveRightButtonCircle() {
		return moveRightButtonCircle;
	}

	public JButton getMoveDownButtonCircle() {
		return moveDownButtonCircle;
	}

	public JButton getMoveLeftButtonCircle() {
		return moveLeftButtonCircle;
	}

	public JButton getMoveUpButtonCircle() {
		return moveUpButtonCircle;
	}

	public JButton getMoveRightButtonSquare() {
		return moveRightButtonSquare;
	}

	public JButton getMoveDownButtonSquare() {
		return moveDownButtonSquare;
	}

	public JButton getMoveLeftButtonSquare() {
		return moveLeftButtonSquare;
	}

	public JButton getMoveUpButtonSquare() {
		return moveUpButtonSquare;
	}
}