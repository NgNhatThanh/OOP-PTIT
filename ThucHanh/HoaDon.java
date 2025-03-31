package ThucHanh;

public class HoaDon {

    static private int currentId = 1;

    private String id;

    private KhachHang khachHang;

    private MatHang matHang;

    private int soLuong;

    private int tongTien;

    public HoaDon(KhachHang khachHang, MatHang matHang, int soLuong) {
        this.id = String.format("HD%03d", currentId++);
        this.khachHang = khachHang;
        this.matHang = matHang;
        this.soLuong = soLuong;
        this.tongTien = soLuong * matHang.getGiaBan();
    }

    public String toString(){
        return id + " " + khachHang + " " + matHang + " " + soLuong + " " + tongTien;
    }
}
