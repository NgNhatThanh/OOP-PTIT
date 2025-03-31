package J04001;

import java.util.Scanner;

public class J04001 {

    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args){
        int t = cin.nextInt();
        Point p1, p2;
        while(t-- > 0){
            p1 = new Point(cin.nextDouble(), cin.nextDouble());
            p2 = new Point(cin.nextDouble(), cin.nextDouble());
            System.out.printf("%.4f\n", Point.distance(p1, p2));
        }
    }

}
