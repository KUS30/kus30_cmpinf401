/**
	 * Class Side
 	 * author : Kunal Saxena
	 * created: 10/03/2022
	 */

public class Side {
	private String name;
	private String description;
	private int calories;
	
	public Side(String name, String description, int calories) {
		this.name = name;
		this.description = description;
		this.calories = calories;
	}
	
	/**
	 * Returns the name of the side.
	 * @return String representing the name of the side.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * Returns the description of the side.
	 * @return String representing the description of the side.
	 */
	public String getDescription() {
		return this.description;
	}
	/**
	 * Returns the calories of the side.
	 * @return Integer representing the calories of the side.
	 */
	public int getCalories() {
		return this.calories;
	}
	/**
	 * Sets the name of the side.
	 * @param name String which is the new name of the side.
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Sets the description of the side.
	 * @param description String which is the new description of the side.
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * Sets the calories of the side.
	 * @param name Integer which is the new calorie amount of the side.
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}
}
