import java.util.Scanner;

import static java.lang.Math.sqrt;

public class J01008 {

    static Scanner cin = new Scanner(System.in);

    static void solve(){
        int n = cin.nextInt();
        for(int i = 2; i <= sqrt(n); ++i){
            int cnt = 0;
            while(n % i == 0){
                ++cnt;
                n /= i;
            }
            if(cnt > 0) System.out.print(i + "(" + cnt + ") ");
        }
        if(n > 1) System.out.println(n + "(1)");
        System.out.println();
    }

    public static void main(String[] args){
        int t = 1;
        t = cin.nextInt();
        for(int i = 1; i <= t; ++i){
            System.out.print("Test " + i + ": ");
            solve();
        }
    }

}
