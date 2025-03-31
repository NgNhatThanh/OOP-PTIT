package J07059;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner cin = new Scanner(new File("CATHI.in"));
        int n = Integer.parseInt(cin.nextLine());
        List<CaThi> dsCaThi = new ArrayList<>();
        while(n-- > 0){
            dsCaThi.add(new CaThi(cin.nextLine(),
                    cin.nextLine(),
                    cin.nextLine()));
        }
        Collections.sort(dsCaThi);
        for(CaThi ct : dsCaThi) System.out.println(ct);
    }

}
