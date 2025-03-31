import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07085 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));

        ArrayList<String> inp = (ArrayList<String>) ois.readObject();
        for(String s : inp){
            String res = "";
            int sum = 0;
            for(int i = 0; i < s.length(); i++){
                if(Character.isDigit(s.charAt(i))){
                    if(s.charAt(i) != '0' || !res.isEmpty()) res += s.charAt(i);
                    sum += s.charAt(i) - '0';
                }
            }
            System.out.println(res + " " + sum);
        }

    }

}
