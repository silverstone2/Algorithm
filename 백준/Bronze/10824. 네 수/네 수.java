import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] str = br.readLine().split(" ");
		
		long num1 = Long.parseLong(str[0]+str[1]);
		long num2 = Long.parseLong(str[2]+str[3]);
		
		sb.append(num1+num2);
		System.out.println(sb);
	}
}
