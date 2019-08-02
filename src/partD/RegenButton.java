package partD;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;

public class RegenButton extends JPanel {
	private JButton regen;
	private ColorChangeBoard controller;
	
	public RegenButton(ColorChangeBoard controller) {
		super();
		this.controller = controller;
		regen = null;
		regen = new JButton("Regenerate Square");
		add(regen);
		regen.addActionListener(controller);
		
		this.setBackground(Color.red);
		this.setPreferredSize(new Dimension(200,100));	
	}
	
	public JButton getRegen() {
		return regen;
	}
	
	public void pressed(){
		ArrayList<Square> data = controller.getInvisbleSquares();
		data.get(new Random().nextInt(data.size())).setVisible(true);
	}

}
