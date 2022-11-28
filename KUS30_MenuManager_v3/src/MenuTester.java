import java.util.ArrayList;

public class MenuTester{
	public static void main(String[] args){
		MenuManager randomize = new MenuManager("data/dishes.txt");
		System.out.println(randomize.maxCaloriesMenu());
		System.out.println();
		System.out.println(randomize.minCaloriesMenu());
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.description()+"\nTotal calories: "+
							myMenu.totalCalories());
		
		ArrayList<Menu> menus = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			menus.add(randomize.randomMenu());
		}
		FileManager.writeMenu("data/test.txt", menus);
	}
}