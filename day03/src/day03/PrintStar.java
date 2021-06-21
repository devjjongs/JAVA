package day03;

public class PrintStar {

	public static void main(String[] args) {
		for(int i=5;i<6;i--) {	//	1에서 9
			for(int j=0;j<i;++j) {	//	각 단의 출력
				System.out.print("*");
			}
			System.out.println();	//	한 단이 끝나면 다음 줄로 커서 이동
		}
	}

}
