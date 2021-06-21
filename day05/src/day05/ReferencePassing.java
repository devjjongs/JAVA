package day05;

public class ReferencePassing {

	public static void main(String[] args) {
		Circle pizza = new Circle(10);
		increase(pizza);
		System.out.println(pizza.radius);
	}
	static void increase(Circle m) {
		m.radius++;
	}
}
class Circle{
	int radius;
	Circle(int radius){
		this.radius = radius;
	}
}
