import java.util.Scanner;
import java.util.Stack;

public class J08020 {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        while(t-- > 0){
            String s = cin.nextLine();
            Stack<Character> stack = new Stack<>();
            int ok = 1;
            for(int i = 0; i < s.length(); ++i){
                if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '('){
                    stack.push(s.charAt(i));
                }
                else{
                    if(stack.isEmpty()){
                        ok = 0;
                        System.out.println("NO");
                        break;
                    }
                    else{
                        if(s.charAt(i) == ')' && stack.peek() == '('
                        || s.charAt(i) == '}' && stack.peek() == '{'
                        || s.charAt(i) == ']' && stack.peek() == '['){
                            stack.pop();
                        }
                        else{
                            ok = 0;
                            System.out.println("NO");
                            break;
                        }
                    }
                }
            }
            if(ok == 1) System.out.println("YES");
        }

    }

}
