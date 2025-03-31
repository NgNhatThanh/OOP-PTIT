import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HELLOFILE {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("Hello.txt");
        Scanner cin = new Scanner(f);
        String s;
        while(cin.hasNextLine()){
            s = cin.nextLine();
            System.out.println(s);
        }
        cin.close();
    }
}
