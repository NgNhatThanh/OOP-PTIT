import java.util.Scanner;

public class J01006 {

    static Scanner cin = new Scanner(System.in);

    static long fib[] = new long[93];

    static void precal(){
        fib[1] = fib[2] = 1;
        for(int i = 3; i <= 92; ++i) fib[i] = fib[i - 1] + fib[i - 2];
    }

    static void solve(){
        int n = cin.nextInt();
        System.out.println(fib[n]);
    }

    public static void main(String[] args){
        precal();
        int t = 1;
        t = cin.nextInt();
        while(t-- > 0){
            solve();
        }
    }

}
