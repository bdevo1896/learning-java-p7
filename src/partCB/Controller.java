package partCB;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{
	private Model pieceOne,pieceTwo,pieceThree,pieceFour;
	private View myView;
	private ButtonPanel bPanel;
	private boolean isMoving;

	public Controller(){
		pieceOne = new Model(this);
		pieceTwo = new Model(this);
		pieceThree = new Model(this);
		pieceFour = new Model(this);
		myView = new View(this);
		bPanel = myView.getButtonPanel();
		isMoving = false;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(!isMoving){
			if(arg0.getSource() == bPanel.getMoveLeftButton()){

			}

			if(arg0.getSource() == bPanel.getMoveUpButton()){

			}

			if(arg0.getSource() == bPanel.getMoveRightButton()){

			}

			if(arg0.getSource() == bPanel.getMoveDownButton()){

			}
		}
	}

	/**
	 * This will move a piece to a clicked square.
	 * @param s
	 */
	public void movePiece(Model m,int x, int y){
		isMoving = true;
		Runnable run = new Runnable(){
			public void run(){
				int i = 0;
				while(i < 50){
					
					if(m.getX()<x){
						m.setX(m.getX()+1);
					}else if(m.getX()>x){
						m.setX(m.getX()-1);
					}
					
					if(m.getY()<y){
						m.setY(m.getY()+1);
					}else if(m.getY()>y){
						m.setY(m.getY()-1);
					}
					
					try {Thread.sleep(3);}
					catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					i++;
				}
			}
		};

		Thread thr = new Thread(run);
		thr.start();
		
		isMoving = false;
	}

}