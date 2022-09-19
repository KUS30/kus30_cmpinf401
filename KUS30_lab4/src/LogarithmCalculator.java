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
	private static boolean checkInput(int base, int input) {
		return base > 1 && input > 0; 
	}
	public static void main(String[] args) {
		int input = Integer.parseInt(JOptionPane.showInputDialog("Enter your initial value: "));
		int base = Integer.parseInt(JOptionPane.showInputDialog("Enter your base: "));
		while(!checkInput(base, input)) {
			input = Integer.parseInt(JOptionPane.showInputDialog("Enter your initial value: "));
			base = Integer.parseInt(JOptionPane.showInputDialog("Enter your base: "));
		}
		JOptionPane.showMessageDialog(null, "The answer to your logarithm is: " + calculateLogarithm(base, input));
	}
}
