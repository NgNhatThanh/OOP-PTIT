package J06002;

import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int slSp = Integer.parseInt(sc.nextLine());
        HashMap<String, SanPham> mp = new HashMap<>();
        while(slSp-- > 0){
            SanPham sp = new SanPham(sc.nextLine(),
                    sc.nextLine(),
                    Integer.parseInt(sc.nextLine()),
                    Integer.parseInt(sc.nextLine()));
            mp.put(sp.getMa(), sp);
        }

        int slHd = Integer.parseInt(sc.nextLine());
        ArrayList<HoaDon> dsHd = new ArrayList<>();
        while(slHd-- > 0){
            String ma = sc.next();
            int sl = sc.nextInt();
            sc.nextLine();
            HoaDon hd = new HoaDon(ma,
                    sl,
                    mp.get(ma.substring(0, 2)));
            dsHd.add(hd);
        }

        dsHd.sort(new Comparator<HoaDon>() {
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                return o2.getTienTra() - o1.getTienTra();
            }
        });

        for(HoaDon hd : dsHd) System.out.println(hd);

    }

}
