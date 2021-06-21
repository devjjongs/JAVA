import java.io.*;

class RandomAccessFileEx3 {
	public static void main(String args[]) {
		int sum = 0;

		try {
			RandomAccessFile raf = new RandomAccessFile("score2.dat", "r");
			int i=12;

			while(true) {	//	국어 성적에만 대한 합
				raf.seek(i);
				sum += raf.readInt();	//	sum에 누적
				i+=16;	//	16	바이트씩 늘어남
			}
		} catch (EOFException e) {
			System.out.println("sum : " + sum);
		} catch (IOException e) {
			e.printStackTrace();		
		}
	}
}
