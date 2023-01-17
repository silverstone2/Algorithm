import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		StringBuffer bf = new StringBuffer();
		int num = 1;
		boolean result = true;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= num) {
				while(arr[i] >= num) {
					stack.push(num++);
					bf.append("+\n");
				}
				stack.pop();
				bf.append("-\n");
			} else {
				if(stack.pop() > arr[i]) {
					System.out.println("NO");
					result = false;
					break;
				} else {
					bf.append("-\n");
				}
			}
		}
		if(result) System.out.println(bf.toString());
	}
}