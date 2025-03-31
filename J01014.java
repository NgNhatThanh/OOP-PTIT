import java.util.Scanner;
import static java.lang.Math.sqrt;

public class J01014 {

    static Scanner cin = new Scanner(System.in);

    static void solve(){
        long n = cin.nextLong();
        long res = 0;
        for(int i = 2; i <= sqrt(n); ++i){
            while(n % i == 0){
                res = i;
                n /= i;
            }
        }
        if(n > 1) res = n;
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
