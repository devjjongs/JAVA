package P;

import Q.B;
import Q.C;

class A {
	void f() {
		B b = new B();
	}
	public static void main(String[] args) {
		B b = new B();
		C c = b.makeCObj(20, "홍길동");
		System.out.println(c.getAge() + "," + c.getName());
	}
}
