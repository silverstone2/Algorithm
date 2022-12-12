import java.util.Scanner;

public class Main {
	static int w = 0;
	static int h = 0;
	static int[][] map;
	static int[] dx = {0,0,1,-1,-1,1,-1,1};
	static int[] dy = {1,-1,0,0,-1,1,1,-1};
	static boolean[][] check;
	static int count;
	
	public static void Find(int x, int y) {
		check[x][y] = true;
		
		for(int i=0; i<8; i++) {
			int cx = x + dx[i];
			int cy = y + dy[i];
			
			if(cx >=0 && cy>= 0 && cx < h && cy < w) {
				// check가 false일때 값이 들어가줘야해서 ! 붙이기
				if(map[cx][cy] == 1 && !check[cx][cy]) {
					Find(cx, cy);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			// 넓이 : w, 높이 : h
			// 가로가 w, 세로가 h
			w = sc.nextInt();
			h = sc.nextInt();
			map = new int[h][w];
			check = new boolean[h][w];
			
			if(w==0 && h==0) {
				break;
			}
			count = 0;
			
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					if(map[i][j] == 1 && !check[i][j]) {
						Find(i, j);
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}
