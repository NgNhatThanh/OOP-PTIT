import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J03020 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> res = new ArrayList<String>();
        HashMap<String, Integer> mp = new HashMap<>();
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] w = s.split(" ");
            for(String w1 : w){
                if(isPalindrome(w1)){
                    if(res.isEmpty()){
                        res.add(w1);
                        mp.put(w1, 1);
                    }
                    else{
                        if(w1.length() > res.get(0).length()){
                            res.clear();
                            mp.clear();
                            res.add(w1);
                            mp.put(w1, 1);
                        }
                        else if(w1.length() == res.get(0).length()){
                            if(mp.get(w1) == null){
                                res.add(w1);
                                mp.put(w1, 1);
                            }
                            else mp.put(w1, mp.get(w1) + 1);
                        }
                    }
                }
            }
        }
        for(String s : res){
            System.out.println(s + " " + mp.get(s));
        }

    }

    static boolean isPalindrome(String s){
        int l = 0, r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            ++l; --r;
        }
        return true;
    }

}
