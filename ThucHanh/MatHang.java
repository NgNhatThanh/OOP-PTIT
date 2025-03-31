package ThucHanh;

public class MatHang {

    static private int currentId = 1;

    private String id;

    private String ten;

    private String dvt;

    private int giaMua;

    private int giaBan;

    public MatHang(String ten, String dvt, int giaMua, int giaBan) {
        this.id = String.format("MH%03d", currentId++);
        this.ten = ten;
        this.dvt = dvt;
        this.giaBan = giaBan;
        this.giaMua = giaMua;
    }

    public String getId(){
        return id;
    }

    public int getGiaBan(){
        return giaBan;
    }

    public String toString(){
        return ten + " " + dvt + " " + giaMua + " " + giaBan;
    }
}
