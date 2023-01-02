
import java.util.Arrays;
import java.util.Scanner;

// 브루트포스 알고리즘	* 참고 블로그 : https://blog.naver.com/hanjo1515/221813938177

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int sum = 0;
		int a = 0;
		int b = 0;
		
		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		Arrays.sort(arr);
		
		for(int i=0; i<8; i++) {
			for(int j=i+1; j<9; j++) {
				if(sum - arr[i] - arr[j] == 100) {
					a = arr[i];
					b = arr[j];
				}
			}
		}
		
		for(int i=0; i<9; i++) {
			if(arr[i] == a || arr[i] == b)  {
				continue;
			}
			System.out.println(arr[i]);
		}
	}
}
