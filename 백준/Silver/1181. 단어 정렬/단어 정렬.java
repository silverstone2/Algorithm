import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =  new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		String[] str = new String[n];
		int[] length = new int[n];

		for(int i=0; i<n; i++) {
			str[i] = br.readLine();
		}
		
		// 문자열 정렬을 위한 재정의
		Arrays.sort(str, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} else {
					return s1.length() - s2.length();
				}
			}
			
		});
		System.out.println(str[0]);
		// 중복 제거
		for(int i=1; i<str.length; i++) {
			if(!str[i].equals(str[i-1])) {
				System.out.println(str[i]);
			}
		}
	}
}