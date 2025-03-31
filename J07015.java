import java.io.*;
import java.util.ArrayList;
import java.util.TreeMap;

import static java.lang.Math.sqrt;

public class J07015 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        InputStream input = new FileInputStream(new File("SONGUYEN.in"));
        ObjectInputStream ois = new ObjectInputStream(input);

        int[] pre = new int[10005];

        ArrayList<Integer> a = (ArrayList<Integer>)ois.readObject();

        for(int x : a){
            if(checkNt(x)){
                ++pre[x];
            }
        }

        for(int i = 2; i <= 9999; ++i){
            if(pre[i] > 0) System.out.println(i + " " + pre[i]);
        }
    }

    static boolean checkNt(int n){
        for(int i = 2; i <= sqrt(n); ++i){
            if(n % i == 0) return false;
        }
        return true;
    }

}
