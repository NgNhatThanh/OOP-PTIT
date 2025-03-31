import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07001 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner cin = new Scanner(new File("DATA.in"));

        while(cin.hasNextLine()){
            System.out.println(cin.nextLine());
        }
    }

}
