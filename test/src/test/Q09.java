package test;

import java.util.Scanner;	//	답

public class Q09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//	답
		System.out.println("0~999 사이의 숫자를 입력하세요 : ");
		int x = sc.nextInt();	//	답
		int d, sum;
		sum = x%10;
		x/=10;
		sum += x%10;
		x /= 10;
		sum += x%10;
		x /= 10;
		System.out.println("각 자리수의 합 = " + sum);
	}

}
