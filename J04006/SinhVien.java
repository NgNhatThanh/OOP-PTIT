package J04006;

public class SinhVien {

    private String msv = "B20DCCN001";

    private String hoTen;

    private String lop;

    private String ngaySinh;

    private float gpa;

    public SinhVien(String hoTen, String lop, String ngaySinh, float gpa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = chuanHoaNgaySinh(ngaySinh);
        this.gpa = gpa;
    }

    private String chuanHoaNgaySinh(String ngaySinh){
        if(ngaySinh.charAt(2) != '/') ngaySinh = "0" + ngaySinh;
        if(ngaySinh.charAt(5) != '/') ngaySinh = ngaySinh.substring(0, 3) + "0" + ngaySinh.substring(3);
        return ngaySinh;
    }

    public String toString(){
        return msv + " " + hoTen + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa);
    }
}
