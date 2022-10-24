import javax.swing.JOptionPane;

public class ArrayOperations {

	public static void main(String[] args) {
		int size = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of your array: "));
		double[] array = generateArray(size);
		JOptionPane.showMessageDialog(null, printValues(array));
	}
	private static double[] generateArray(int size) {
		double[] arrayValues = new double[size * 2];
		for(int i = 0; i < size; i++) {
			double randValue = Math.random() * 1000;
			while(randValue == 0.0)
				randValue = Math.random() * 1000;
			arrayValues[i] = randValue;
		}
		for(double d : arrayValues)
			System.out.print(d + " ");
		return arrayValues;
	}
	public static double max(double [] data) {
		double maxValue = Double.MIN_VALUE;
		for(int i = 0; i < data.length / 2; i++) 
			if(data[i] > maxValue)
				maxValue = data[i];
		return maxValue;
	}
	public static double min(double [] data) {
		double minValue = Double.MAX_VALUE;
		for(int i = 0; i < data.length / 2; i++)
			if(data[i] < minValue)
				minValue = data[i];
		return minValue;
	}
	public static double sum(double [] data) {
		double sum = 0;
		for(double val : data)
			sum += val;
		return sum;
	}
	public static double ave(double [] data) {
		return sum(data) / (data.length / 2); 
	}
	public static String printValues(double[] data) {
		String s = "Here is the description of the Array: " + "\n";
		s += "Maximum value of array: " + String.format("%.3f", max(data)) + "\n";
		s += "Minimum value of array: " + String.format("%.3f", min(data)) + "\n";
		s += "Sum of values in array: " + String.format("%.3f", sum(data)) + "\n";
		s += "Average of values in array: " + String.format("%.3f", ave(data));
		return s;
	}
}
