package day05;
class Sample{
	public int a;
	private int b;
	int c;
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}

public class AccessEx {
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10;
		sample.setB(10);
		sample.c = 10;
		
	}

}
