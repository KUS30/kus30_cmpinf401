public class MenuItem {
	private String name; 
	private String description;
	private int calories;
	private double price;
	
	/**
	 * Constructor assigns name, description, calories, and price given the parameters
	 * without specifying the specific type
	 */
	public MenuItem(String name, String description, int calories, double price) {
		this.name = name;
		this.description = description;
		this.calories = calories;
		this.price = price;
	}
	
	/**
	 * Returns the price of an item.
	 * @return Double representing the price of the item.
	 */
	public double getPrice() {
		return this.price;
	}
	/**
	 * Returns the name of the item.
	 * @return String representing the name of the item.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * Returns the description of the item.
	 * @return String representing the description of the item.
	 */
	public String getDescription() {
		return this.description;
	}
	/**
	 * Returns the calories of the item.
	 * @return Integer representing the calories of the item.
	 */
	public int getCalories() {
		return this.calories;
	}
	/**
	 * Sets the name of the item.
	 * @param name String which is the new name of the item.
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Sets the description of the item.
	 * @param description String which is the new description of the item.
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * Sets the calories of the item.
	 * @param name Integer which is the new calorie amount of the item.
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}
	/**
	 * Returns the price of an item.
	 * @param price Double which is the new price of the item.
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * Returns a description of the item.
	 * @return String which is the description of the item.
	 */
	public String toString() {
		return this.getName();
	}
}