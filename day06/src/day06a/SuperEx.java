package day06a;
class Point {
	private int x, y;			//	한 점을 구성하는 x, y 좌표
	public Point() {
		this.x = this.y =0;
	}
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() {			//	점의 좌표 출력
		System.out.println("(" + x + ", " + y + ")");
	}
}

class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y, String color) {
		super(x, y);			//	point의 생성자 point(x, y) 호출
		this.color = color;
	}
	public void showColorPoint() {			//	컬러 점의 좌표 출력
		System.out.print(color);
		showPoint();			//	point 클래스의 showPoint() 호출
	}
}
public class SuperEx {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 6 ,"blue");
		cp.showColorPoint();
	}
}
