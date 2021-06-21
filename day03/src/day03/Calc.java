package day03;
public class Calc {
	public static void main(String[] args) {
		double sum = 0.0;
		double avg = 0.0;
		System.out.println("5개의 숫자를 입력해 주세요");
		for(int i=0; i<5; i++)
			sum += Double.parseDouble(args[i]);
		avg = sum/args.length;
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
	}

}
