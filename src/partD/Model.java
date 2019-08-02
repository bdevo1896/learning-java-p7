package partD;

public class Model{
	
	private int displayNum;
	private Controller myController;

	public Model(Controller c){
	displayNum = 0;
	myController = c;
	}
	
	public int getDisplayNum() {
		return displayNum;
	}

	public void setDisplayNum(int displayNum) {
		this.displayNum = displayNum;
	}
	
	public void incDisplayNum(int incValue){
		displayNum += incValue;
	}
}
