package J04009;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point A = new Point(sc.nextDouble(), sc.nextDouble());
            Point B = new Point(sc.nextDouble(), sc.nextDouble());
            Point C = new Point(sc.nextDouble(), sc.nextDouble());
            double c1 = A.distance(B), c2 = A.distance(C), c3 = B.distance(C);
            if(c1 + c2 <= c3 || c1 + c3 <= c2 || c2 + c3 <= c1){
                System.out.println("INVALID");
            }
            else{
                double S = sqrt((c1 + c2 + c3) * (c1 + c2 - c3) * (c1 - c2 + c3) * (-c1 + c3 + c2)) * 1/4;
                System.out.printf("%.2f\n", S);
            }
        }

    }

}
