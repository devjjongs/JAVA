package practice;

public class Random {

	public static void main(String[] args) {
		int n []= new int [10];			//	배열 10칸 생성
		
		for(int i=0; i<n.length; i++) {		//	배열에 저장될 무작위 정수의 범위
			int r = (int)(Math.random()*10+1);		//	무작위로 생성한 정수 r
			n[i] = r;			//	범위 i번의 정수 r
		}
		int sum = 0;
		for(int i=0; i<n.length;i++)		
			sum += n[i];			//	무작위 정수 i개의 합
		
		System.out.print("랜덤한 정수들 : ");
		for(int i=0; i<n.length; i++)
			System.out.print(n[i] + " ");
		
		System.out.println("\n평균은 : " + (double)sum/n.length);
	}
}
