import java.util.Scanner;

public class J08012 {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int x, y;
        int[] adj = new int[n + 1];
        for(int i = 0; i < n - 1; ++i){
            x = cin.nextInt();
            y = cin.nextInt();
            ++adj[x];
            ++adj[y];
        }
        for(int i = 1; i <= n; ++i){
            if(adj[i] == n - 1){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");

    }

}
