package J04005;

public class ThiSinh {

    private String hoTen;

    private String ngaySinh;

    private float diem1, diem2, diem3;

    public ThiSinh(String hoTen, String ngaySinh, float diem1, float diem2, float diem3) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public float getTongDiem(){
        return diem1 + diem2 + diem3;
    }

    public String toString(){
        return hoTen + " " + ngaySinh + " " + String.format("%.1f", getTongDiem());
    }
}
