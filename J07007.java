import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

public class J07007 {

    public static void main(String[] args) throws IOException {
        Scanner cin = new Scanner(new File("VANBAN.in"));
        TreeSet<String> ss = new TreeSet<>();

        String s;

        while(cin.hasNext()){
            s = cin.next();
            s = s.toLowerCase();
            ss.add(s);
        }

        for(String x : ss) System.out.println(x);
    }

}
