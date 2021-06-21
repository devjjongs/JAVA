package practice;

public class ExTest {

	public static void main(String[] args) {
		int total = 0, x=0, y;
		while (++x<5) {
			y=x*x;
			System.out.println(y);
			total += y;
		}
		System.out.println("총합은 " + total);
	}

}
