package J06002;

public class HoaDon {

    private static int currentId = 1;

    private String ma;

    private int sl;

    private SanPham sanPham;

    private int tienGiam;

    private int tienTra;

    public HoaDon(String ma, int sl, SanPham sanPham) {
        this.ma = String.format("%s-%03d", ma, currentId++);
        this.sl = sl;
        this.sanPham = sanPham;

        if(ma.charAt(2) == '1') tienTra = sl * sanPham.getGiaL1();
        else tienTra = sl * sanPham.getGiaL2();

        if(sl >= 150) tienGiam = (int) (tienTra * 0.5);
        else if(sl >= 100) tienGiam = (int) (tienTra * 0.3);
        else if(sl >= 50) tienGiam = (int) (tienTra * 0.15);

        tienTra -= tienGiam;
    }

    public int getTienTra(){
        return tienTra;
    }

    public String toString(){
        return ma + " " + sanPham.getTen() + " " + tienGiam + " " + tienTra;
    }

}
