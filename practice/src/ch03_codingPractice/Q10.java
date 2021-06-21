package ch03_codingPractice;
public class Q10 {
	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		int x, y, result = 0;		//	result는 랜덤 생성 갯수
		
		while(result < 10) {
			x = (int)(Math.random()*4);		//	x에 0~4까지의 난수 생성
			y = (int)(Math.random()*4);		//	y에 0~4까지의 난수 생성
			if(arr[x][y]==0) {				//	arr[x][y]에 값이 없으면 난수 생성
				arr[x][y] = (int)(Math.random()*10+1);
				result++;
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
