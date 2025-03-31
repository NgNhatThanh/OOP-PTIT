import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.abs;

public class J01018 {

    static Scanner cin = new Scanner(System.in);

    static void solve(){
        long n = cin.nextLong();
        ArrayList<Integer> cs = new ArrayList<>();
        int sum = 0;
        while(n > 0){
            cs.add((int)(n % 10));
            sum += (int)(n % 10);
            n /= 10;
        }
        if(sum % 10 != 0){
            System.out.println("NO\n");
            return;
        }
        for(int i = 0; i < cs.size() - 1; ++i){
            if(abs(cs.get(i) - cs.get(i + 1)) != 2){
                System.out.println("NO\n");
                return;
            }
        }
        System.out.println("YES\n");
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
