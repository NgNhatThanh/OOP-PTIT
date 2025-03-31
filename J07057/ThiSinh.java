package J07057;

import static java.lang.Math.ceil;

public class ThiSinh implements Comparable<ThiSinh>{

    private static int currentId = 1;

    private String id;

    private String hoTen;

    private String danToc;

    private int khuVuc;

    private double diemThi;

    private String tinhTrang;

    public ThiSinh(String hoTen, double diemThi, String danToc, int khuVuc) {
        this.id = String.format("TS%02d", currentId++);
        this.hoTen = chuanHoaTen(hoTen);
        this.danToc = danToc;
        this.khuVuc = khuVuc;
        if(khuVuc == 1) diemThi += 1.5;
        else if(khuVuc == 2) diemThi += 1;
        if(!danToc.equals("Kinh")) diemThi += 1.5;
        this.diemThi = diemThi;
        if(diemThi >= 20.5) tinhTrang = "Do";
        else tinhTrang = "Truot";
    }

    public String toString(){
        return id + " " + hoTen + " " + String.format("%.1f", diemThi) + " " + tinhTrang;
    }

    @Override
    public int compareTo(ThiSinh o) {
        String d1 = String.format("%.1f", diemThi);
        String d2 = String.format("%.1f", o.diemThi);
        if(d1.equals(d2)) return this.id.compareTo(o.id);
        return d2.compareTo(d1);
    }

    private String chuanHoaTen(String ten){
        String[] words = ten.split(" ");
        StringBuilder res = new StringBuilder();
        for(String s : words){
            if(!s.isEmpty()){
                String w = Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
                res.append(w).append(" ");
            }
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }
}
