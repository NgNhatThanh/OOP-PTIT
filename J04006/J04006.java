package J04006;

import java.util.Scanner;

public class J04006 {

    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args){
        SinhVien a = new SinhVien(cin.nextLine(),
                                cin.nextLine(),
                                cin.nextLine(),
                                cin.nextFloat());
        System.out.println(a);
    }

}
