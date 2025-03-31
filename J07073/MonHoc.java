package J07073;

public class MonHoc implements Comparable<MonHoc>{

    private String maMon;

    private String tenMon;

    private int soTinChi;

    private String hinhThucLyThuyet;

    private String hinhThucThucHanh;

    public MonHoc(String maMon, String tenMon, int soTinChi, String hinhThucLyThuyet, String hinhThucThucHanh) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTinChi = soTinChi;
        this.hinhThucLyThuyet = hinhThucLyThuyet;
        this.hinhThucThucHanh = hinhThucThucHanh;
    }

    public String getHinhThucThucHanh(){
        return hinhThucThucHanh;
    }

    public String toString(){
        return maMon + " " + tenMon + " " + soTinChi + " " + hinhThucLyThuyet + " " + hinhThucThucHanh;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.maMon.compareTo(o.maMon);
    }
}
