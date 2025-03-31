package J02009;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import static java.lang.Math.max;

public class Main {

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();
        Pair[] a = new Pair[n];
        for(int i = 0; i < n; ++i){
            a[i] = new Pair(cin.nextInt(), cin.nextInt());
        }
        Arrays.sort(a);
        int res = 0;
        for(int i = 0; i < n; ++i){
            res = max(res, a[i].first);
            res += a[i].second;
        }
        System.out.println(res);
    }

}
