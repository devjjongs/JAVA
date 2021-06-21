package day08;
class DeckTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeckA d = new DeckA();
		for(int i=0; i<52; i++) {
			System.out.println(d.cardArr[i]);
		}
	}	
}
class DeckA{
	final int CARD_NUM = 52;		//	카드의 개수
	CardA cardArr[] = new CardA[CARD_NUM];		//	Card객체 배열을 포
	String[] kinds = {"CLOVER", "HEART", "DIAMOND", "SPADE"};
	DeckA () {		//	Deck의 카드를 초기
		int i = 0;
		for(int k=0 ; k<CardA.KIND_MAX; k++)
			for(int n=0; n < CardA.NUM_MAX; n++)
				cardArr[i++] = new CardA(kinds[k], n+1);
		}
}
class CardA{
	String numbers = "0123456789XJQK";
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int heught = 250;
	CardA() {this("HEART", 1); }
	CardA(String kind, int number){
		KIND = kind;
		NUMBER = number;
	}
	public String toString() {
		return "kind : " + KIND + ", number : " + NUMBER ;
	}
}
