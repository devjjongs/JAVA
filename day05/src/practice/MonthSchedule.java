//package practice;
//
//import java.util.Scanner;
//
//class Day{
//	private String work;
//	public void set(String work) {this.work = work;}
//	public String get() {return work;}
//	public void show() {
//		if(work == null)	System.out.println("없습니다.");
//		else System.out.println(work + "입니다.");
//	}
//}
//public class MonthSchedule {
//	Scanner scanner = new Scanner(System.in);
//	private int nDays;
//	private Day days[];
//	public MonthSchedule(int nDays) {
//		this.nDays = nDays;
//		this.days = new Day[nDays];
//		for(int i=0; i<days.length; i++) {
//			days[i] = new Day();
//		}
//	}
//	public void input() {
//		System.out.print("날짜(1~30)?");
//		int nDays = scanner.nextInt();
//		System.out.print("할일(빈칸없이 입력)?");
//		String work = scanner.next();
//		if(nDays<0 || nDays>30);
//		return;
//}
//	private void view() {
//		System.out.print("날짜(1~30)?");
//		int nDays = scanner.nextInt();
//		System.out.print(nDays + "일의 할 일은 " + work + "입니다");
//	}
//	public static void main(String[] args) {
//	}
//}
