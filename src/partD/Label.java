package partD;

import java.awt.Graphics;

public class Label {
	
	private String message;
	private int value,x,y;
	
	public Label(String message, int value, int x, int y) {
		this.message = message;
		this.value = value;
		this.x = x;
		this.y = y;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void draw(Graphics page){
		page.drawString(message + value, x, y);
	}

}
