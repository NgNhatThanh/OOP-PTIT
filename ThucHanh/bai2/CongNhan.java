package ThucHanh.bai2;

import static java.lang.Math.max;

public class CongNhan {

    private String maCn;

    private String hoTen;

    private String gioDen;

    private String gioVe;

    private int soPhutLam;

    private String tinhTrang;

    public CongNhan(String maCn, String hoTen, String gioDen, String gioVe) {
        this.maCn = maCn;
        this.hoTen = hoTen;
        this.gioDen = gioDen;
        this.gioVe = gioVe;

        String[] den = gioDen.split(":");
        String[] ve = gioVe.split(":");

        int hD = Integer.parseInt(den[0]);
        int pD = Integer.parseInt(den[1]);

        int hV = Integer.parseInt(ve[0]);
        int pV = Integer.parseInt(ve[1]);

        soPhutLam = (hV * 60 + pV) - (hD * 60 + pD) - 60;

        if(soPhutLam >=  8 * 60) tinhTrang = "DU";
        else tinhTrang = "THIEU";
    }

    public String getMaCn() {
        return maCn;
    }

    public int getSoPhutLam() {
        return soPhutLam;
    }

    public String toString(){
        return maCn + " " + hoTen + " " + formatPhutLam() + " " + tinhTrang;
    }

    private String formatPhutLam(){
        return soPhutLam / 60 + " gio " + soPhutLam % 60 + " phut";
    }
}
