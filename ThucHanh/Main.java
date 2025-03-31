package ThucHanh;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner cin = new Scanner(new File("KH.in"));

        int slKh = Integer.parseInt(cin.nextLine());

        Map<String, KhachHang> khMap = new HashMap<>();

        while(slKh-- > 0){
            KhachHang newKh = new KhachHang(cin.nextLine(),
                                        cin.nextLine(),
                                        cin.nextLine(),
                                        cin.nextLine());
            khMap.put(newKh.getId(), newKh);
        }

        cin = new Scanner(new File("MH.in"));

        int slMh = Integer.parseInt(cin.nextLine());

        Map<String, MatHang> mhMap = new HashMap<>();

        while(slMh-- > 0){
            MatHang newMH = new MatHang(cin.nextLine(),
                    cin.nextLine(),
                    Integer.parseInt(cin.nextLine()),
                    Integer.parseInt(cin.nextLine()));
            mhMap.put(newMH.getId(), newMH);
        }

        cin = new Scanner(new File("HD.in"));

        int slHd = Integer.parseInt(cin.nextLine());

        while(slHd-- > 0){
            HoaDon hoaDon = new HoaDon(khMap.get(cin.next()),
                                    mhMap.get(cin.next()),
                                    Integer.parseInt(cin.next()));
            System.out.println(hoaDon);
        }

    }

}
