public class FileViewer {
	public static void main(String[] args) {
		FileInputStrean fis = new FileInputStream(args[0]);
		int data = 0;
		while((data=fis.read()) != -1) {
			char c = (char)data;
			System.out.println(data);
		}
	}
}
