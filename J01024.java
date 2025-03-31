import java.util.Scanner;

public class J01024 {

    static Scanner cin = new Scanner(System.in);

    static void solve(){
        int n = cin.nextInt();
        while(n > 0){
            int d = n % 10;
            if(d != 1 && d != 0 && d != 2){
                System.out.println("NO\n");
                return;
            }
            n /= 10;
        }
        System.out.println("YES");
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
