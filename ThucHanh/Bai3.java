package ThucHanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Bai3 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner cin = new Scanner(new File("DANHSACH.in"));

        ArrayList<SinhVien> dsSv = new ArrayList<>();

        while(cin.hasNext()){
            SinhVien newSV = new SinhVien(cin.nextLine(),
                    cin.nextLine(),
                    cin.nextLine(),
                    cin.nextLine(),
                    cin.nextLine());
            dsSv.add(newSV);
        }

        dsSv.sort(new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.getLop().equals(o2.getLop())) return o1.getMsv().compareTo(o2.getMsv());
                return o1.getLop().compareTo(o2.getLop());
            }
        });

        for(SinhVien sv : dsSv) System.out.println(sv);
    }

}
