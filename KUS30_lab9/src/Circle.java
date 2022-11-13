public class Circle {
	private double radius = 5.0;
	private String color = "Green";
	
	public Circle() {
		this(5.0, "Green");
	}
	public Circle(double radius) {
		this(radius, "Green");
	}
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
}
