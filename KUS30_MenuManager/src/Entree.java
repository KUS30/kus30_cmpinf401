/**
	 * Class Entree
 	 * author : Kunal Saxena
	 * created: 10/03/2022
	 */

public class Entree {
	private String name;
	private String description;
	private int calories;
	
	public Entree(String name, String description, int calories) {
		this.name = name;
		this.description = description;
		this.calories = calories;
	}
	
	/**
	 * Returns the name of the entree.
	 * @return String representing the name of the entree.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * Returns the description of the entree.
	 * @return String representing the description of the entree.
	 */
	public String getDescription() {
		return this.description;
	}
	/**
	 * Returns the calories of the entree.
	 * @return Integer representing the calories of the entree.
	 */
	public int getCalories() {
		return this.calories;
	}
	/**
	 * Sets the name of the entree.
	 * @param name String which is the new name of the entree.
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Sets the description of the entree.
	 * @param description String which is the new description of the entree.
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * Sets the calories of the entree.
	 * @param name Integer which is the new calorie amount of the entree.
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}
}
