package J07056;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class KhachHang implements Comparable<KhachHang>{

    private static int currentId = 1;

    private String id;

    private String hoTen;

    private String loaiGD;

    private int soDau;

    private int soCuoi;

    private int tienTrongDinhMuc;

    private int tienVuotDinhMuc;

    private int VAT;

    private int tongTien;

    public KhachHang(String hoTen, String loaiGD, int soDau, int soCuoi) {
        this.id = String.format("KH%02d", currentId++);
        this.hoTen = chuanHoaTen(hoTen);
        this.loaiGD = loaiGD;
        this.soDau = soDau;
        this.soCuoi = soCuoi;

        int dinhMuc = 0;
        switch (loaiGD){
            case "A":
                dinhMuc = 100;
                break;
            case "B":
                dinhMuc = 500;
                break;
            case "C":
                dinhMuc = 200;
        }

        int soDien = soCuoi - soDau;
        tienTrongDinhMuc = min(dinhMuc, soDien) * 450;
        tienVuotDinhMuc = max(0, soDien - dinhMuc) * 1000;
        VAT = (int)(tienVuotDinhMuc * 0.05);
        tongTien = tienTrongDinhMuc + tienVuotDinhMuc + VAT;
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

    public String toString(){
        return id + " " + hoTen + " " + tienTrongDinhMuc + " " + tienVuotDinhMuc + " " + VAT + " " + tongTien;
    }

    @Override
    public int compareTo(KhachHang o) {
        return o.tongTien - this.tongTien;
    }
}
