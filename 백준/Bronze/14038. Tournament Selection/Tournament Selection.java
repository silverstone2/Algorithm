import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] game = new String[6];
		int count = 0;
		
		for(int i=0; i<6; i++) {
			game[i] = sc.next();
			if(game[i].equals("W")) {
				count++;
			}
		}
		
		if(count >= 5) {
			System.out.println("1");
		} else if(count < 5 && count >=3 ) {
			System.out.println("2");
		} else if(count < 3 && count >=1) {
			System.out.println("3");
		} else {
			System.out.println(-1);
		}
	}
}
