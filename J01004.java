import java.util.Scanner;

public class J01004 {

    static Scanner cin = new Scanner(System.in);

    static boolean check(int n){
        int can = (int)Math.sqrt(n);
        for(int i = 2; i <= can; ++i){
            if(n % i == 0) return false;
        }
        return true;
    }

    static void solve(){
        int n = cin.nextInt();
        if(check(n)) System.out.println("YES");
        else System.out.println("NO");
    }

    public static void main(String[] args){
        int t = 1;
        t = cin.nextInt();
        while(t-- > 0){
            solve();
        }
    }

}
