package day08;
final class Singleton{
	private static Singleton s = new Singleton(1);
	int i;
	private Singleton(int i) {
		this.i = i;
		System.out.println("Private Constructor called!!");
		System.out.println(this.i);
	}
	public static Singleton getInstance() {
		if(s==null) {
			s = new Singleton(2);
		}
		return s;
	}
}
public class SingletonTest {

	public static void main(String[] args) {
//		Singleton s = new Singleton();
		Singleton s = Singleton.getInstance();
		System.out.println(s);
	}

}
