class aPerson{
	private int age;
	public void Age(int age) {
		this.setAge(age);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
class Power{
	public int kick;
	public int punch;
	
}

public class Example {
	public static void main(String[] args) {
		Person aPerson = new Person();
		Power robot = new Power();
		robot.kick = 10;
		robot.punch = 20;
	}
}
