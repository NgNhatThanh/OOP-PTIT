package J07057;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner cin = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(cin.nextLine());
        List<ThiSinh> dsThiSinh = new ArrayList<>();
        while(n-- > 0){
            dsThiSinh.add(new ThiSinh(cin.nextLine(),
                    Float.parseFloat(cin.nextLine()),
                    cin.nextLine(),
                    Integer.parseInt(cin.nextLine())));
        }
        Collections.sort(dsThiSinh);
        for(ThiSinh ts : dsThiSinh) System.out.println(ts);
    }

}
