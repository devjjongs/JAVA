package practice;

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		int [] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1};		//	환산할 돈의 종류
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오 >> ");
		int money = scanner.nextInt();			//	금액 입력
		
		for(int i=0; i<unit.length; i++) {
			int res = money/unit[i];			//	입력받은 금액을 돈의 종류로 나눴을때의 개수 계산
			
			if(res>0) {			// res 값으로 나눠진 후 나머지가 남았을 경우
				money = money%unit[i];
				System.out.println(unit[i] + "원 짜리 " + res +"개");
			}
		}
		scanner.close();
		
	}

}
