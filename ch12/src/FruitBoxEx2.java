import java.util.ArrayList;

class Fruit2 implements Eatable {		//	Eatable 인터페이스를 구현한 Fruit2 클래스
	public String toString() { return "Fruit";}
}
class Apple2 extends Fruit2 { public String toString() { return "Apple";}}
class Grape2 extends Fruit2 { public String toString() { return "Grape";}}
class Toy2		            { public String toString() { return "Toy"  ;}}

interface Eatable {}

class FruitBoxEx2 {
	public static void main(String[] args) {
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();	//	FruitBox2의 타입이 T에서 Fruit2로 변경
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
		FruitBox2<Grape2> grapeBox = new FruitBox2<Grape2>();
//		FruitBox2<Grape> grapeBox = new FruitBox2<Apple>(); // 에러. 타입 불일치
//		FruitBox2<Toy>   toyBox    = new FruitBox2<Toy>();   // 에러.

		fruitBox.add(new Fruit2());
		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		appleBox.add(new Apple2());
//		appleBox.add(new Grape2());  // 에러. Grape는 Apple의 자손이 아님
		grapeBox.add(new Grape2());

		System.out.println("fruitBox-"+fruitBox);
		System.out.println("appleBox-"+appleBox);
		System.out.println("grapeBox-"+grapeBox);
	}  // main
}

class FruitBox2<T extends Fruit2 & Eatable> extends Box2<T> {}		//	T타입을 Fruit2로 제한

class Box2<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item)  { list.add(item);      }
	T get(int i)      { return list.get(i);  }
	int size()        { return list.size();  }
	public String toString() { return list.toString(); }
}
