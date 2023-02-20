import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
        //8진수 -> 2진수 모든 경우의 수 구하기
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            switch (c){
                case '0':
                	sb.append("000"); break;
                case '1':
                	sb.append("001"); break;
                case '2':
                	sb.append("010"); break;
                case '3': 
                	sb.append("011"); break;
                case '4': 
                	sb.append("100"); break;
                case '5': 
                	sb.append("101"); break;
                case '6':
                	sb.append("110"); break;
                case '7': 
                	sb.append("111"); break;
            }
        }
        //앞 2자리가 0일경우 삭제
        if (sb.charAt(0)=='0') sb.deleteCharAt(0);
        if (sb.charAt(0)=='0') sb.deleteCharAt(0);
        System.out.println(sb);
	}
}
