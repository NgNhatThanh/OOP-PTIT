import java.util.ArrayList;
import java.util.Scanner;

public class J02023 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();

        if(s > 9 * n || (s == 0 && n > 1)) System.out.println("-1 -1");
        else{
            StringBuilder min = new StringBuilder();
            while(s >= 9){
                min.append('9');
                s -= 9;
            }
            if(min.length() == n) System.out.println(min + " " + min);
            else{
                StringBuilder max = new StringBuilder(min);
                int tmp = s;
                if(n - min.length() == 1) min.append(s);
                else{
                    if(s > 1){
                        min.append(s - 1);
                        s = 1;
                    }
                    for(int i = min.length(); i < n - 1; ++i) min.append('0');
                    min.append(s);
                }
                max.append(tmp);
                min.reverse();
                for(int i = max.length(); i < n; ++i) max.append('0');
                System.out.println(min + " " + max);
            }
        }
    }

}
