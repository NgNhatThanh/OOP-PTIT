import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class J07004 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner cin = new Scanner(new File("DATA.in"));
        TreeMap<Integer, Integer> mp = new TreeMap<>();

        int n;

        while(cin.hasNext()){
            n = cin.nextInt();
            mp.putIfAbsent(n, 0);
            mp.put(n, mp.get(n) + 1);
        }

        for(int x : mp.keySet()) System.out.println(x + " " + mp.get(x));
    }

}
