package J04013;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ThiSinh ts = new ThiSinh(sc.nextLine(),
                sc.nextLine(),
                sc.nextDouble(),
                sc.nextDouble(),
                sc.nextDouble());
        System.out.println(ts);
    }

}
