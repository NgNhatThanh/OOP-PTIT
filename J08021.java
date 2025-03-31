import java.util.Scanner;
import java.util.Stack;

import static java.lang.Math.max;

public class J08021 {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        while(t-- > 0){
            String s = cin.nextLine();
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            int res = 0, cur = 0;
            for(int i = 0; i < s.length(); ++i){
                if(s.charAt(i) == '(') st.push(i);
                else{
                    st.pop();
                    if(!st.isEmpty()){
                        res = max(res, i - st.peek());
                    }
                    else{
                        st.push(i);
                    }
                }
            }
            System.out.println(res);
        }

    }

}