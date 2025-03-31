import java.util.HashMap;
import java.util.Scanner;

public class J02016 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            HashMap<Long, Integer> mp = new HashMap<>();
            for(int i = 0; i < n; ++i){
                a[i] = sc.nextLong();
                long tmp = a[i] * a[i];
                mp.put(tmp, mp.getOrDefault(tmp, 0) + 1);
            }
            int ok = 0;
            for(int i = 0; i < n; ++i){
                for(int j = i + 1; j < n; ++j){
                    long tmp = a[i] * a[i] + a[j] * a[j];
                    if(mp.get(tmp) != null){
                        System.out.println("YES");
                        ok = 1;
                        break;
                    }
                }
                if(ok == 1) break;
            }
            if(ok == 0) System.out.println("NO");
        }

    }

}
