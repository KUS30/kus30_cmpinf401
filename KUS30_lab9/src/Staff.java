public class Staff extends Person {
	private String school;
	private double pay;
	
	public Staff(String name, String address, double pay, String school) {
		super(name, address);
		this.pay = pay;
		this.school = school;
	}
	public String getSchool() {
		return this.school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public double getPay() {
		return this.pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	public String toString() {
		String str = "";
		str += ("Staff name: " + this.getName() + "\n");
		str += ("Staff address: " + this.getAddress() + "\n");
		str += ("Staff school: " + this.getSchool() + "\n");
		str += ("Staff pay: " + this.getPay()); 
		return str;
	}
}
