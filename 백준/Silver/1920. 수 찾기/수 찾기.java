import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i=0; i<n; i++) {
			A[i] = sc.nextInt();
		}
		// 이분탐색을 할 때는 무조건 정렬된 배열이 필요하므로 정렬을 진행해준다!
		Arrays.sort(A);
		
		int m = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<m; i++) {
			if(binarySearch(A, sc.nextInt()) >= 0) {
				sb.append(1).append('\n');
			} else {
				sb.append(0).append('\n');
			}
		}
		System.out.println(sb);
	}
	/**
	 * @param A 정렬 된 배열
	 * @param key 찾으려는 값
	 * @return key와 일치하는 배열의 인덱스
	 */
	public static int binarySearch(int[] A, int key) {
		int low = 0;	// 왼쪽 끝
		int high = A.length-1;	// 오른쪽 끝
		
		while(low<=high) {
			int mid = (low + high) / 2;	// 중간
			
			// key값이 중간 위치의 값보다 작을 경우
			if(key<A[mid]) {
				high = mid - 1;
			}
			// key값이 중간 위치의 값보다 클 경우
			else if(key > A[mid]) {
				low = mid + 1;
			}
			// key값과 중간 위치의 값이 같을 경우
			else {
				return mid;
			}
		}
		// 찾고자 하는 값이 존재하지 않을 경우
		return -1;
	}
}