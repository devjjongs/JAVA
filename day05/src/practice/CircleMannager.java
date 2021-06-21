package practice;

import java.util.Scanner;

class Circle{
	private double x, y;
	private int radius;
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius);
	}
//	public double getArea() {
//		return getArea = new getArea();
//	}
}
public class CircleMannager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c [] = new Circle[3];
		for(int i=0; i<c.length; i++) {
			System.out.println("x, y, radius >> ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		for(int i=0; i<c.length; i++) 
			c[i].show();
//		int bigIndex = 0;
//		for(int i=0; i<c.length; i++) {
//			if(c[bigIndex].getArea()<c[i].getArea())
//				bigIndex = i;
//		}
//		System.out.println("가장 큰 면적의 원은? ");
//		c[bigIndex].show();
//		c[bigIndex].getArea();
		sc.close();
	}

}
