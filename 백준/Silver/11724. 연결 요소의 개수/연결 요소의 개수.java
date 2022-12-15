import java.util.Scanner;

public class Main {
	static int n;
	static int m;
	static int[][] arr;
	static boolean[] visited;

	public static void dfs(int find) {
		visited[find] = true;
		
		for(int i=1; i<n+1; i++) {
			if(arr[find][i]==1 && arr[i][find]==1 && !visited[i]) {
				dfs(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[n+1][n+1];
		for(int i=0; i<m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			arr[u][v] = 1;
			arr[v][u] = 1;
		}
		
		visited = new boolean[n+1];
		int count = 0;
		for(int i=1; i<n+1; i++) {
			if(!visited[i]) {
				dfs(i);
				count++;
			}
		}
		System.out.println(count);
	}
}