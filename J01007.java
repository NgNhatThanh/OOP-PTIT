import java.util.Scanner;

public class J01007 {

    static Scanner cin = new Scanner(System.in);

    static long fib[] = new long[93];

    static void precal(){
        fib[1] = fib[2] = 1;
        for(int i = 3; i <= 92; ++i) fib[i] = fib[i - 1] + fib[i - 2];
    }

    static void solve(){
        long n = cin.nextLong();
        for(int i = 0; i <= 92; ++i){
            if(fib[i] == n){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
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
