import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String jh = sc.next();
		String doc = sc.next();
		int jh_size = jh.length();
		int doc_size = doc.length();
		
		if(jh_size >= doc_size) {
			System.out.println("go");
		} else {
			System.out.println("no");
		}
	}
}
