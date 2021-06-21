package Book;

import java.util.HashMap;

public class BookDataSet {
	public static HashMap<String, BookVO> list = new HashMap<String, BookVO>();
	
	public BookDataSet() {
		
	}
	
	public static void basicDataSet() {
		list.put("Java의 정석", new BookVO("Java의 정석", "남궁성", "도우출판", 2016, "컴퓨터/IT"));	
		list.put("Java의 정석: 기초편 세트", new BookVO("Java의 정석: 기초편 세트", "남궁성", "도우출판", 2019, "컴퓨터/IT"));
		list.put("Do it! 첫 코딩", new BookVO("Do it! 첫 코딩", "정동균", "이지스퍼블리싱", 2019, "컴퓨터/IT"));
		list.put("리액트를 다루는 기술", new BookVO("리액트를 다루는 기술", "김민준", "길벗", 2020, "컴퓨터/IT"));
		list.put("혼자 공부하는 자바", new BookVO("혼자 공부하는 자바", "신용권", "한빛미디어", 2017, "컴퓨터/IT"));
		list.put("지쳤거나 좋아하는 게 없거나", new BookVO("지쳤거나 좋아하는 게 없거나", "강한별", "글배우", 2018, "에세이"));
		list.put("스스로 행복하라", new BookVO("스스로 행복하라", "법정", "샘터사", 2021, "에세이"));
		list.put("나는 무조건 합격하는 공부만 한다", new BookVO("나는 무조건 합격하는 공부만 한다", "이윤구", "비즈니스북스", 2023, "자기계발"));
		list.put("나는 나로 살기로 했다", new BookVO("나는 나로 살기로 했다", "김수현", "마음의숲", 2016, "에세이"));
		list.put("아주 작은 습관의 힘", new BookVO("아주 작은 습관의 힘", "제임스클리어", "비즈니스북스", 2029, "자기계발"));	
	}

}
