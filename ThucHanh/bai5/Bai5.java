package ThucHanh.bai5;

import java.util.HashMap;
import java.util.Scanner;

public class Bai5 {

    public static void main(String[] args){

        Scanner cin = new Scanner("MONHOC.in");

        int slMh = cin.nextInt();
        cin.nextLine();

        HashMap<String, MonHoc> mpMh = new HashMap<>();

        while(slMh-- > 0){
            MonHoc newMH = new MonHoc(cin.next(),
                    cin.nextLine());
            mpMh.put(newMH.getMaMon(), newMH);
        }

        cin = new Scanner("GIANGVIEN.in");

        int slGv = cin.nextInt();
        cin.nextLine();

        HashMap<String, GiangVien> mpGv = new HashMap<>();

        HashMap<String, Double> tongGio = new HashMap<>();

        while(slGv-- > 0){
            GiangVien newGv = new GiangVien(cin.next(),
                    cin.nextLine());
            mpGv.put(newGv.getMaGv(), newGv);
        }

        cin = new Scanner("GIOCHUAN.in");

        int slgio = cin.nextInt();
        cin.nextLine();

        while(slgio-- > 0){
            String maGv = cin.next();
            String maMon = cin.next();
            Double gio = cin.nextDouble();
            tongGio.putIfAbsent(maGv, 0.0);
            tongGio.putIfAbsent(maGv, tongGio.get(maGv) + gio);
        }

        

    }

}
