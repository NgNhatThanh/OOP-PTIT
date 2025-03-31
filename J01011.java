import java.util.Scanner;

import static java.lang.Math.sqrt;

public class J01011 {

    static Scanner cin = new Scanner(System.in);

    static int Gcd(int a, int b){
        if(b == 0) return a;
        return Gcd(b, a % b);
    }

    static void solve(){
        int a = cin.nextInt(), b = cin.nextInt();
        int gcd = Gcd(a, b);
        long lcd = (long)a * b / gcd;
        System.out.println(lcd + " " + gcd);
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
