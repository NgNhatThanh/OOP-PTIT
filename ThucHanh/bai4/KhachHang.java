package ThucHanh.bai4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

public class KhachHang {

    private static int currentId = 1;

    private String maKh;

    private String hoTen;

    private String diaChi;

    private SanPham sanPham;

    private int slMua;

    private Date ngayMua;

    private int tienThanhToan;

    private Date ngayHetHanBaoHanh;

    public KhachHang(String hoTen, String diaChi, SanPham sanPham, int slMua, String ngayMua){
        this.maKh = String.format("KH%02d", currentId++);
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sanPham = sanPham;
        this.slMua = slMua;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.ngayMua = dateFormat.parse(ngayMua);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        this.tienThanhToan = sanPham.getGiaBan() * slMua;
        this.ngayHetHanBaoHanh = this.ngayMua;
        this.ngayHetHanBaoHanh.setMonth(this.ngayMua.getMonth() + sanPham.getThoiHanBaoHanh());
    }

    public String toString(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String newDate = simpleDateFormat.format(ngayHetHanBaoHanh);
        return maKh + " " + hoTen + " " + diaChi + " " + sanPham.getMaSp() + " " + tienThanhToan + " " + newDate;
    }

    public String getMaKh() {
        return maKh;
    }

    public Date getNgayHetHanBaoHanh() {
        return ngayHetHanBaoHanh;
    }
}
