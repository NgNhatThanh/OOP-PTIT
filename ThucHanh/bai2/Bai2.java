package ThucHanh.bai2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args){

        Scanner cin = new Scanner(System.in);

        int slCn = Integer.parseInt(cin.nextLine());

        ArrayList<CongNhan> dsCn = new ArrayList<>();

        while(slCn-- > 0){
            CongNhan newCn = new CongNhan(cin.nextLine(),
                    cin.nextLine(),
                    cin.nextLine(),
                    cin.nextLine());
            dsCn.add(newCn);
        }

        dsCn.sort(new Comparator<CongNhan>() {
            @Override
            public int compare(CongNhan o1, CongNhan o2) {
                if(o1.getSoPhutLam() == o2.getSoPhutLam()) return o1.getMaCn().compareTo(o2.getMaCn());
                return o2.getSoPhutLam() - o1.getSoPhutLam();
            }
        });

        for(CongNhan cn : dsCn) System.out.println(cn);

    }

}
