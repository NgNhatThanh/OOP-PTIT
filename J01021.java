import java.util.Scanner;

public class J01021 {

    static Scanner cin = new Scanner(System.in);

    static long mod = (long)1e9 + 7;

    static long Pow(long a, long b){
        if(b == 0) return 1;
        long res = Pow(a, b / 2);
        res = (res * res) % mod;
        if(b % 2 == 1) res = (res * a) % mod;
        return res;
    }

    public static void main(String[] args){
        long a, b;
        while(cin.hasNext()){
            a = cin.nextLong(); b = cin.nextLong();
            if(a == 0 && b == 0) return;
            System.out.println(Pow(a, b));
        }
    }

}
