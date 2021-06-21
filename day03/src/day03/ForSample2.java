package day03;

public class ForSample2 {
	public static void main(String[] args) {
		int osum=0, esum=0;
		
		for(int i=1; i<=10; i++) {
			if(i%2==0) esum += i;
			osum +=i;
		}
		System.out.println("짝수의 합=" + esum);
		System.out.println("홀수의 합=" + osum);		
	}
}
