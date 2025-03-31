package J04005;

import java.util.Scanner;

public class J04005 {

    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args){
        ThiSinh a = new ThiSinh(cin.nextLine(),
                                cin.nextLine(),
                                cin.nextFloat(),
                                cin.nextFloat(),
                                cin.nextFloat());
        System.out.println(a);
    }

}
