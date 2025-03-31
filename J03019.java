import java.util.Scanner;

public class J03019 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder res = new StringBuilder();
        char cur = s.charAt(s.length() - 1);
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) >= cur){
                res.append(s.charAt(i));
                cur = s.charAt(i);
            }
        }
        res.reverse();
        System.out.println(res);
    }

}
