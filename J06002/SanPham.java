package J06002;

public class SanPham {

    private String ma;

    private String ten;

    private int giaL1;

    private int giaL2;

    public SanPham(String ma, String ten, int giaL1, int giaL2) {
        this.ma = ma;
        this.ten = ten;
        this.giaL1 = giaL1;
        this.giaL2 = giaL2;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getGiaL1() {
        return giaL1;
    }

    public int getGiaL2() {
        return giaL2;
    }
}
