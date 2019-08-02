package partD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{
	private Model numOneModel,numTwoModel,numThreeModel;
	//private View myView;
	private DisplayView dView;
	private ButtonView bView;

	public Controller(){
		numOneModel = new Model(this);
		numTwoModel = new Model(this);
		numThreeModel = new Model(this);
		//myView = new View(this);
		bView = new ButtonView(this);
		dView = new DisplayView(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==bView.getButtonPanel().getnumOneButton()){
			numOneModel.incDisplayNum(3);
			numTwoModel.incDisplayNum(3);
		}
		if(arg0.getSource()==bView.getButtonPanel().getnumTwoButton()){
			numTwoModel.incDisplayNum(5);
			numThreeModel.incDisplayNum(5);
		}
		if(arg0.getSource()==bView.getButtonPanel().getnumThreeButton()){
			numOneModel.incDisplayNum(7);
			numThreeModel.incDisplayNum(7);
		}

		dView.updateLabelOne(numOneModel.getDisplayNum());
		dView.updateLabelTwo(numTwoModel.getDisplayNum());
		dView.updateLabelThree(numThreeModel.getDisplayNum());

	}

}