package J04003;

import java.util.Scanner;

public class J04003 {

    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args){
        PhanSo a = new PhanSo(cin.nextLong(), cin.nextLong());
        a.simplify();
        System.out.println(a);
    }

}
