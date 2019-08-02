package partD;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DisplayPanel extends JPanel {

	private Label labelOne,labelTwo,labelThree;

	public DisplayPanel() {
		super();
		labelOne = new Label("Label 1: ",0,0,50);
		labelTwo = new Label("Label 2: ",0,0,100);
		labelThree = new Label("Label 3: ",0,0,150);
		this.setBackground(Color.yellow);
		this.setPreferredSize(new Dimension(200,200));
	}

	public void setLabelOneNum(int value){
		labelOne.setValue(value);
		repaint();
	}

	public void setLabelTwoNum(int value){
		labelTwo.setValue(value);
		repaint();
	}

	public void setLabelThreeNum(int value){
		labelThree.setValue(value);
		repaint();
	}
	
	public void paintComponent(Graphics page){
		super.paintComponent(page);		
		labelOne.draw(page);
		labelTwo.draw(page);
		labelThree.draw(page);
	}

}
