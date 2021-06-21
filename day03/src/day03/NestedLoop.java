package day03;

public class NestedLoop {

	public static void main(String[] args) {
		for(int i=1;i<10;i++) {	//	1에서 9
			for(int j=1;j<10;j++) {	//	각 단의 구구단 출력
				System.out.print(j+"X"+i+"="+i*j);
				System.out.print('\t');	//	하나씩 탭으로 띄우기
			}
			System.out.println();	//	한 단이 끝나면 다음 줄로 커서 이동
		}
	}
}
