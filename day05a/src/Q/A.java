package Q;

import P.B;
class A {
	void f() {
		B b = new B();
		b.setN(3);
		System.out.println("A class's f()"+b.getN());
		b.accG();
	}
}
