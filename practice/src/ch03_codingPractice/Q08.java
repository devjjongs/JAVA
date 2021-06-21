package ch03_codingPractice;

import java.util.Scanner;

public class Q08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[];
		int num;
		System.out.print("정수 몇개? ");
		num = sc.nextInt();
		arr = new int [num];
		
		int count = 0;
		for(int i=0; i<num; i++) {
			arr[i] = (int)(Math.random()*100+1);
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j])		//	같은 수가 있으
					i--;					//	난수 재생성
			}
		}
		for(int i=0; i<num; i++) {
			System.out.print(arr[i] + " ");
			count++;
			if(count % 10==0)
				System.out.println();		//	난수 10개 정렬 후 줄 바꿈
		}
		sc.close();
	}
}
