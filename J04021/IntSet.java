package J04021;

import java.util.Set;
import java.util.TreeSet;

public class IntSet {

    private Set<Integer> set;

    public IntSet() {}

    public IntSet(int[] arr){
        set = new TreeSet<>();
        for(int i : arr) set.add(i);
    }

    public IntSet union(IntSet other){
        IntSet res = new IntSet();
        res.set = this.set;
        res.set.addAll(other.set);
        return res;
    }

    public String toString(){
        StringBuilder res = new StringBuilder();
        for(int x : set){
            res.append(x).append(" ");
        }
        return res.toString();
    }

}
