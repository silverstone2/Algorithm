import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
        int n = sc.nextInt();
        if(n==1){
            System.out.println(-1);
            return;
        }
        
        long answer = (long)n*k/(n-1);
        
        if((n*k)%(n-1)!=0) {
            answer++;
        }
        
        System.out.println(answer);
	}
}
