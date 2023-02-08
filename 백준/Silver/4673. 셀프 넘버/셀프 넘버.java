public class Main {
	public static void main(String[] args) {
		// 셀프 넘버 : 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97
		boolean[] num = new boolean[10001];
		
		for(int i=1; i<=10000; i++) {
			int n = d(i);
			
			if(n <  10001) {
				num[n] = true;
			}
		}
		
		for(int i=1; i<=10000; i++) {
			if(num[i] == false) {
				System.out.println(i);
			}
		}
	}
	
	public static int d(int number) {
		int sum = number;
		while(number!=0) {
			sum += number%10;
			number = number/10;
		}
		return sum;
	}
}
