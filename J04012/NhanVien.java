package J04012;

public class NhanVien {

    private static int currentId = 1;

    private String maNv;

    private String hoTen;

    private int luongCoBanNgay;

    private int soNgayCong;

    private String chucVu;

    private int luongThang;

    private int thuong;

    private int phuCap;

    private int tongThu;

    public NhanVien(String hoTen, int luongCoBanNgay, int soNgayCong, String chucVu) {
        this.maNv = String.format("NV%02d", currentId++);
        this.hoTen = hoTen;
        this.luongCoBanNgay = luongCoBanNgay;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;
        this.luongThang = soNgayCong * luongCoBanNgay;
        if(soNgayCong >= 25) thuong = (int)(luongThang * 0.2);
        else if(soNgayCong >= 22) thuong = (int)(luongThang * 0.1);
        switch (chucVu){
            case "GD":
                phuCap = 250000;
                break;
            case "PGD":
                phuCap = 200000;
                break;
            case "TP":
                phuCap = 180000;
                break;
            case "NV":
                phuCap = 150000;
        }
        tongThu = luongThang + phuCap + thuong;
    }

    public String toString(){
        return maNv + " " + hoTen + " " + luongThang + " " + thuong + " " + phuCap + " " + tongThu;
    }
}
