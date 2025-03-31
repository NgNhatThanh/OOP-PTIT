package J07054;

public class SinhVien implements Comparable<SinhVien>{

    private static int currentId = 1;

    private String id;

    private String hoTen;

    private int d1, d2, d3;

    private String diemTb;

    private int rank;

    public SinhVien(String hoTen, int d1, int d2, int d3) {
        this.id = String.format("SV%02d", currentId++);
        this.hoTen = chuanHoaTen(hoTen);
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        diemTb = String.format("%.2f", 1.0 * (d1 * 3 + d2 * 3 + d3 * 2) / 8);
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

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String toString(){
        return id + " " + hoTen + " " + diemTb + " " + rank;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(o.diemTb.equals(this.diemTb)) return this.id.compareTo(o.id);
        return o.diemTb.compareTo(this.diemTb);
    }
}
