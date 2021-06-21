package ch04_practice;
class Person{
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		System.out.print(age);
	}
	
}
public class Q07 {
	public static void main(String[] args) {
		Person aPerson = new Person();
		aPerson.setAge(17);
	}
}
