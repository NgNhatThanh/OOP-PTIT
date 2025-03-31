import java.util.Scanner;

public class J03028 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            StringBuilder p1 = new StringBuilder();
            StringBuilder p2 = new StringBuilder();
            int s1 = 0, s2 = 0;
            for(int i = 0; i < s.length(); i++){
                if(i < s.length() / 2) s1 += s.charAt(i) - 'A';
                else s2 += s.charAt(i) - 'A';
            }
            for(int i = 0; i < s.length(); ++i){
                char c = rotate(s.charAt(i), i < s.length() / 2 ? s1 : s2);
                if (i < s.length() / 2)  p1.append(c);
                else p2.append(c);
            }
            for(int i = 0; i < s.length() / 2; ++i){
                p1.setCharAt(i, rotate(p1.charAt(i), p2.charAt(i) - 'A'));
            }
            System.out.println(p1);
        }

    }

    static char rotate(char c, int step){
        step %= 26;
        while(step-- > 0){
            if(c == 'Z') c = 'A';
            else ++c;
        }
        return c;
    }

}
