package day05;

class TV {
	private int size;
	private String manufacturer;
	public TV() {
		this(32, "LG");
	}
	public TV(String manufacturer) {
		this(32,manufacturer);
	}
	public TV(int size, String manufacturer) {
		this.size = size;
		this.manufacturer = manufacturer;
		System.out.println(size + "인치 " + manufacturer);
	}
	
	public static void main(String[] args) {
		TV t1 = new TV();
		TV t2 = new TV("삼성");
		TV t3 = new TV(65, "삼성");
	}
}
