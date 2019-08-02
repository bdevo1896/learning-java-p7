package partD;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {
	JButton numOneButton; 
	JButton numTwoButton; 
	JButton numThreeButton; 

	
	public ButtonPanel(ActionListener controller){
		super();

		numOneButton=null;
		numTwoButton=null;
		numThreeButton=null;
		
		numOneButton = new JButton();
		numOneButton.setText("Change Label 1 & 2");
		add(numOneButton);
		numOneButton.addActionListener(controller);
		
		numTwoButton = new JButton();
		numTwoButton.setText("Change Label 2 & 3");
		add(numTwoButton);
		numTwoButton.addActionListener(controller);

		numThreeButton = new JButton();
		numThreeButton.setText("Change Label 3 & 1");
		add(numThreeButton);
		numThreeButton.addActionListener(controller);
		
		this.setBackground(Color.red);
		this.setPreferredSize(new Dimension(200,400));	
	}
	
	public JButton getnumOneButton() {
		return numOneButton;
	}

	public JButton getnumTwoButton() {
		return numTwoButton;
	}

	public JButton getnumThreeButton() {
		return numThreeButton;
	}
}