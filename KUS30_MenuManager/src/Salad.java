/**
	 * Class Salad
 	 * author : Kunal Saxena
	 * created: 10/03/2022
	 */

public class Salad {
	private String name;
	private String description;
	private int calories;
	
	public Salad(String name, String description, int calories) {
		this.name = name;
		this.description = description;
		this.calories = calories;
	}
	
	/**
	 * Returns the name of the salad.
	 * @return String representing the name of the salad.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * Returns the description of the salad.
	 * @return String representing the description of the salad.
	 */
	public String getDescription() {
		return this.description;
	}
	/**
	 * Returns the calories of the salad.
	 * @return Integer representing the calories of the salad.
	 */
	public int getCalories() {
		return this.calories;
	}
	/**
	 * Sets the name of the salad.
	 * @param name String which is the new name of the salad.
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Sets the description of the salad.
	 * @param description String which is the new description of the salad.
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * Sets the calories of the salad.
	 * @param name Integer which is the new calorie amount of the salad.
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}
}
