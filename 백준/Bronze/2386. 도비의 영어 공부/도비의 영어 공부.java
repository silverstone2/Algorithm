import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.nextLine();
			if(str.equals("#")) {
				System.exit(0);
			}
			
			int count = 0;
			String strs[] = str.toLowerCase().split("");
			for(int i=0; i < strs.length; i++) {
				if(str.split(" ")[0].equals(strs[i])) {
					 count++;
				}
			}
			System.out.println(str.split(" ")[0] + " " + (count-1));
		}
	}
}
