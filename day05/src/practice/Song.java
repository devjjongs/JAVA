package practice;
class Song {
	private String title;
	private String artist;
	private String year;
	private String country;
	
	Song(String string, String country, String artist, String title){
		this.year = string;
		this.country = country;
		this.artist = artist;
		this.title = title;
	}
	
	Song(){
		this(null, null, null, null);
	}
	
	void show() {
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
	
	public static void main(String[] args) {
		Song s = new Song( "1978", "스웨덴", "ABBA", "Dancing Queen");
		
		s.show();		// (year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}

}
