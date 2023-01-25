import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			Stack stack = new Stack();
			String str = sc.next();
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) == '(') {
					stack.push('(');
				} else if(str.charAt(j) == ')') {
					try{
						stack.pop();
					} catch(Exception e) {
						stack.push("fair");
						break;
					}
				}
			}
			if(stack.isEmpty()) {
				System.out.println("YES");
			} else if(!stack.isEmpty()) {
				System.out.println("NO");
			}
 		}
	}
}