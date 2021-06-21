package ch03_codingPractice;

import java.util.Scanner;

public class Q07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int sum = 0;
		double avg = 0;
		
		System.out.println("랜덤한 정수들 : ");
		for(int i=0; i<10; i++) {
			arr[i] = (int)(Math.random()*10+1);	//	1 ~ 10 까지의 난수 생
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int i=0; i<10; i++)
			sum += arr[i];
		avg = sum/arr.length;
		
		System.out.println("평균은 : " + avg);
		sc.close();
	}
}
