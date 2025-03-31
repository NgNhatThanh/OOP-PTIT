import java.util.Scanner;
import java.util.Stack;

public class J08022 {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();
        while(t-- > 0){
            int n = cin.nextInt();
            int[] a = new int[n];
            Stack<Integer> st = new Stack<>();
            int[] res = new int[n];
            for(int i = 0; i < n; ++i) a[i] = cin.nextInt();
            for(int i = n - 1; i >= 0; --i){
                while(!st.isEmpty() && st.peek() <= a[i]) st.pop();
                if(st.isEmpty()) res[i] = -1;
                else res[i] = st.peek();
                st.push(a[i]);
            }
            for(int x : res) System.out.print(x + " ");
            System.out.println();
        }

    }

}
