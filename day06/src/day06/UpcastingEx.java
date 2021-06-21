package day06;
class Person{
	String name;
	String id;
	public Person(String name) {
		this.name = name;
	}
	public void eat(String menu) {
		System.out.println(menu + "를 주문");
	}
	public void run(Person p1) {
		System.out.println(p1.name);
		p1.eat("설렁탕");
	}
}
class Student extends Person{
	String grade;
	String department;
	public Student(String name) {
		super(name);
	}
	public void study(int hour) {
		System.out.println("오늘 공부할 시간은 " + hour + "입니다.");
	}
}
public class UpcastingEx {
	public static void main(String[] args) {
		Person p = new Student("이순신");
		Student s ;
		s = (Student)p;
		System.out.println(p.name);
		s.grade = "A";
		s.department = "Com";
		s.eat("봉골레");
		s.study(5);
		s.run(s);
	}

}
