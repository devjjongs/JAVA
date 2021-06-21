import java.util.ArrayList;

class Fruit				  { public String toString() { return "Fruit";}}	// toString class 타입
class Apple extends Fruit { public String toString() { return "Apple";}}	// toString class 타입
class Grape extends Fruit { public String toString() { return "Grape";}}	// toString class 타입
class Toy		          { public String toString() { return "Toy"  ;}}	// toString class 타입

class FruitBoxEx1 {
	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy>   toyBox   = new Box<Toy>();
//		Box<Grape> grapeBox = new Box<Apple>(); // 에러. 타입 불일치

		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); // OK. void add(Fruit item)
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
//		appleBox.add(new Toy()); // 에러. Box<Apple>에는 Apple만 담을 수 있음

		toyBox.add(new Toy());
//		toyBox.add(new Apple()); // 에러. Box<Toy>에는 Apple을 담을 수 없음

		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
	}  // main의 끝
}

class Box<T> {		//	타입이 미정이기 때문에 T로 선언
	ArrayList<T> list = new ArrayList<T>();
	void add(T item)  { list.add(item); }
	T get(int i)      { return list.get(i); }		//	Generics를 사용했기 때문에 형변환 필요 X
	int size() { return list.size(); }
	public String toString() { return list.toString();}
}
