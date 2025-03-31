package J04020;

import static J04020.MyMath.isPrime;

public class Pair<T, S> {

    T firstValue;

    S secondValue;

    public Pair(T firstValue, S secondValue){
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public T getFirst(){
        return firstValue;
    }

    public S getSecond(){
        return secondValue;
    }

    public boolean isPrime(){
        return MyMath.isPrime((Integer)firstValue) && MyMath.isPrime((Integer)secondValue);
    }

    public String toString(){
        return firstValue + " " + secondValue;
    }

}
