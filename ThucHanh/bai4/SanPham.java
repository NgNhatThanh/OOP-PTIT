package ThucHanh.bai4;

public class SanPham {

    private String maSp;

    private String tenSp;

    private int giaBan;

    private int thoiHanBaoHanh;

    public SanPham(String maSp, String tenSp, int giaBan, int thoiHanBaoHanh) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.giaBan = giaBan;
        this.thoiHanBaoHanh = thoiHanBaoHanh;
    }

    public String getMaSp(){
        return maSp;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public int getThoiHanBaoHanh(){
        return thoiHanBaoHanh;
    }

}
