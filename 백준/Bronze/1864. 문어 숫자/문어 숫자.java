import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int tmp = 0;
	int sum = 0;
	int count = 0;
		
	while(true) {
		String str = br.readLine();
		if(str.equals("#")) {
			break;
		} else {
			for(int i=0; i<str.length(); i++) {
				switch(str.charAt(i)) {
					case '-' :
						tmp=0;
						break;
					case '\\' :
						tmp=1;
						break;
					case '(' :
						tmp=2;
						break;
					case '@' :
						tmp=3;
						break;
					case '?' :
						tmp=4;
						break;
					case '>' :
						tmp=5;
						break;
					case '&' :
						tmp=6;
						break;
					case '%' :
						tmp=7;
						break;
					case '/' :
						tmp=-1;
						break;
					}
					sum += tmp * (Math.pow(8, str.length()-1-count));
					count++;
				}
			}
			System.out.println(sum);
			count = 0;
			sum = 0;
		}
	}
}