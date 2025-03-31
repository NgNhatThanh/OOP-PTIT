import java.util.HashSet;
import java.util.Scanner;

public class J03037 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int res = 0;
        int[][] check = new int[26][26];
        for(int i = 0; i < s.length(); i++){
            int idx = s.indexOf(s.charAt(i), i + 1);
            if(idx != -1){
                HashSet<Character> set = new HashSet<>();
                for(int j = i + 1; j < idx; j++){
                    if(set.contains(s.charAt(j))) set.remove(s.charAt(j));
                    else set.add(s.charAt(j));
                }
                for(Character c : set){
                    check[s.charAt(i) - 'A'][c - 'A'] = 1;
                }
            }
        }
        for(int i = 0; i < 26; i++){
            for(int j = i + 1; j < 26; j++) res += check[i][j];
        }
        System.out.println(res);
    }

}
