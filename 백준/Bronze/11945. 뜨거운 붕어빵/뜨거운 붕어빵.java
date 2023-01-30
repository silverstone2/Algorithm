import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] num = br.readLine().split(" ");
		int n = Integer.parseInt(num[0]);
		int m = Integer.parseInt(num[1]);
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<m; j++) {
				sb.append(str.charAt(m-j-1));
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}