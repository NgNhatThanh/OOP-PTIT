package J07053;

import static java.lang.Math.min;
import static java.lang.Math.round;

public class ThiSinh {

    private static int currentId = 1;

    private String id;
    
    private String hoTen;

    private String ngaySinh;

    private float diemLyThuyet;

    private float diemThucHanh;

    private int diemTrungBinh;

    private String xepLoai;

    public ThiSinh(String hoTen, String ngaySinh, float diemLyThuyet, float diemThucHanh){
        this.id = String.format("PH%02d", currentId++);
        this.hoTen = chuanHoaTen(hoTen);
        this.ngaySinh = ngaySinh;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
        float diemthuong = 0;
        if(diemLyThuyet >= 8 && diemThucHanh >= 8) diemthuong = 1;
        else if(diemLyThuyet >= 7.5 && diemThucHanh >= 7.5) diemthuong = 0.5f;
        diemTrungBinh = min(10, round((diemLyThuyet + diemThucHanh) / 2 + diemthuong));
        if(diemTrungBinh < 5) xepLoai = "Truot";
        else if(diemTrungBinh <= 6) xepLoai = "Trung binh";
        else if(diemTrungBinh <= 7) xepLoai = "Kha";
        else if(diemTrungBinh <= 8) xepLoai = "Gioi";
        else xepLoai = "Xuat sac";
    }

    public int getTuoi(){
        return 2021 - Integer.parseInt(ngaySinh.substring(ngaySinh.length() - 4));
    }

    public String toString(){
        return id + " " + hoTen + " " + getTuoi() + " " + diemTrungBinh + " " + xepLoai;
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
