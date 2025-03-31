import java.util.Scanner;
import java.util.Stack;

public class JKT015 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        String s = cin.nextLine();

        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) == '-'){
                if(!left.isEmpty()) left.pop();
            }
            else if(s.charAt(i) == '>'){
                if(!right.isEmpty()){
                    left.push(right.pop());
                }
            }
            else if(s.charAt(i) == '<'){
                if(!left.isEmpty()) right.push(left.pop());
            }
            else left.push(s.charAt(i));
        }
        StringBuilder res =  new StringBuilder();
        while(!left.isEmpty()) res.append(left.pop());
        res.reverse();
        while(!right.isEmpty()) res.append(right.pop());
        System.out.println(res);
    }

}
