import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner cin = new Scanner(new File("DATA.in"));

        long sum = 0;
        int n;
        String s;
        while(cin.hasNext()){
            s = cin.next();
            try{
                n = Integer.parseInt(s);
                sum += n;
            }
            catch(NumberFormatException _){}
        }
        System.out.println(sum);
    }

}
