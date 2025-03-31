import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JKT013 {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();
        while(t-- > 0){
            int n = cin.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("6");
            q.add("8");
            ArrayList<String> res = new ArrayList<>();
            while(true){
                String s = q.remove();
                if(s.length() > n) break;
                res.add(s);
                q.add(s + "6");
                q.add(s + "8");
            }
            System.out.println(res.size());
            for(int i = res.size() - 1; i >= 0; i--) System.out.print(res.get(i) + " ");
            System.out.println();
        }

    }

}
