import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            int sh = sc.nextInt(), sm = sc.nextInt(), ss = sc.nextInt();
            int eh = sc.nextInt(), em = sc.nextInt(), es = sc.nextInt();
            int start = (sh*3600)+(sm*60)+ss;
            int end = (eh*3600)+(em*60)+es;
            int t = end - start;
            int h = t/3600;
            int m = (t%3600)/60;
            int s = (t%3600)%60;
            
            System.out.println(h + " " + m + " " + s);
        }
    }
}