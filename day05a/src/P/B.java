package P;

public class B {
	protected int n;
	protected void g() {
		this.n = 5;
		System.out.println("B class's g()"+n);
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getN() {
		return this.n;
	}
	public void accG() {
		g();
	}
}
