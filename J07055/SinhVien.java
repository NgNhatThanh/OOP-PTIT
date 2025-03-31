package J07055;

public class SinhVien implements Comparable<SinhVien>{

    private static int currentId = 1;

    private String id;

    private String hoTen;

    private int d1, d2, d3;

    private String diemTb;

    private String xepLoai;

    public SinhVien(String hoTen, int d1, int d2, int d3) {
        this.id = String.format("SV%02d", currentId++);
        this.hoTen = chuanHoaTen(hoTen);
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        diemTb = String.format("%.2f", d1 * 0.25 + d2 * 0.35 + d3 * 0.4);
        float dtb = Float.parseFloat(diemTb);
        if(dtb < 5) xepLoai = "KEM";
        else if(dtb < 6.5) xepLoai = "TRUNG BINH";
        else if(dtb < 8) xepLoai = "KHA";
        else xepLoai = "GIOI";
    }

    private String chuanHoaTen(String ten){
        String[] words = ten.split(" ");
        StringBuilder res = new StringBuilder();
        for(String s : words){
            if(!s.isEmpty()){
                String w = Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
                res.append(w).append(" ");
            }
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }

    public String getDiemTb() {
        return diemTb;
    }

    public String toString(){
        return id + " " + hoTen + " " + diemTb + " " + xepLoai;
    }

    @Override
    public int compareTo(SinhVien o) {
        return o.diemTb.compareTo(this.diemTb);
    }
}
