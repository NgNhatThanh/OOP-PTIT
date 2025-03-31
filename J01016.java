import java.util.Scanner;
import static java.lang.Math.sqrt;

public class J01016 {

    static Scanner cin = new Scanner(System.in);

    static void solve(){
        long n = cin.nextLong();
        int cnt = 0;
        while(n > 0){
            int d = (int)(n % 10);
            if(d == 4 || d == 7) ++cnt;
            n /= 10;
        }
        System.out.println(cnt == 4 || cnt == 7 ? "YES" : "NO");
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
