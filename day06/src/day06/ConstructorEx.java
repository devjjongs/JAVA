package day06;
class A{
	public A() {
		System.out.println("Constructor A");
	}
	public A(int x) {
		System.out.println("Constructor A(int x) 호출");
	}
}
class B extends A{
	public B() {
		System.out.println("Constructor B()");
	}
	public B(int y) {
		super(y);
		System.out.println("Constructor B(int y) 호출");
	}
}
class C extends B{
	public C() {
		System.out.println("Constructor C");
	}
}
public class ConstructorEx {
	public static void main(String[] args) {
		B b = new B(5);
//		C c = new C();
	}

}
