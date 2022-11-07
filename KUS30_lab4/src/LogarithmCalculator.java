import javax.swing.JOptionPane;

public class LogarithmCalculator {
	public static int calculateLogarithm(int base, int input) {
		int counter = 0;
		int currValue = input;
		while(currValue >= base) {
			currValue /= base;
			counter++; 
		}
		return counter;
	}
	public static void main(String[] args) {
		int input = Integer.parseInt(JOptionPane.showInputDialog("Enter your initial value: "));
		int base = Integer.parseInt(JOptionPane.showInputDialog("Enter your base: "));
		while(!(base > 1 && input > 0)) {
			input = Integer.parseInt(JOptionPane.showInputDialog("Enter your initial value: "));
			base = Integer.parseInt(JOptionPane.showInputDialog("Enter your base: "));
		}
		JOptionPane.showMessageDialog(null, "The answer to your logarithm is: " + calculateLogarithm(base, input));
	}
}