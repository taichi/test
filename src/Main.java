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
		System.out.println("add message");
	}
	
	public static void piropiro(String value) {
		System.out.println("piropiro");
	}
}
