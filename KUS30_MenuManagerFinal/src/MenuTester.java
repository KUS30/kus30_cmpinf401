import java.util.ArrayList;

public class MenuTester{
	public static void main(String[] args){
		MenuManager randomize = new MenuManager("/Users/kunalsaxena/Documents/College/Intermediate Programming/KUS30_MenuManager_v3/src/data/dishes.txt");
		System.out.println(randomize.maxCaloriesMenu().totalCalories());
		System.out.println(randomize.minCaloriesMenu().totalCalories());
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.description()+"\nTotal calories: "+
							myMenu.totalCalories());
		
		ArrayList<Menu> menus = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			menus.add(randomize.randomMenu());
		}
		FileManager.writeMenu("/Users/kunalsaxena/Documents/College/Intermediate Programming/KUS30_MenuManager_v3/src/data/test.txt", menus);
	}
}