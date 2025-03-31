package J07081;

public class SinhVien implements Comparable<SinhVien>{

    private String msv;

    private String hoTen;

    private String sdt;

    private String email;

    public SinhVien(String msv, String hoTen, String sdt, String email) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.email = email;
    }

    @Override
    public String toString() {
        return msv + " " + hoTen + " " + sdt + " " + email;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.hoTen.equals(o.hoTen)) return this.msv.compareTo(o.msv);
        String[] w1 = this.hoTen.split(" ");
        String[] w2 = o.hoTen.split(" ");
        if(w1[w1.length - 1].equals(w2[w2.length - 1])){
            if(w1[0].equals(w2[0])){
                String dem1 = " ";
                String dem2 = " ";
                for(int i = 1; i < w1.length - 1; i++) dem1 += w1[i] + " ";
                for(int i = 1; i < w2.length - 1; i++) dem2 += w2[i] + " ";
                return dem1.compareTo(dem2);
            }
            return w1[0].compareTo(w2[0]);
        }
        return w1[w1.length - 1].compareTo(w2[w2.length - 1]);
    }
}
