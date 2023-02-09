import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		int[] Monthlist = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] Weeklist = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		int totalday = day;
		for (int i = 0; i < month - 1; ++i) {
			totalday += Monthlist[i];
		}
		
		System.out.println(Weeklist[totalday % 7]);
	}
}