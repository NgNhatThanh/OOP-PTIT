import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J08015 {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();
        while(t-- > 0){
            int n = cin.nextInt();
            long k = cin.nextLong();
            long[] arr = new long[n];
            Map<Long, Long> mp = new HashMap<>();
            for(int i = 0; i < n; ++i){
                arr[i] = cin.nextLong();
                mp.putIfAbsent(arr[i], 0L);
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            long res = 0;
            for(long x : arr){
                if(mp.get(k - x) != null){
                    if(k - x == x) res += mp.get(k - x) - 1;
                    else res += mp.get(k - x);
                }
            }
            System.out.println(res / 2);

        }

    }

}