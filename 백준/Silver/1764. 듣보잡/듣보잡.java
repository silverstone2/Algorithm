import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Set<String> no_hear = new HashSet<String>();
		List<String> res = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<n; i++) {
			no_hear.add(br.readLine());
		}
		
		for(int i=0; i<m; i++) {
			String no_see = br.readLine();
			if(no_hear.contains(no_see)) {
				res.add(no_see);
			}
		}
		Collections.sort(res);
		
		sb.append(res.size()+"\n");
		for(String str : res) {
			sb.append(str+"\n");
		}
		bw.write(sb.toString());
		bw.close();
	}
}
