public class Model {
	private int xValue;
	private int yValue;
	private Controller myController;
	
	public Model(Controller c){
		xValue =25;
		yValue =25;
		myController = c;
	}
	
	public void increaseX(int inc){
		xValue+=inc;
	}
	
	public void increaseY(int inc){
		yValue+=inc;
	}
	
	public int getXValue(){
		return xValue;
	}

	public int getYValue(){
		return yValue;
	}
	
	public void setXValue(int x){
		xValue = x;
	}
	
	public void setYValue(int y){
		yValue = y;
	}

}