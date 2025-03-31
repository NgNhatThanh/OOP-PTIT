package J04013;

public class ThiSinh {

    private String ma;

    private String hoTen;

    private double d1, d2, d3;

    private double tongDiem;

    private double diemUuTien;

    private String tinhTrang;

    public ThiSinh(String ma, String hoTen, double d1, double d2, double d3) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;

        int kv = ma.charAt(2) - '0';
        tongDiem = d1 * 2 + d2 + d3;
        switch (kv){
            case 1:
                diemUuTien = 0.5;
                break;
            case 2:
                diemUuTien = 1;
                break;
            case 3:
                diemUuTien = 2.5;
                break;
        }
        tinhTrang = tongDiem + diemUuTien >= 24 ? "TRUNG TUYEN" : "TRUOT";
    }

    public String toString(){
        return ma + " " + hoTen + " " + formatDiem(diemUuTien) + " " + formatDiem(tongDiem) + " " + tinhTrang;
    }

    private String formatDiem(double diem){
        if(diem == (long)diem) return String.valueOf((long)diem);
        else return String.format("%.1f", diem);
    }
}
