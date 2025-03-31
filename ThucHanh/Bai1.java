package ThucHanh;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

import static java.lang.Math.sqrt;

public class Bai1 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("DATA1.in");
        ObjectInputStream ois = new ObjectInputStream(fis);

        HashMap<Integer, Integer> mp1 = new HashMap<>();
        TreeMap<Integer, Integer> mp2 = new TreeMap<>();

        ArrayList<Integer> arr = (ArrayList<Integer>) ois.readObject();

        for(int x : arr){
            if(isPrime(x)){
                mp1.putIfAbsent(x, 0);
                mp1.put(x, mp1.get(x) + 1);
            }
        }

        fis.close();
        ois.close();
        fis = new FileInputStream("DATA2.in");
        ois = new ObjectInputStream(fis);

        arr = (ArrayList<Integer>) ois.readObject();

        for(int x : arr){
            if(mp1.get(x) != null && isPrime(x)){
                mp2.putIfAbsent(x, 0);
                mp2.put(x, mp2.get(x) + 1);
            }
        }

        for(Integer key : mp2.keySet()){
            System.out.println(key + " " + mp1.get(key) + " " + mp2.get(key));
        }

        fis.close();
        ois.close();

    }

    public static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= sqrt(n); ++i){
            if(n % i == 0) return false;
        }
        return true;
    }

}
