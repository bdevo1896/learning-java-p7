import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{
	private Model myModel,myModel2;
	private View myView;

	public Controller(){
		myModel = new Model(this);
		myModel2 = new Model(this);
		myView = new View(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//Check to see if the source of the button click is the right button

		if(arg0.getSource()==myView.getButtonPanel().getMoveRightButtonCircle()){
			myModel.increaseX(10);
		}

		//Check to see if the source of the button click is the down button
		if(arg0.getSource()==myView.getButtonPanel().getMoveDownButtonCircle()){
			myModel.increaseY(10);
		}

		//Check to see if the source of the button click is the left button

		if(arg0.getSource()==myView.getButtonPanel().getMoveLeftButtonCircle()){
			myModel.increaseX(-10);
		}

		//Check to see if the source of the button click is the up button
		if(arg0.getSource()==myView.getButtonPanel().getMoveUpButtonCircle()){
			myModel.increaseY(-10);
		}

		//Check to see if the source of the button click is the right button (square)

		if(arg0.getSource()==myView.getButtonPanel().getMoveRightButtonSquare()){
			myModel2.increaseX(10);
		}

		//Check to see if the source of the button click is the down button (square)
		if(arg0.getSource()==myView.getButtonPanel().getMoveDownButtonSquare()){
			myModel2.increaseY(10);
		}

		//Check to see if the source of the button click is the left button (square)

		if(arg0.getSource()==myView.getButtonPanel().getMoveLeftButtonSquare()){
			myModel2.increaseX(-10);
		}

		//Check to see if the source of the button click is the up button (square)
		if(arg0.getSource()==myView.getButtonPanel().getMoveUpButtonSquare()){
			myModel2.increaseY(-10);
		}

		myView.updateCirclePostion(myModel.getXValue(), myModel.getYValue());
		myView.updateSquarePostion(myModel2.getXValue(), myModel2.getYValue());
	}

}