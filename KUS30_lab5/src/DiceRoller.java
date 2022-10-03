import java.util.Random;

import javax.swing.JOptionPane;

public class DiceRoller {
	private static void rollDice(Random rand, int rollCnt) {
		int[] countArr = new int[13];
		for(int i = 0; i < rollCnt; i++)
			countArr[(1 + rand.nextInt(6)) + (1 + rand.nextInt(6))]++;
		String result = "";
		for(int i = 2; i <= 12; i++)
			result += ("For the value of " + i + ", the calculated probabilistic value is " + countArr[i] + "/" + rollCnt + "\n"); 
		JOptionPane.showMessageDialog(null, result);
	}
	public static void main(String[] args) {
		Random rand = new Random();
		do {
			int rollCount = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of dice rolls: "));
			rollDice(rand, rollCount);
		} while(JOptionPane.showInputDialog("Do you want to continue (Yes/No): ").equalsIgnoreCase("Yes"));
	}
}