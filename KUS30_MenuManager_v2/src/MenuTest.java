/**
	 * Class MenuTest
 	 * author : Kunal Saxena
	 * created: 10/03/2022
	 */

public class MenuTest {

	public static void main(String[] args) {
		Menu menu1 = new Menu("Menu1"); 
		Menu menu2 = new Menu("Menu2");
		
		Entree entree1 = new Entree("Chicken Tenders", "A deep-fried strip of chicken without bones or skin", 600);
		Entree entree2 = new Entree("Pizza", "A dish made typically of flattened bread dough spread with a savory mixture usually including tomatoes and cheese and often other toppings and baked", 800);
		
		Side side1 = new Side("Tater Tots", "Grated potatoes formed into small cylinders and deep-fried, often served as a side dish", 200);
		
		Salad salad1 = new Salad("Chicken Caesar Salad", "A green salad of romaine lettuce and croutons dressed with lemon juice (or lime juice)", 500);
		Salad salad2 = new Salad("Caprese Salad", "A simple Italian salad, made of sliced fresh mozzarella, tomatoes, and sweet basil, seasoned with salt, and olive oil", 550);
		
		Dessert dessert1 = new Dessert("Tiramisu", "An elegant and rich layered Italian dessert made with delicate ladyfinger cookies, espresso or instant espresso, mascarpone cheese, eggs, sugar, Marsala wine, rum and cocoa powder.", 400);
		
		menu1.setEntree(entree1);
		menu1.setSalad(salad1);
		
		menu2.setEntree(entree2);
		menu2.setSide(side1);
		menu2.setSalad(salad2);
		menu2.setDessert(dessert1);
		
		System.out.println("Name: " + menu1.getName());
		System.out.println();
		System.out.println("Description: ");
		System.out.println(menu1.description());
		System.out.println("Total Calories: " + menu1.totalCalories());
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("Name: " + menu2.getName());
		System.out.println();
		System.out.println("Description: ");
		System.out.println(menu2.description());
		System.out.println("Total Calories: " + menu2.totalCalories());
	}

}
