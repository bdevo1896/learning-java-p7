package partD;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class BoardView {
	private JFrame frame;
	private JPanel mainPanel;
	private ColorChangeBoard board;
	private RegenButton regen;
	
	public BoardView() {
		frame = new JFrame("Disappearing Squares");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPanel= new JPanel();
		mainPanel.setPreferredSize(new Dimension(600,600));
		board = new ColorChangeBoard();
		regen = new RegenButton(board);
		mainPanel.add(regen);
		mainPanel.add(board);
		frame.getContentPane().add(mainPanel);
		frame.pack();
		frame.setVisible(true);
		
		Timer time = new Timer(1000,board);
		time.start();
	}

}
