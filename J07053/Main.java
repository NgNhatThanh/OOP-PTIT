package J07053;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner cin = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(cin.nextLine());
        List<ThiSinh> dsThiSinh = new ArrayList<>();
        while(n-- > 0){
            dsThiSinh.add(new ThiSinh(cin.nextLine(), 
                                        cin.nextLine(), 
                                        Float.parseFloat(cin.nextLine()),
                                        Float.parseFloat((cin.nextLine()))));
        }
        for(ThiSinh t : dsThiSinh){
            System.out.println(t);
        }
    }
}
