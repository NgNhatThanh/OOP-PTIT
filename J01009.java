import java.util.Scanner;

public class J01009 {

    static Scanner cin = new Scanner(System.in);

    static void solve(){
        int n = cin.nextInt();
        long ans = 1, gt = 1;
        for(int i = 2; i <= n; ++i){
            gt *= i;
            ans += gt;
        }
        System.out.println(ans);
    }

    public static void main(String[] args){
        int t = 1;
//        t = cin.nextInt();
        for(int i = 1; i <= t; ++i){
//            System.out.print("Test " + i + ": ");
            solve();
        }
    }

}
