package ch03_practice;
public class Q02 {
	private static int sum;
	private static int sum1;
	private static int sum2;
	private static int sum3;

	public static void main(String[] args) {
		for(int i=0; i<10; i++) { 
			sum += i;
		}
		System.out.println(sum);
		
		for(int i=9; i>0; i--) { 
			sum1 += i;
		}
		System.out.println(sum1);
	
		for(int i=0; i>10; i++) { 
			sum2 ++;
		}
		System.out.println(sum2);
	
		for(int i=0; i<10; sum3 += i, i++);
		System.out.println(sum3);
		
	}
}
