import java.util.Arrays;
import java.util.Scanner;

public class J02028 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            int[] a = new int[n];
            long[] pre = new long[n + 1];
            pre[0] = 0;
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                pre[i + 1] = pre[i] + a[i];
            }
            int ok = 0;
            for(int i = 0; i <= n; ++i){
                if(Arrays.binarySearch(pre, i + 1, n + 1, k + pre[i]) > 0){
                    System.out.println("YES");
                    ok = 1;
                    break;
                }
            }
            if(ok == 0) System.out.println("NO");
        }

    }

}
