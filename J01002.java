import java.util.Scanner;

public class J01002 {

    static Scanner cin = new Scanner(System.in);

    static void solve(){
        long n = cin.nextInt();
        System.out.println(n * (n + 1) / 2);
    }

    public static void main(String[] args){
        int t = 1;
        t = cin.nextInt();
        while(t-- > 0){
            solve();
        }
    }

}
