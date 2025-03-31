package J04004;

import java.util.Scanner;

public class J04004 {

    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args){
        PhanSo a = new PhanSo(cin.nextLong(), cin.nextLong());
        PhanSo b = new PhanSo(cin.nextLong(), cin.nextLong());
        a.simplify();
        b.simplify();
        a.add(b);
        a.simplify();
        System.out.println(a);
    }

}
