package ThucHanh;

public class SinhVien {

    private String msv;

    private String hoTen;

    private String lop;

    private String email;

    private String sdt;

    public SinhVien(String msv, String hoTen, String lop, String email, String sdt) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        if(sdt.charAt(0) != '0') sdt = "0" + sdt;
        this.sdt = sdt;
    }

    public String getLop(){
        return lop;
    }

    public String getMsv(){
        return msv;
    }

    public String toString(){
        return msv + " " + hoTen + " " + lop + " " + email + " " + sdt;
    }
}
