import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for(int i=0;i<cnt;i++)
        {
        	int num = sc.nextInt();
        	int number = 0;
        	for(int j=0;j<=num;j++)
        	{
        		if(j % 2 == 1)
        			number += j;
        	}
        	System.out.println(number);
        }
    }
}