package partCB;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {
	JButton moveRightButton; 
	JButton moveDownButton; 
	JButton moveLeftButton; 
	JButton moveUpButton;
	
	public ButtonPanel(ActionListener controller){
		super();

		moveRightButton=null;
		moveDownButton=null;
		moveLeftButton=null;
		moveUpButton=null;
		
		moveRightButton = new JButton();
		moveRightButton.setText("Move  Right");
		add(moveRightButton);
		moveRightButton.addActionListener(controller);
		
		moveDownButton = new JButton();
		moveDownButton.setText("Move  Down");
		add(moveDownButton);
		moveDownButton.addActionListener(controller);

		moveLeftButton = new JButton();
		moveLeftButton.setText("Move  Left");
		add(moveLeftButton);
		moveLeftButton.addActionListener(controller);
		
		moveUpButton = new JButton();
		moveUpButton.setText("Move  Down");
		add(moveUpButton);
		moveUpButton.addActionListener(controller);
		
		this.setBackground(Color.cyan);
		this.setPreferredSize(new Dimension(100,600));	
	}
	
	public JButton getMoveRightButton() {
		return moveRightButton;
	}

	public JButton getMoveDownButton() {
		return moveDownButton;
	}

	public JButton getMoveLeftButton() {
		return moveLeftButton;
	}

	public JButton getMoveUpButton() {
		return moveUpButton;
	}
}