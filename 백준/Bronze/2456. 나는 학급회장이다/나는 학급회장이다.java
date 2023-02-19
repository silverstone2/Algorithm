import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int [][] arr = new int [4][4];//열은 각후보들의 1점, 2점, 3점짜리 점수들
									//행은 1번, 2번, 3번후보를 명칭
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			arr[1][sc.nextInt()]++;
			arr[2][sc.nextInt()]++;
			arr[3][sc.nextInt()]++;
			
		}
		
		int tempMax = -1;
		int maxCount = 0; //가장 최댓값인 것의 갯수
		int chk = 0;// 완전한 동점자가 있는지 check
		int numb = -1;//최댓값을 가진 후보의 번호
		//1. 가장 큰 sum값이 유일한 경우...
		//2. 가장 큰 sum값이 2개이상인 경우
		
		for (int i = 1; i <= 3; i++) {
			int sum = arr[i][1]+2*arr[i][2]+3*arr[i][3];
			if (sum>tempMax) {//가장 클경우.
				tempMax = sum;
				maxCount++;//최댓값의 갯수는 현재 한개
				numb = i;//i번후보가 최댓값을 가짐
			}else if (sum==tempMax) {//2번 situation
				
				//기존 최댓값 후보의 3점 갯수가 새로 등장한 후보의 3점 갯수보다 큰경우는 default로 치고,
				
				if (arr[numb][3]<arr[i][3]) {////새로운 최댓값 후보의 3점 갯수가 기존 등장한 후보의 3점 갯수보다 크다면,
					numb = i;//당선 후보의 변경
					//마찬가지로, 기존 최댓값 후보의 2점 갯수가 새로 등장한 후보의 2점 갯수보다 큰 경우는 default로 치고
					chk = 0;
				}else if (arr[numb][3]==arr[i][3] && arr[numb][2]<arr[i][2]) {//3점 갯수가 동점이면서 새로 등장한 후보의 2점 갯수가 더 큰경우
					numb = i;//당선 후보의 변경
					chk = 0;
				}else if (arr[numb][3]==arr[i][3] && arr[numb][2]==arr[i][2]) {//3점, 2점 갯수 모두 동점이라면,
					chk = 1;//완전 동점자 발생
				}
			}
			
			
		}
		if (chk ==0) {
			System.out.println(numb+" "+tempMax);
		}else {
			numb=0;
			System.out.println(numb+" "+tempMax);
		}
	}
}