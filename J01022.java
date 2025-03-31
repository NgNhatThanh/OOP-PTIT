import java.util.Scanner;

public class J01022 {

    static Scanner cin = new Scanner(System.in);

    static long[] F = new long[93];

    static void precal(){
        F[1] = 1;
        F[2] = 1;
        for(int i = 3; i < 93; ++i) F[i] = F[i - 1] + F[i - 2];
    }

    static int Find(int n, long k){
        if(n <= 2) return n - 1;
        if(k <= F[n - 2]) return Find(n - 2, k);
        return Find(n - 1, k - F[n - 2]);
    }

    static void solve(){
        int n = cin.nextInt();
        long k = cin.nextLong();
        System.out.println(Find(n, k));
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
