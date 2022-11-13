public class Student extends Person{
	private String program;
	private int year;
	private double fee;
	
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.fee = fee;
		this.year = year;
		this.program = program;
	}
	public String getProgram() {
		return this.program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public double getFee() {
		return this.fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public int getYear() {
		return this.year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString() {
		String str = "";
		str += ("Student name: " + this.getName() + "\n");
		str += ("Student address: " + this.getAddress() + "\n");
		str += ("Student program: " + this.getProgram() + "\n");
		str += ("Student fee: " + this.getFee() + "\n");
		str += ("Student year: " + this.getYear());
		return str;
	}
}
