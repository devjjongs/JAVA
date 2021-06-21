import java.io.*;

class RandomAccessFileEx2 {
	public static void main(String args[]) {
//				      번호, 국어, 영어, 수학					
		int[] score = {	1, 100,  90,  90,
					    2,  70,  90, 100,
						3, 100, 100, 100, 
						4,  70,  60,  80, 
						5,  70,  90, 100
					   }; 
		int sum = 0;
		try {
		      RandomAccessFile raf = new RandomAccessFile("score2.dat", "rw");
		      for(int i=0; i<score.length;i++) {
		             raf.writeInt(score[i]);				
		      }
		      raf.seek(0);
		      while(true) {
			     System.out.println(raf.readInt());
		      }
		} catch (EOFException eof) {
			System.out.println("파일 끝입니다.");
		       // readInt()를 호출했을 때 더 이상 읽을 내용이 없으면 EOFException이 발생한다.
		} catch (IOException e) {
		       e.printStackTrace();		
		}
	} // main
}
