public class CharSequence {
	public static void main(String[] args) {
		show(new String("Hello"));
		show(new StringBuilder("Java"));
		show(new StringBuffer("World!!"));
	}

	private static void show(CharSequence c) {
		System.out.println(c);
	}
}
