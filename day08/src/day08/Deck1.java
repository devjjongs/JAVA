package day08;
class DeckTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck1 d = new Deck1();
		Card c = d.pick(0);
		System.out.println(c);
		d.shuffle();
		c = d.pick(0);
		System.out.println(c);
	}	
}
class Deck1{
	final int CARD_NUM = 52;		//	카드의 개수
	Card cardArr[] = new Card[CARD_NUM];
	Deck1 () {
		int i = 0;
		for(int k=Card.KIND_MAX; k>0; k--)
			for(int n=1; n < Card.NUM_MAX + 1; n++)
				cardArr[i++] = new Card(k, n);
	}
		Card pick(int index) {
			return cardArr[index%CARD_NUM];
		}
		Card pick() {
			int index = (int)(Math.random()*CARD_NUM);
			return pick(index);
		}
		void shuffle() {
			for(int n=0; n<1000; n++) {
				int i = (int)(Math.random()*CARD_NUM);
				Card temp = cardArr[0];
				cardArr[0]=cardArr[i];
				cardArr[i]=temp;
		}
	}
}
class Card{
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	final int number;
	final String kind;
	static int width = 100;
	static int heught = 250;
	Card() {this("SPADE", 1); }
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	public String toString() {
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String number = "0123456789XJQK";
		return "kind : " + KIND + ", number : " + NUMBER ;
	}
}
