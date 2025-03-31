import java.util.HashSet;
import java.util.Scanner;

import static java.lang.Math.min;

public class J03031 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine());
            HashSet<Character> set = new HashSet<>();
            for(int i = 0; i < s.length(); i++){
                set.add(s.charAt(i));
            }
            int rem = min(s.length() - set.size(), k);
            if(rem + set.size() < 26) System.out.println("NO");
            else System.out.println("YES");
        }

    }

}
