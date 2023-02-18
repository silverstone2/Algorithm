import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
    static int n,B,C;
    static int[] arr;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st =new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
            arr[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        B = Integer.parseInt(st.nextToken()); // 총 감독관 관리가능 수(한 명)
        C = Integer.parseInt(st.nextToken()); // 부 감독관 관리가능 수(여러 명)
        System.out.println(solve());
    }
    
    private static long solve() {
        long result = 0;
        for(int i=0;i<n;i++) {
            // 총 시험 감독관 집어 넣기.
            int t = arr[i]-B;
            result++;
            if(t<=0) continue;
            // 부 감독관 넣기.
            // 1. 부 감독관이 딱 맞출 수 있냐, 2. 남을 경우 1명더 넣자.
            if(t%C==0) {
                result += t/C;
            }else {
                result += t/C;
                result++;
            }            
        }
        return result;
    }
}
