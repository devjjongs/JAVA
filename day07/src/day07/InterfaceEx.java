package day07;
interface PhoneInterface{		//	인터페이스 선언
		final int TIMEOUT = 10000;		//	상수 필드 선언
		void sendCall();		//	추상 메소드
		void receiveCall();		//	추상 메소드
		default void printLogo() {		//	default 메소드
			System.out.println("** Phone **");
		}
}
interface MobilePhoneInterface extends PhoneInterface{
	void sendSMS();
	void receiveSMS();
}
interface MP3Interface{		//	인터페이스 선언
	public void play();
	public void stop();
}
class PDA{		//	클래스 작성
	public int calcaulator(int x, int y) {
		return x+y;
	}
}
//SmartPhone 클래스는 PDA를 상속받고,
//MobilePhoneInterface와 MP3Interface 인터페이스에 선언된 추상 메소드를 모두 구현한다.
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("따르릉따르릉~~");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화 왔어요");
	}
	
	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("문자갑니다");
	}
	
	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		System.out.println("문자왔어요");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("음악 연주합니다");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("음악 중단합니다");
	}
	public void schedule() {
		System.out.println("일정 관리합니다");
	}
}
//class SamsungPhone implements PhoneInterface{
//
//	@Override
//	public void sendCall() {
//		// TODO Auto-generated method stub
//		System.out.println("띠리리리링");
//	}
//
//	@Override
//	public void receiveCall() {
//		// TODO Auto-generated method stub
//		System.out.println("전화가 왔습니다.");
//	}
//	public void flash() {
//		// TODO Auto-generated method stub
//		System.out.println("전화기에 불이 켜졌습니다.");
//	}
//}
public class InterfaceEx {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3과 5를 더하면 " + phone.calcaulator(3, 5));
		phone.schedule();
	}

}
