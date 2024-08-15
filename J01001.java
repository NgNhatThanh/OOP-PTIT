import java.util.Scanner;

public class J01001 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int d = cin.nextInt(), r = cin.nextInt();
        if(d <= 0 || r <= 0) System.out.println(0);
        else System.out.println(2 * (d + r) + " " + d * r);
    }
}
