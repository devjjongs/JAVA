package ch03_practice;
public class Q10 {
	public static void main(String[] args) {
		char [] alpha = {'a', 'b', 'c', 'd'};
//		for(int i=0; i<alpha.length; i++)		//	(1)	배열 alpha의 범위를 설정
//			System.out.println(alpha[1]);
		
		for(char c : alpha)						//	(2)	char c를 출력하기 위해
			System.out.println(c);				//		c를 alpha의 구성으로 설정
	}
}
