package J04014;

public class PhanSo {

    private long tu, mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
        rutGon();
    }

    private void rutGon(){
        long gcd = gcd(tu, mau);
        tu /= gcd;
        mau /= gcd;
    }

    public PhanSo nhan(PhanSo o){
        long t = this.tu, m = this.mau;
        t *= o.tu;
        m *= o.mau;
        return new PhanSo(t, m);
    }

    public PhanSo cong(PhanSo o){
        long t = this.tu, m = this.mau;
        long lcm = lcm(m, o.mau);
        return new PhanSo(t * lcm / m + o.tu * lcm / o.mau, lcm);
    }

    public String toString(){
        return tu + "/" + mau;
    }

    private long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    private long lcm(long a, long b){
        return a * b / gcd(a, b);
    }

}
