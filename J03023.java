import java.util.Scanner;

public class J03023 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            int res = 0;
            for(int i = 0; i < s.length(); i++){
                int cur = convert(s.charAt(i));
                if(i < s.length() - 1 && cur < convert(s.charAt(i + 1))){
                    res -= cur;
                }
                else res += cur;
            }
            System.out.println(res);
        }

    }

    static int convert(char c){
        switch (c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }

}
