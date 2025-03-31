package J07059;

public class CaThi implements Comparable<CaThi>{

    private static int currentId = 1;

    private String id;

    private String ngayThi;

    private String gioThi;

    private String phongThi;

    public CaThi(String ngayThi, String gioThi, String phongThi) {
        this.id = String.format("C%03d", currentId++);
        this.ngayThi = ngayThi;
        this.gioThi = gioThi;
        this.phongThi = phongThi;
    }

    public String toString(){
        return id + " " + ngayThi + " " + gioThi + " " + phongThi;
    }

    @Override
    public int compareTo(CaThi o) {
        if(this.ngayThi.equals(o.ngayThi)){
            if(this.gioThi.equals(o.gioThi)) return this.id.compareTo(o.id);
            return this.gioThi.compareTo(o.gioThi);
        }
        return this.ngayThi.compareTo(o.ngayThi);
    }
}
