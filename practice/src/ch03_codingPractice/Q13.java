package ch03_codingPractice;
public class Q13 {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 0; i < 100; i ++) {
			count = 0;
			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9)
				count++;
			if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9)
				count++;
			
			if(count == 1)
				System.out.println(i + "박수 짝");
			else if(count == 2)
				System.out.println(i + "박수 짝짝");
		}
	}
}
