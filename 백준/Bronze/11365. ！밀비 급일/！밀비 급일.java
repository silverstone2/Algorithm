import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String str = br.readLine();
			if(str.equals("END")) {
				break;
			}
			
			sb = new StringBuilder(str);
			String rev = sb.reverse().toString();
			System.out.println(rev);
		}	
	}
}
