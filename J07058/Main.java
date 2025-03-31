package J07058;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner cin = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(cin.nextLine());
        List<MonHoc> dsMonHoc = new ArrayList<MonHoc>();
        while(n-- > 0){
            dsMonHoc.add(new MonHoc(cin.nextLine(),
                    cin.nextLine(),
                    cin.nextLine()));
        }
        Collections.sort(dsMonHoc);
        for(MonHoc mh : dsMonHoc) System.out.println(mh);
    }

}
