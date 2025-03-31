package J04018;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            SoPhuc A = new SoPhuc(sc.nextLong(), sc.nextLong());
            SoPhuc B = new SoPhuc(sc.nextLong(), sc.nextLong());
            SoPhuc tmp = A.cong(B);
            SoPhuc C = tmp.nhan(A);
            SoPhuc D = tmp.nhan(tmp);
            System.out.println(C + ", " + D);
        }

    }

}
