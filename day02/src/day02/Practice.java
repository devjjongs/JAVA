package day02;

public class Practice {

	public static void main(String[] args) {
		int n = 300;
		byte b1 = (byte)n;
		byte b = 127;
		int i = 100;
		
		System.out.println(b1);
		System.out.println(b+i);
		System.out.println(10/4);
		System.out.println(10.0/4);
		System.out.println((char)0x12340041);	// 13240041 = 16진법 41
		System.out.println((byte)(b+i));
		System.out.println((int)2.9+1.8);
		System.out.println((int)(2.9+1.8));
		System.out.println((int)2.9+(int)1.8);
	}
}
