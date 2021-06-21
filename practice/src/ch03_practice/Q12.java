package ch03_practice;
public class Q12 {
	public static void main(String[] args) {
		double d [][] = {{1.1, 1.2, 1.2, 1.4}, {2.1, 2.2}, {3.1, 3.2, 1.2}, {4.1}};

		for(int i=0; i<d.length; i++) {
			System.out.println();
			for(int j=0; j<d[i].length; j++) {
				System.out.print(d[i][j]+" ");
			}
		}
		System.out.println();
	}
}
