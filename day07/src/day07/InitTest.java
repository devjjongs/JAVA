package day07;
public class InitTest {
	static int cv = 1;			//	명시적 초기화
	int iv = 1;					//	명시적 초기화
	
	static  { cv = 2;}			// 클래스 초기화 블럭
			{ iv = 2;}					//	인스턴스 초기화 블럭
	
	InitTest(){					// 생성자
		iv = 3;
	}
	
	public static void main(String[] args) {
		InitTest i1 = new InitTest();
		System.out.println(cv);
		System.out.println(i1.iv);
	}
}
