package J07054;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner cin = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(cin.nextLine());
        List<SinhVien> dsSinhVien = new ArrayList<>();
        while(n-- > 0){
            dsSinhVien.add(new SinhVien(cin.nextLine(),
                    Integer.parseInt(cin.nextLine()),
                    Integer.parseInt(cin.nextLine()),
                    Integer.parseInt(cin.nextLine())));
        }
        Collections.sort(dsSinhVien);
        int currentRank = 1, setRank = 1;
        String currentPoint = dsSinhVien.get(0).getDiemTb();
        for(SinhVien sv : dsSinhVien){
            if(!sv.getDiemTb().equals(currentPoint)) setRank = currentRank;
            sv.setRank(setRank);
            ++currentRank;
            System.out.println(sv);
        }
    }

}
