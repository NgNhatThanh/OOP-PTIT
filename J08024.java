import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J08024 {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();
        while(t-- > 0){
            int n = cin.nextInt();
            Queue<Long> q = new LinkedList<>();
            q.add(9L);
            while(true){
                long x = q.remove();
                if(x % n == 0){
                    System.out.println(x);
                    break;
                }
                q.add(x * 10);
                q.add(x * 10 + 9);
            }
        }

    }

}
