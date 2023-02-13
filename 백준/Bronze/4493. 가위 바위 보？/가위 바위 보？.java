import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String[] argstr1) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int t=0; t<T; t++) {
			int N = Integer.parseInt(br.readLine());
			int count = 0;
			
			for(int i=0; i<N; i++) {
				StringTokenizer str1t = new StringTokenizer(br.readLine());
				String str1 = str1t.nextToken();
				String str2 = str1t.nextToken();
				
				if(str1.equals("R") && str2.equals("P")) {
					count++;
				}else if(str1.equals("R") && str2.equals("S")) {
					count--;
				}else if(str1.equals("P") && str2.equals("R")) {
					count--;
				}else if(str1.equals("P") && str2.equals("S")) {
					count++;
				}else if(str1.equals("S") && str2.equals("R")) {
					count++;
				}else if(str1.equals("S") && str2.equals("P")) {
					count--;
				}
			}
			
			if(count < 0) {
				System.out.println("Player 1");
			}else if(count > 0) {
				System.out.println("Player 2");
			}else {
				System.out.println("TIE");
			}
		}
	}
}