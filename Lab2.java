import javax.swing.JOptionPane;

public class Lab2 {
	public static void pythagoreanTheorem() {
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter your first number: "));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter your first number: "));
		double c = Math.sqrt((num1 * num1) + (num2 * num2));
		JOptionPane.showMessageDialog(null, "Your number is: " + String.format("%.3f", c)); 
	}
	public static void calculateCircle() {
		double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius: "));
		double area = Math.PI * (radius * radius);
		double perimeter = 2 * Math.PI * radius; 
		JOptionPane.showMessageDialog(null, "The circle with radius " + radius + " has an area of " + String.format("%.3f", area) + " and a perimeter of " + String.format("%.3f", perimeter));
	}
	public static void decomposeMoney() {
		int money = Integer.parseInt(JOptionPane.showInputDialog("Enter monetary amount: "));
		int[] monValues = new int[4];
		for(int i = 3; i >= 0; i--) {
			monValues[i] = (int) (money / Math.pow(10, i));
			money = (int) (money % Math.pow(10, i));
		}
		JOptionPane.showMessageDialog(null, monValues[3] + " grands\n" + monValues[2] + " benjamins\n" + monValues[1] + " sawbucks\n" + monValues[0] + " bucks");
	}
	public static void main(String[] args) {
		pythagoreanTheorem();
		calculateCircle();
		decomposeMoney();
	}
}