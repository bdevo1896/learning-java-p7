package partCB;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class DisplayPanel extends JPanel{
	
	private MovableObject pieceOne,pieceTwo,pieceThree,pieceFour;
	private ArrayList<MovableObject> data;
	
	public DisplayPanel(Controller c) {
		super();
		data.add(pieceOne);
		data.add(pieceTwo);
		data.add(pieceThree);
		data.add(pieceFour);
		
		for(int i = 0; i < data.size(); i++){
			
		}
		
	}

	public void setPieceOnePosition(int x, int y){

	}

	public void setPieceTwoPosition(int x, int y){

	}

	public void setPieceThreePosition(int x, int y){

	}

	public void setPieceFourPosition(int x, int y){

	}
	
	public void paintComponent(Graphics page){
		super.paintComponent(page);		
		
	}

}
