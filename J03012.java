import java.math.BigInteger;
import java.util.Scanner;

public class J03012 {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while(t-- > 0){
            BigInteger n1 = cin.nextBigInteger();
            BigInteger n2 = cin.nextBigInteger();
            BigInteger res = n1.add(n2);
            System.out.println(res);
        }

    }

}
