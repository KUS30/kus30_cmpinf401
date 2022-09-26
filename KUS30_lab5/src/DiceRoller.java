import java.util.Random;

import javax.swing.JOptionPane;

public class DiceRoller {
	public static void rollDice(Random rand, int rollCnt) {
		int[] countArr = new int[13];
		for(int i = 0; i < rollCnt; i++)
			countArr[rand.nextInt(1, 7) + rand.nextInt(1, 7)]++;
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
		} while(JOptionPane.showInputDialog("Do you want to continue (Yes/No): ").equals("Yes"));
	}
}
