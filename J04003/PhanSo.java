package J04003;

import static J04003.MyMath.Gcd;

public class PhanSo {

    private long tu, mau;

    public PhanSo(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }

    public void simplify(){
        long gcd = Gcd(tu, mau);
        tu /= gcd;
        mau /= gcd;
    }

    public String toString(){
        return tu + "/" + mau;
    }

}
