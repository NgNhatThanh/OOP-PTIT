import java.util.*;

import static java.lang.Math.min;
import static java.lang.Math.sqrt;

public class J02025 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Integer[] a = new Integer[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            Arrays.sort(a, (o1, o2) -> o2 - o1);
            int lim = 1 << n;
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            for(int i = 1; i < lim; ++i){
                ArrayList<Integer> list = new ArrayList<>();
                int sum = 0;
                for(int j = 0; j < n; ++j){
                    if((i & (1 << j)) > 0){
                        list.add(a[j]);
                        sum += a[j];
                    }
                }
                if(isPrime(sum)) res.add(list);
            }
            res.sort((o1, o2) -> {
                for (int i = 0; i < min(o1.size(), o2.size()); ++i) {
                    if (o1.get(i) != o2.get(i)) return o1.get(i) - o2.get(i);
                }
                return o1.size() - o2.size();
            });
            for(ArrayList<Integer> list : res){
                for(int x : list) System.out.print(x + " ");
                System.out.println();
            }
        }

    }

    static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= sqrt(n); ++i){
            if(n % i == 0) return false;
        }
        return true;
    }

}
