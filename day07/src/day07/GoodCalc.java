package day07;

public class GoodCalc extends Calcurator{


	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int [] a) {
		// TODO Auto-generated method stub
		double sum = 0;
		for(int i=0; i<a.length; i++)
		sum +=a[i];
		return sum/2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		int[] a = {2, 3, 4, 5};
		System.out.println(c.average(a));
	}
}
