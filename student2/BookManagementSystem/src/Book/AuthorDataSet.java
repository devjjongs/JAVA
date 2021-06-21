package Book;

import java.util.HashMap;

public class AuthorDataSet {
	public static HashMap<String, AuthorVO> list = new HashMap<String, AuthorVO>();
	
	public AuthorDataSet() {
		
	}
	
	public static void basicDataSet() {
		list.put("남궁성", new AuthorVO("남궁성", "Java의 정석", 
				"인하대학교에서 물리학을 전공하였으며, 1996년 삼성SDS에서 첫 직장생활을 시작했다. 삼성멀티캠퍼스에서 자바를 강의하였으며, 여러 직장을 거쳐 현재는 프리랜서로 집필과 강의를 하고 있다.", 
				"http://www.javachobo.com"));
		list.put("정동균", new AuthorVO("정동균", "Do it! 첫 코딩", 
				"대학 시절 호기심으로 접한 코딩에 푹 빠져버렸다.코딩을 설명하는 남다른 비유와 초보자의 눈높이를 십분 고려해 단어 하나도 허투루 쓰지 않는 사려 깊은 마음의 소유자.", 
				"-"));
		list.put("김민준", new AuthorVO("김민준", "리액트를 다루는 기술", 
				"현재 리디(주)에서 애니메이션 스트리밍 서비스 라프텔(laftel.net)의 프런트엔드 개발을 하고 있다. 그리고 개발자들의 블로그 서비스인 벨로그(velog.io)를 운영 및 개발하고 있다.", 
				"https://velog.io/@velopert"));
		list.put("신용권", new AuthorVO("신용권", "이것이 자바다", 
				"소속: 한국소프트웨어산업협회 교수. 현재 SK Planet에서 운영하는 T아카데미에서 자바, 웹, 안드로이드 앱 개발 강사로 활동하고 있다.", 
				"-"));
		list.put("강한별", new AuthorVO("강한별", "아무것도 아닌 지금은 없다", 
				"고민상담소 ‘글배우서재’를 운영하고 있다.  2017년부터는 배낭 하나 메고 전국을 돌아다니며 1,000명의 사람들과 만나 고민을 듣고 위로해주는 ‘새봄 프로젝트’를 진행 중이다.", 
				"https://blog.naver.com/good1768"));
		list.put("강한별", new AuthorVO("강한별", "아무것도 아닌 지금은 없다, 오늘처럼 내가 싫었던 날은 없다, 타인의 시선을 의식해 힘든 나에게", 
				"고민상담소 ‘글배우서재’를 운영하고 있다.  2017년부터는 배낭 하나 메고 전국을 돌아다니며 1,000명의 사람들과 만나 고민을 듣고 위로해주는 ‘새봄 프로젝트’를 진행 중이다.", 
				"https://blog.naver.com/good1768"));
		list.put("법정", new AuthorVO("법정", "무소유, 꽃잎이 떨어져도 꽃은 지지 않네, 낡은 옷을 벗어라", 
				"1997. ~ 2003.11 대한불교조계종 길상사 스님. 본명 : 박재철", 
				"-"));
		list.put("이윤구", new AuthorVO("이윤구", "나는 무조건 합격하는 공부만 한다", 
				"법무법인 윈스의 변호사이자 구독자 12만 명의 유튜브 ‘Dr. Law 이윤규 변호사’를 운영 중인 공부법 유튜버", 
				"https://seongbukgamdong.modoo.at/"));
		list.put("김수현", new AuthorVO("김수현", "100% 스무 살, 안녕, 스무 살, 180", 
				"일러스트레이터 겸 글쟁이이자, 괜찮은 그래픽 디자이너", 
				"https://www.instagram.com/217design/"));
		list.put("제임스클리어", new AuthorVO("제임스클리어", "나는 무조건 합격하는 공부만 한다", 
				"미국 최고의 자기계발 전문가. 블로그 월 방문자 수 100만 명, 구독자 수 50만 명의 뉴스레터를 발행하는 파워블로거이자 <뉴욕 타임스> 베스트셀러 작가다.", 
				"https://jamesclear.com/"));
	
	}

}



