package ThucHanh;

public class KhachHang {

    static private int currentId = 1;

    private String id;

    private String hoTen;

    private String gioiTinh;

    private String ngaySinh;

    private String diaChi;

    public KhachHang(String hoTen, String gioiTinh, String ngaySinh, String diaChi){
        this.id = String.format("KH%03d", currentId++);
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getId(){
        return id;
    }

    public String toString(){
        return hoTen + " " + diaChi;
    }

}
