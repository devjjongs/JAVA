import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import Book.AuthorDataSet;
import Book.AuthorVO;
import Book.BookDataSet;
import Book.BookVO;

public class BookStart {
	Scanner scan = new Scanner(System.in);
	
	public BookStart() {
		System.out.println("Book Management System \t 김재은");
		System.out.println("\n(manager id : manager , manager pwd : 0825)");
		System.out.println("(user id : user , user pwd : 0000)");
		start();
	}
	
	public void start() {
		String id = conInput("\n아이디");
		String pwd = conInput("비밀번호");
		
		Login log = new Login(id, pwd);
	
		if(log.logChk() == 1) {  //관리자 로그인
			BookDataSet.basicDataSet();
			System.out.println("관리자 로그인 되었습니다.");
			
			do {
				String menu = conInput("\n \t MENU \t 0.전체 도서 목록 1.도서 관리 2.종료 하기");
				if(menu.equals("0")) {
					//전체 도서 목록
					bookList();
					
				}else if(menu.equals("1")) {
					//도서 관리
					String submenu1 = conInput("1.도서 관리 a:등록, b:수정, c:삭제");
					
					if(submenu1.equals("a")) {
						bookResister();
						System.out.println("새로운 도서가 등록되었습니다.");
						bookList();
					}else if(submenu1.equals("b")) {
						bookEdit();
						System.out.println("정상적으로 수정되었습니다.");
						bookList();
					}else if(submenu1.equals("c")) {
						bookRemove();
						System.out.println("정상적으로 삭제되었습니다.");
						bookList();
					}else {
						
					}				
					
				}else if(menu.equals("2")) {
					//종료 하기
					System.out.println("프로그램이 종료되었습니다."); //종료
					break;
				}else {
					
				}
				
			}while(true);
		
		}else if(log.logChk() == 2) {  //사용자 로그인
			BookDataSet.basicDataSet();
			AuthorDataSet.basicDataSet();
			System.out.println("사용자 로그인 되었습니다.");
			
			do {
				String menu = conInput("\n \t MENU \t 0.전체 도서 목록 1.도서 검색 2.저자 목록 3.종료 하기");
				if(menu.equals("0")) {
					//전체 도서 목록
					bookList();	
					
				}else if(menu.equals("1")) {
					//도서 검색
					String submenu2 = conInput("1.도서 검색 a:도서명 b:저자 c:출판사 d:발행연도 e:장르");
					
					if(submenu2.equals("a")) {
						bookSearchTitle();
					}else if(submenu2.equals("b")) {
						bookSearchAuthor();
					}else if(submenu2.equals("c")) {
						bookSearchPublisher();
					}else if(submenu2.equals("d")) {
						bookSearchYear();
					}else if(submenu2.equals("e")) {
						bookSearchGenre();
					}else {
						
					}	
				}else if(menu.equals("2")) {
					AuthorList();
				}else if(menu.equals("3")) {
					//종료 하기
					System.out.println("프로그램이 종료되었습니다."); //종료
					break;
				}else {
					
				}
				
			}while(true);
			
		}else {  //로그인 실패시
			System.out.println("아이디 또는 비밀번호를 잘못 입력하셨습니다.");
		}
	}
	
	//전체 도서 목록
	public void bookList() {
		//전체 도서 오름차순 정렬
		TreeMap<String, BookVO> bookAsc = new TreeMap<String, BookVO>(BookDataSet.list);
		Set<String> key = bookAsc.keySet();
		
		System.out.println(" 총 " +key.size() +"건이 검색되었습니다.\n");
		System.out.println("\t도서명 \t\t\t 저자 \t\t\t 출판사 \t\t 발행연도 \t\t 장르");
		
		Iterator<String> keyList = key.iterator();
		while(keyList.hasNext()) {
			BookVO vo = bookAsc.get(keyList.next());
			System.out.printf("%-20s %20s %20s %20d %20s \n",
							  vo.getTitle(), vo.getAuthor(), vo.getPublisher(), vo.getYear(), vo.getGenre());
		}
	}
	
	//도서 등록
	public void bookResister() {
		BookVO vo = new BookVO();
		vo.setTitle(conInput("도서명"));
		vo.setAuthor(conInput("저자"));
		vo.setPublisher(conInput("출판사"));
		vo.setYear(Integer.parseInt(conInput("발행연도")));
		vo.setGenre(conInput("장르"));
		BookDataSet.list.put(vo.getTitle(), vo);
	}
	
	//도서 수정
	public void bookEdit() {
		String bookName = conInput("수정할 도서명을 입력해주세요.");
		
		BookVO vo = BookDataSet.list.get(bookName);
		
		if(vo != null) {  //도서명을 잘못 입력했을 때
			String part = conInput("수정 항목 선택 [1:도서명 2:저자 3:출판사 4:발행연도 5:장르]");
			
			if(part.contentEquals("1")) {  //도서명 수정
				String editData = conInput("도서명");
				vo.setTitle(editData);
			}else if(part.equals("2")){  //저자 수정
				String editData = conInput("저자");
				vo.setAuthor(editData);
			}else if(part.equals("3")){  //출판사 수정
				String editData = conInput("출판사");
				vo.setPublisher(editData);
			}else if(part.equals("4")){  //발행연도 수정
				System.out.print("발행연도");
				int editData = scan.nextInt();
				vo.setYear(editData);
			}else if(part.equals("5")){  //장르 수정
				String editData = conInput("장르");
				vo.setGenre(editData);
			}else {
				
			}
			
		}else {
			System.out.println("도서명을 잘못 입력하였습니다. 다시 입력하세요.");
		}
	}
	
