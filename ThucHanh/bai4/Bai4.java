package ThucHanh.bai4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner cin = new Scanner(new File("MUAHANG.in"));

        HashMap<String, SanPham> spMp = new HashMap<>();

        int slSp = Integer.parseInt(cin.nextLine());

        while(slSp-- > 0){
            SanPham newSp = new SanPham(cin.nextLine(),
                    cin.nextLine(),
                    Integer.parseInt(cin.nextLine()),
                    Integer.parseInt(cin.nextLine()));
            spMp.put(newSp.getMaSp(), newSp);
        }

        int slKh = Integer.parseInt(cin.nextLine());

        ArrayList<KhachHang> dsKh = new ArrayList<>();

        while(slKh-- > 0){
            KhachHang newKh = new KhachHang(cin.nextLine(),
                    cin.nextLine(),
                    spMp.get(cin.nextLine()),
                    Integer.parseInt(cin.nextLine()),
                    cin.nextLine());
            dsKh.add(newKh);
        }

        dsKh.sort(new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                if(o1.getNgayHetHanBaoHanh().equals(o2.getNgayHetHanBaoHanh()))
                    return o1.getMaKh().compareTo(o2.getMaKh());
                return o1.getNgayHetHanBaoHanh().compareTo(o2.getNgayHetHanBaoHanh());
            }
        });

        for(KhachHang kh : dsKh) System.out.println(kh);

    }

}
