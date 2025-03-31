package J04018;

import static java.lang.Math.abs;

public class SoPhuc {

    private long thuc, ao;

    public SoPhuc(long thuc, long ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    public SoPhuc nhan(SoPhuc o) {
        return new SoPhuc(this.thuc * o.thuc - this.ao * o.ao, this.thuc * o.ao + this.ao * o.thuc);
    }

    public SoPhuc cong(SoPhuc o) {
        return new SoPhuc(this.thuc + o.thuc, this.ao + o.ao);
    }

    public String toString(){
        String res = "";
        res += thuc;
        if(ao < 0) res += " - ";
        else res += " + ";
        res += abs(ao) + "i";
        return res;
    }

}
