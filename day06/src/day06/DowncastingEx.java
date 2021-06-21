package day06;
public class DowncastingEx {

	public static void main(String[] args) {
		Person p = new Student("이순신");
		Student s;
		s = (Student)p;
		System.out.println(s.name);
		s.grade = "A";
	}

}
