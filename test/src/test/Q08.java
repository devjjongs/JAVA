package test;

public class Q08 {

	public static void main(String[] args) {
		int a;
		for(int i=1; i<=50; i++) {
			a=(int)(Math.random()*100+1);	//	답
			if(a%2==0)
				System.out.print(a + " ");
		}
	}

}
