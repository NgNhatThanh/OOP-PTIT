package J07056;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner cin = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(cin.nextLine());
        List<KhachHang> dsKhachHang = new ArrayList<>();
        while(n-- > 0){
            String hoTen = cin.nextLine();
            String dien = cin.nextLine();
            String[] ws = dien.split(" ");
            dsKhachHang.add(new KhachHang(hoTen,
                    ws[0],
                    Integer.parseInt(ws[1]),
                    Integer.parseInt(ws[2])));
        }
        Collections.sort(dsKhachHang);
        for(KhachHang kh : dsKhachHang){
            System.out.println(kh);
        }
    }

}