	//도서 삭제
	public void bookRemove() {
		String bookTitle = conInput("삭제할 도서명을 입력해주세요.");
		BookDataSet.list.remove(bookTitle);
	}
	
	//도서 검색_도서명
	public void bookSearchTitle() {
		Set<String> key = BookDataSet.list.keySet();
		Iterator<String> keyList = key.iterator();
	
		int count = 0;
		
		try {
			System.out.println("검색어를 입력해주세요.");
			String str = scan.nextLine();
			
			while(keyList.hasNext()) {
				
				String key1 = keyList.next();
				BookVO bookvo = BookDataSet.list.get(key1);
				
				if(bookvo.getTitle().indexOf(str) > -1) {
					System.out.println(key1 +"\t");
					count++;
				}		
			}
			
			if(count == 0) {
				System.out.println("검색 결과 총 0건이 검색되었습니다.");
				return;
			}
			System.out.println(" 총 " +count +"건이 검색되었습니다.");
			
		}catch(Exception e){
			
		}	
	}
	
	//도서 검색_저자
	public void bookSearchAuthor() {
		Set<String> key = BookDataSet.list.keySet();
		Iterator<String> keyList = key.iterator();
	
		int count = 0;
		
		try {
			System.out.println("검색어를 입력해주세요.");
			String str = scan.nextLine();
			
			while(keyList.hasNext()) {
				
				String key1 = keyList.next();
				BookVO bookvo = BookDataSet.list.get(key1);
				
				if(bookvo.getAuthor().indexOf(str) > -1) {
					System.out.println(key1 +"\t");
					count++;
				}		
			}
			
			if(count == 0) {
				System.out.println("검색 결과 총 0건이 검색되었습니다.");
				return;
			}
			System.out.println(" 총 " +count +"건이 검색되었습니다.");
			
		}catch(Exception e){
			
		}	
	}

	//도서 검색_출판사
	public void bookSearchPublisher() {
		Set<String> key = BookDataSet.list.keySet();
		Iterator<String> keyList = key.iterator();
	
		int count = 0;
		
		try {
			System.out.println("검색어를 입력해주세요.");
			String str = scan.nextLine();
			
			while(keyList.hasNext()) {
				
				String key1 = keyList.next();
				BookVO bookvo = BookDataSet.list.get(key1);
				
				if(bookvo.getPublisher().indexOf(str) > -1) {
					System.out.println(key1 +"\t");
					count++;
				}		
			}
			
			if(count == 0) {
				System.out.println("검색 결과 총 0건이 검색되었습니다.");
				return;
			}
			System.out.println(" 총 " +count +"건이 검색되었습니다.");
			
		}catch(Exception e){
			
		}	
	}

	//도서 검색_발행연도
	public void bookSearchYear() {
		Set<String> key = BookDataSet.list.keySet();
		Iterator<String> keyList = key.iterator();
	
		int count = 0;
		
		try {
			System.out.println("검색어를 입력해주세요.");
			int year = scan.nextInt();
			
			while(keyList.hasNext()) {
				
				String key1 = keyList.next();
				BookVO bookvo = BookDataSet.list.get(key1);
				
				if(bookvo.getYear() == year) {
					System.out.println(key1 +"\t");
					count++;
				}		
			}
			
			if(count == 0) {
				System.out.println("검색 결과 총 0건이 검색되었습니다.");
				return;
			}
			System.out.println(" 총 " +count +"건이 검색되었습니다.");
			
		}catch(Exception e){
			
		}	
	}

	//도서 검색_장르
	public void bookSearchGenre() {
		Set<String> key = BookDataSet.list.keySet();
		Iterator<String> keyList = key.iterator();
	
		int count = 0;
		
		try {
			System.out.println("검색어를 입력해주세요.");
			String str = scan.nextLine();
			
			while(keyList.hasNext()) {
				
				String key1 = keyList.next();
				BookVO bookvo = BookDataSet.list.get(key1);
				
				if(bookvo.getGenre().indexOf(str) > -1) {
					System.out.println(key1 +"\t");
					count++;
				}		
			}
			
			if(count == 0) {
				System.out.println("검색 결과 총 0건이 검색되었습니다.");
				return;
			}
			System.out.println(" 총 " +count +"건이 검색되었습니다.");
			
		}catch(Exception e){
			
		}	
	}
	
	//전체 저자 목록
		public void AuthorList() {
			//전체 저자 오름차순 정렬
			TreeMap<String, AuthorVO> authorAsc = new TreeMap<String, AuthorVO>(AuthorDataSet.list);
			Set<String> key = authorAsc.keySet();
			
			System.out.println(" 총 " +key.size() +"건이 검색되었습니다.\n");
			
			Iterator<String> keyList = key.iterator();
			while(keyList.hasNext()) {
				AuthorVO vo = authorAsc.get(keyList.next());
				System.out.printf("%-20s %20s %20s %20s \n",
								  vo.getName(), vo.getBook(), vo.getCareer(), vo.getContact());
			}
		}

	public String conInput(String msg) {
		System.out.println(msg +" :");
		return scan.nextLine();
	}

	public static void main(String[] args) {
		new BookStart();		
	}

}
