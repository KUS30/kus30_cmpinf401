public abstract class Person {
	private String name;
	private String address = "String";
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
