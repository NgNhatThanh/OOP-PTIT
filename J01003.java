import java.util.Scanner;

public class J01003 {

    static Scanner cin = new Scanner(System.in);

    static void solve(){
        int a = cin.nextInt(), b = cin.nextInt();
        if(a == 0){
            if(b == 0) System.out.println("VSN");
            else System.out.println("VN");
        }
        else System.out.printf("%.2f", 1.0 * -b / a);
    }

    public static void main(String[] args){
        int t = 1;
        // t = cin.nextInt();
        while(t-- > 0){
            solve();
        }
    }

}
