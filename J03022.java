import java.util.Scanner;

public class J03022 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder full = new StringBuilder();
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            full.append(s).append(" ");
        }
        String[] sentences = full.toString().trim().toLowerCase().split("[.?!]");
        for(String s : sentences){
            if(!s.isEmpty()){
                s = s.trim();
                s = Character.toUpperCase(s.charAt(0)) + s.substring(1);
                String[] words = s.split("\\s+");
                for(String w : words){
                    System.out.print(w + " ");
                }
                System.out.println();
            }
        }
    }

}