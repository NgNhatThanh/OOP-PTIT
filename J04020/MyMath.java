package J04020;

import static java.lang.Math.sqrt;

public class MyMath {

    public static boolean isPrime(int n){
        for(int i = 2; i <= sqrt(n); ++i){
            if(n % i == 0) return false;
        }
        return true;
    }

}
