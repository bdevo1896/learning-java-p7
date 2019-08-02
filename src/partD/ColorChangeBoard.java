package partD;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

public class ColorChangeBoard extends JPanel implements ActionListener,MouseListener{

	private ArrayList<ArrayList<Square>> squares;
	private Random rand;
	private RegenButton regen;

	public ColorChangeBoard(){
		super();
		this.setBackground(Color.yellow);
		this.setPreferredSize(new Dimension(400,400));
		squares = buildBoard();
		rand = new Random();
		addMouseListener(this);
		regen = new RegenButton(this);
	}


	public void paintComponent(Graphics page){
		super.paintComponent(page);
		//These loops draw out the squares
		for(int i = 0; i < squares.size(); i++){
			for(int j = 0; j < squares.get(i).size(); j++){
				Square s = 	squares.get(i).get(j);
				if(s.isVisible()){
					s.draw(page);
				}
			}
		}
	}


	@Override
	public void actionPerformed(ActionEvent arg) {
		Square s = squares.get(rand.nextInt(10)).get(rand.nextInt(10));
		s.setVisible(false);
		
		if(arg.getSource() == regen.getRegen()){
			regen.pressed();
		}
		
		this.repaint();

	}


	@Override
	public void mouseClicked(MouseEvent e) {
		checkClickedSquare(e);
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * This will check if a square was clicked on and then will change the color of that square.
	 * @param e
	 */
	public void checkClickedSquare(MouseEvent e){
		for(int i = 0; i < (squares.size()); i++){
			for(int j = 0; j < (squares.get(i).size()); j++){
				if(i == 10||j==10){
					break;
				}
				Square s = squares.get(i).get(j);
				if(e.getX()>= s.getX() && e.getX()<= (s.getX()+s.getSide())){
					if(e.getY()>= s.getY() && e.getY()<= (s.getY()+s.getSide())){
						if(!s.isVisible()){
							s.setVisible(true);
						}
					}
				}
			}
		}
	}

	public ArrayList<ArrayList<Square>> buildBoard(){
		ArrayList<ArrayList<Square>> list = new ArrayList<ArrayList<Square>>();
		//x and y will map out the coords for each square.
		int x = 0;
		int y = 0;
		//changer will be used to switch up the colors for each square
		boolean changer = true;
		//These loops will fill the 'squares' list with Square objects
		for(int i = 0; i < 10; i++){
			ArrayList<Square> tmpArray = new ArrayList<Square>();
			for(int j = 0; j < 10; j++){
				if(changer){
					tmpArray.add(new Square(x*40,y*40,40,Color.black,true));
				}else{
					tmpArray.add(new Square(x*40,y*40,40,Color.white,true));
				}
				changer = !changer;
				x++;
			}
			if(changer){
				changer = false;
			}else{
				changer = true;
			}
			list.add(tmpArray);
			x = 0;
			y++;
		}
		return list;
	}
	
	public ArrayList<Square> getInvisbleSquares(){
		ArrayList<Square> tmpArray = new ArrayList<Square>();
		for(int i = 0; i < squares.size(); i++){
			for(int j = 0; j < squares.get(i).size(); j++){
				Square s = squares.get(i).get(j);
				if(!s.isVisible()){
					tmpArray.add(s);
				}
			}
		}
		return tmpArray;
	}
}