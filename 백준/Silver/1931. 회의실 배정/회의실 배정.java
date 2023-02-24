import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] time = new int[n][2];
		int count = 0;
		
		for(int i=0; i<n; i++) {
			time[i][0] = sc.nextInt();	// 시작
			time[i][1] = sc.nextInt();	// 종료
		}
		// 끝나는 시간을 기준으로 정렬하기 위해 compare 재정의 (안하면 애러 발생)
		Arrays.sort(time, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				// 종료시간이 같을 경우 시작시간이 빠른순으로 정렬해야한다.  
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
			
		});
		
		int before_end_time = 0;
		for(int i=0; i<n; i++) {
			if(before_end_time <= time[i][0]) {
				before_end_time = time[i][1];
				count++;
			}
		}
		System.out.println(count);
	}
}