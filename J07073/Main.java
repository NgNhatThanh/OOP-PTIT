package J07073;

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
        List<MonHoc> dsMonHoc = new ArrayList<>();
        while(n-- > 0){
            dsMonHoc.add(new MonHoc(cin.nextLine(),
                    cin.nextLine(),
                    Integer.parseInt(cin.nextLine()),
                    cin.nextLine(),
                    cin.nextLine()));
        }
        Collections.sort(dsMonHoc);
        for(MonHoc ct : dsMonHoc){
            if(ct.getHinhThucThucHanh().equals("Truc tuyen") || ct.getHinhThucThucHanh().contains(".ptit.edu.vn")){
                System.out.println(ct);
            }
        }
    }

}
