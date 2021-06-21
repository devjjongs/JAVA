package practice;

import java.util.Scanner;

public class PrstringStarTest_String {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");		
		for(char c=sc.next().charAt(0);c>='a';c--) {
			for(char a='a'; c>=a;a++) {
					System.out.print(a);
			}
			System.out.println();
		}
		sc.close();
	}
}
