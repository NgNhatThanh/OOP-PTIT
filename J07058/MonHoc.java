package J07058;

public class MonHoc implements Comparable<MonHoc>{

    private String maMon;

    private String tenMon;

    private String hinhThucThi;

    public MonHoc(String maMon, String tenMon, String hinhThucThi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhThucThi = hinhThucThi;
    }

    public String toString(){
        return maMon + " " + tenMon + " " + hinhThucThi;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.maMon.compareTo(o.maMon);
    }
}
