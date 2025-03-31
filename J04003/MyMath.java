package J04003;

public class MyMath{

    public static long Gcd(long a, long b){
        if(b == 0) return a;
        return Gcd(b, a % b);
    }

}
