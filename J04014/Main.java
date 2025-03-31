package J04014;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            PhanSo A = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo B = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo tmp = A.cong(B);
            PhanSo C = tmp.nhan(tmp);
            PhanSo D = A.nhan(B).nhan(C);
            System.out.println(C + " " + D);
        }
    }

}
