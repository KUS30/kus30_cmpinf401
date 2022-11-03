/**
	 * Class Menu
 	 * author : Kunal Saxena
	 * created: 10/03/2022
	 */

public class Menu {
	String name;
	Entree entree;
	Salad salad;
	Side side;
	Dessert dessert;
	
	public Menu(String name) {
		this.name = name;
	}
	public Menu(String name, Entree entree, Side side) {
		this.name = name;
		this.entree = entree;
		this.side = side;
	}
	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.dessert = dessert;
	}
	
	/**
	 * Determines and returns the total calories of the menu.
	 * @return Integer representing the total calories.
	 */
	public int totalCalories() {
		int sumCalories = 0;
		if(entree != null)
			sumCalories += entree.getCalories(); 
		if(salad != null)
			sumCalories += salad.getCalories(); 
		if(side != null)
			sumCalories += side.getCalories(); 
		if(dessert != null)
			sumCalories += dessert.getCalories(); 
		return sumCalories;
	}
	/**
	 * Gives the name of the menu.
	 * @return String representing the name of the menu.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * Gives the reference to the Entree object.
	 * @return Entree representing the reference to the Entree object.
	 */
	public Entree getEntree() {
		return this.entree;
	}
	/**
	 * Gives the reference to the Side object.
	 * @return Side representing the reference to the Side object.
	 */
	public Side getSide() {
		return this.side;
	}
	/**
	 * Gives the reference to the Salad object.
	 * @return Salad representing the reference to the Salad object.
	 */
	public Salad getSalad() {
		return this.salad;
	}
	/**
	 * Gives the reference to the Dessert object.
	 * @return Dessert representing the reference to the Dessert object.
	 */
	public Dessert getDessert() {
		return this.dessert;
	}
	/**
	 * Sets the reference for the Entree object.
	 * @param entree representing the new Entree object reference.
	 */
	public void setEntree(Entree entree) {
		this.entree = entree;
	}
	/**
	 * Sets the reference for the Side object.
	 * @param side representing the new Side object reference.
	 */
	public void setSide(Side side) {
		this.side = side;
	}
	/**
	 * Sets the Salad for the Side object.
	 * @param salad representing the new Salad object reference.
	 */
	public void setSalad(Salad salad) {
		this.salad = salad;
	}
	/**
	 * Sets the reference for the Dessert object.
	 * @param dessert representing the new Dessert object reference.
	 */
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
	/**
	 * Gives a description of the entire menu.
	 * @return String representing the description of the elements in the menu.
	 */
	public String description() {
		String desc = "";
		if(entree != null)
			desc += ("Entree: " + entree.getName() + ". " + entree.getDescription() + "\n"); 
		if(salad != null)
			desc += ("Salad: " + salad.getName() + ". " + salad.getDescription() + "\n");
		if(side != null)
			desc += ("Side: " + side.getName() + ". " + side.getDescription() + "\n");
		if(dessert != null)
			desc += ("Dessert: " + dessert.getName() + ". " + dessert.getDescription() + "\n");
		return desc;
	}
}
