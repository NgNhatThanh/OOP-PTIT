package J04004;

import static J04004.MyMath.Gcd;
import static J04004.MyMath.Lcm;

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

    public void add(PhanSo b){
        long l = Lcm(this.mau, b.mau);
        this.tu *= (long) (l / this.mau);
        this.tu += b.tu * (l / b.mau);
        this.mau = l;
    }

    public String toString(){
        return tu + "/" + mau;
    }

}
