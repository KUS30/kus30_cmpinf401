public class MyRectangle {
	private int startX;
	private int startY;
	private int width;
	private int height;
	
	public MyRectangle() {
		this.startX = 0;
		this.startY = 0;
		this.width = 0;
		this.height = 0;
	}
	public MyRectangle(int startX, int startY, int width, int height) {
		this.startX = startX;
		this.startY = startY;
		this.width = width;
		this.height = height;
	}
	public int area() {
		return this.width * this.height;
	}
	public String toString() {
		return "Rectangle properties: " + "\n" + "Starts at (" + this.startX + ", " + this.startY + ") with width of " + this.width + " and height of " + this.height + ".";
	}
	public boolean isInside(int X, int Y) {
		return (X >= startX && X <= (startX + width)) && (Y >= startY && Y <= (startY + height));
	}
	public int getX() {
		return this.startX;
	}
	public int getY() {
		return this.startY;
	}
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	public void setSize(int newWidth, int newHeight) {
		this.width = newWidth;
		this.height = newHeight; 
	}
	public void setPosition(int newX, int newY) {
		this.startX = newX;
		this.startY = newY; 
	}
}
