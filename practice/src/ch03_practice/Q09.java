package ch03_practice;
public class Q09 {
	public static void main(String[] args) {
		int myArray[] = new int[3];			//	(2) int myArray[];	>>	int myArray = new int []; 로 변경
		myArray[0] = 1;
		myArray[1] = myArray[0] + 1;		// 	(1)	myArray의 값이 초기화 되지 않음
	}
}
