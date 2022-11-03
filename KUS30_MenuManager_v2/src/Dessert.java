/**
	 * Class Dessert
 	 * author : Kunal Saxena
	 * created: 10/03/2022
	 */


public class Dessert {
	private String name;
	private String description;
	private int calories;
	
	public Dessert(String name, String description, int calories) {
		this.name = name;
		this.description = description;
		this.calories = calories;
	}
	
	/**
	 * Returns the name of the dessert.
	 * @return String representing the name of the dessert.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * Returns the description of the dessert.
	 * @return String representing the description of the dessert.
	 */
	public String getDescription() {
		return this.description;
	}
	/**
	 * Returns the calories of the dessert.
	 * @return Integer representing the calories of the dessert.
	 */
	public int getCalories() {
		return this.calories;
	}
	/**
	 * Sets the name of the dessert.
	 * @param name String which is the new name of the dessert.
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Sets the description of the dessert.
	 * @param description String which is the new description of the dessert.
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * Sets the calories of the dessert.
	 * @param name Integer which is the new calorie amount of the dessert.
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}
}
