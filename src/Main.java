public class Main {

	public static void main(String[] args) {
		System.out.println("Hello Egit");
		System.out.println("master branch");
		if(System.getProperty("hoge") == null) {
			System.out.println("fuga branch");
			while(System.getProperty("piro") == null) {
				System.out.println("piro branch conflict resolution is automatic");
			}
		}
	}
	
	public static void piropiro() {
		System.out.println("piropiro");
	}
}
