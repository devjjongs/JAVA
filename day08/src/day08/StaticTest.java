package day08;
public class StaticTest {
	static int widht = 200;
	static int height = 120;
	static int x, y;
	static {
	}
	public StaticTest() {
		x = 100;
		y = 200;
	}
	static int max(int x, int y) {
		return x > y ? x : y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest st = new StaticTest();
		System.out.println(st.x+", "+st.y);
	}
}
