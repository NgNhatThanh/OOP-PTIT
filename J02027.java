import java.util.Arrays;
import java.util.Scanner;

public class J02027 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            long res = 0;
            for(int i = 0; i < n; i++){
                int idx = UpperBound(a, i - 1, a[i] - k);
                res += i - idx;
            }
            System.out.println(res);
        }

    }

    static int UpperBound(int[] a, int R, int x) {
        int l = 0, r = R;
        while(l <= r) {
            int m = (l + r) >>> 1;
            if(a[m] <= x) l = m + 1;
            else r = m - 1;
        }
        return l;
    }

}