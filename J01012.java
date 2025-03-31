import java.util.Scanner;

import static java.lang.Math.sqrt;

public class J01012 {

    static Scanner cin = new Scanner(System.in);

    static void solve(){
        int n = cin.nextInt();
        int res = 0;
        for(int i = 1; i <= sqrt(n); ++i){
            if(n % i == 0){
                if(i % 2 == 0) ++res;
                if(n / i != i && (n / i) % 2 == 0) ++res;
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args){
        int t = 1;
        t = cin.nextInt();
        for(int i = 1; i <= t; ++i){
//            System.out.print("Test " + i + ": ");
            solve();
        }
    }

}
