import java.util.Scanner;

public class J02037 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String inp = sc.nextLine();
            String[] w = inp.split(" ");
            int chan = 0, le = 0;
            for(String s : w){
                int tmp = Integer.parseInt(s);
                if(tmp % 2 == 0) ++chan;
                else ++le;
            }
            if((w.length % 2 == 0 && chan > le) || (w.length % 2 == 1 && le > chan)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }

    }

}
