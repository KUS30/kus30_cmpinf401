/**
	 * Class MenuManager
 	 * author : Kunal Saxena
	 * created: 11/01/2022
	 */

import java.util.ArrayList;

public class MenuManager {
	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;
	
	/**
	 * Assigns a MenuItem to each list by identifying the specific child of MenuItem the object is.
	 */
	public MenuManager(String dishesFile) {
		ArrayList<MenuItem> dishes = FileManager.readItems(dishesFile);
		entrees = new ArrayList<Entree>();
		sides = new ArrayList<Side>();
		salads = new ArrayList<Salad>();
		desserts = new ArrayList<Dessert>();
		for(MenuItem item : dishes) {
			if(item instanceof Entree)
				entrees.add((Entree) item);
			else if(item instanceof Salad)
				salads.add((Salad) item);
			else if(item instanceof Side)
				sides.add((Side) item);
			else if(item instanceof Dessert)
				desserts.add((Dessert) item);
		}
	}
	
	/**
	 * Given a four lists of Entrees, Sides, Salads, and Desserts, 
	 * create a menu by randomly picking an element from each of the lists.
	 */
	public Menu randomMenu() {
		Menu randMenu = new Menu("Random Menu");
		if(entrees.size() > 0) 
			randMenu.setEntree(entrees.get((int) (Math.random() * entrees.size())));
		if(sides.size() > 0) 
			randMenu.setSide(sides.get((int) (Math.random() * sides.size())));
		if(salads.size() > 0) 
			randMenu.setSalad(salads.get((int) (Math.random() * salads.size())));
		if(desserts.size() > 0) 
			randMenu.setDessert(desserts.get((int) (Math.random() * desserts.size())));	
		return randMenu;
	}
	/**
	 * Finds the menu which has the highest amount of calories
	 * @return Menu object represent the menu with the highest number of calories
	 */
	public Menu maxCaloriesMenu() {
		Menu highestMenu = new Menu("Highest Menu");
		Entree highestEntree = null;
		Side highestSide = null;
		Salad highestSalad = null;
		Dessert highestDessert = null;
		if(entrees.size() > 0) {
			int highest = 0;
			for(Entree e : entrees) {
				if(e.getCalories() > highest) {
					highestEntree = e;
					highest = e.getCalories();
				}
			}
		}
		if(sides.size() > 0) {
			int highest = 0;
			for(Side s : sides) {
				if(s.getCalories() > highest) {
					highestSide = s;
					highest = s.getCalories();
				}
			}
		}
		if(salads.size() > 0) {
			int highest = 0;
			for(Salad s : salads) {
				if(s.getCalories() > highest) {
					highestSalad = s;
					highest = s.getCalories();
				}
			}
		}
		if(desserts.size() > 0) {
			int highest = 0;
			for(Dessert d : desserts) {
				if(d.getCalories() > highest) {
					highestDessert = d;
					highest = d.getCalories();
				}
			}
		}
		highestMenu.setSide(highestSide);
		highestMenu.setDessert(highestDessert);
		highestMenu.setEntree(highestEntree);
		highestMenu.setSalad(highestSalad);
		return highestMenu;
	}
	/**
	 * Finds the menu which has the lowest amount of calories
	 * @return Menu object represent the menu with the lowest number of calories
	 */
	public Menu minCaloriesMenu() {
		Menu lowestMenu = new Menu("Lowest Menu");
		Entree lowestEntree = null;
		Side lowestSide = null;
		Salad lowestSalad = null;
		Dessert lowestDessert = null;
		if(entrees.size() > 0) {
			int lowest = Integer.MAX_VALUE;
			for(Entree e : entrees)
				if(e.getCalories() < lowest) {
					lowestEntree = e;
					lowest = e.getCalories();
				}
		}
		if(sides.size() > 0) {
			int lowest = Integer.MAX_VALUE;
			for(Side s : sides)
				if(s.getCalories() < lowest) {
					lowestSide = s;
					lowest = s.getCalories();
				}
		}
		if(salads.size() > 0) {
			int lowest = Integer.MAX_VALUE;
			for(Salad s : salads)
				if(s.getCalories() < lowest) {
					lowestSalad = s;
					lowest = s.getCalories();
				}
		}
		if(desserts.size() > 0) {
			int lowest = Integer.MAX_VALUE;
			for(Dessert d : desserts)
				if(d.getCalories() < lowest) {
					lowestDessert = d;
					lowest = d.getCalories();
				}
		}
		lowestMenu.setSide(lowestSide);
		lowestMenu.setDessert(lowestDessert);
		lowestMenu.setEntree(lowestEntree);
		lowestMenu.setSalad(lowestSalad);
		return lowestMenu;
	}
	
	public ArrayList<Entree> getEntrees() {
		return entrees;
	}
	public void setEntrees(ArrayList<Entree> entrees) {
		this.entrees = entrees;
	}
	public ArrayList<Side> getSides() {
		return sides;
	}
	public void setSides(ArrayList<Side> sides) {
		this.sides = sides;
	}
	public ArrayList<Salad> getSalads() {
		return salads;
	}
	public void setSalads(ArrayList<Salad> salads) {
		this.salads = salads;
	}
	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}
	public void setDesserts(ArrayList<Dessert> desserts) {
		this.desserts = desserts;
	}
}