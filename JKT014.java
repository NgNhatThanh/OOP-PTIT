import java.util.Scanner;
import java.util.Stack;

public class JKT014 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();
        while(t-- > 0){
            int n = cin.nextInt();
            int[] a = new int[n];
            Stack<Integer> st = new Stack<>();
            int[] left = new int[n];
            for(int i = 0; i < n; ++i){
                a[i] = cin.nextInt();
                while(!st.isEmpty() && a[st.peek()] <= a[i]) st.pop();
                if(st.isEmpty()) left[i] = -1;
                else left[i] = st.peek();
                st.push(i);
                System.out.print(i - left[i] +  " ");
            }
            System.out.println();
        }
    }

}
