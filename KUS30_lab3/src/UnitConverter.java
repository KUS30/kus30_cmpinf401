import javax.swing.JOptionPane;

public class UnitConverter {
	public static String converter(String input) {
		//Splits 
		String strVal = input.substring(0, input.indexOf(' '));
		double convValue = Double.parseDouble(strVal);
		String unit = input.substring(input.indexOf(' ') + 1, input.length());
		if(unit.equalsIgnoreCase("cm")) {
			double newValue = convValue / 2.54;
			return input + " = " + String.format("%.3f", newValue) + " in";
		}
		else if(unit.equalsIgnoreCase("in")) {
			double newValue = convValue * 2.54;
			return input + " = " + String.format("%.3f", newValue) + " cm";
		}
		else if(unit.equalsIgnoreCase("m")) {
			double newValue = convValue * 1.094;
			return input + " = " + String.format("%.3f", newValue) + " yd";
		}
		else if(unit.equalsIgnoreCase("yd")) {
			double newValue = convValue / 1.094;
			return input + " = " + String.format("%.3f", newValue) + " m";
		}
		else if(unit.equalsIgnoreCase("oz")) {
			double newValue = convValue * 28.35;
			return input + " = " + String.format("%.3f", newValue) + " gm";
		}
		else if(unit.equalsIgnoreCase("gm")) {
			double newValue = convValue / 28.35;
			return input + " = " + String.format("%.3f", newValue) + " oz";
		}
		else if(unit.equalsIgnoreCase("lb")) {
			double newValue = convValue / 2.205;
			return input + " = " + String.format("%.3f", newValue) + "kg";
		}
		else if(unit.equalsIgnoreCase("kg")) {
			double newValue = convValue * 2.205;
			return input + " = " + String.format("%.3f", newValue) + " lb";
		}
		return "";
	}
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, converter(JOptionPane.showInputDialog("Enter your value: ")));
	}
}
