import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] res = new int[n];
		String[] str = br.readLine().split(" ");
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		Stack<Integer> stack = new Stack<>();
		stack.push(0);	// 최초 스택값 초기화
		// 스택이 안 비어있고 현재 수열이 스택 top 인덱스가 가맅키는 수열보다 클 경우
		for(int i=1; i<n; i++) {
			while(!stack.isEmpty() && arr[stack.peek()] < arr[i] ) {
				// 결과 배열에 오큰수를 현재 수열로 저장
				res[stack.pop()] = arr[i];
			}
			stack.push(i); // 새로운 데이터 push
		}
		// 반복문을 다돌고 종료했는데 스택이 비어있지않다면 빌때까지 스택에 쌓인 인덱스에 -1을 넣고 출력
		while(!stack.empty()) {
			res[stack.pop()] = -1;
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<n; i++) {
			bw.write(res[i] + " ");
		}
		bw.write("\n");
		bw.flush();
	}
}