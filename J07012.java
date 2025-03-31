import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class J07012 {

    static class Pair{

        private String first;

        private int second;

        public Pair(String first, int second){
            this.first = first;
            this.second = second;
        }

        public String toString(){
            return first + " " + second;
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("DATA.in");
        ObjectInputStream ois = new ObjectInputStream(fis);

        ArrayList<String> arr = (ArrayList<String>) ois.readObject();

        fis.close();
        ois.close();

        HashMap<String, Integer> mp = new HashMap<>();

        for(String s : arr) {
            s = s.trim().toLowerCase();
            String[] w = s.split("[^a-z0-9]");
            for(String w1 : w) {
                if(!w1.isEmpty()) mp.put(w1, mp.getOrDefault(w1, 0) + 1);
            }
        }

        ArrayList<Pair> pairs = new ArrayList<>();

        for(String s : mp.keySet()) pairs.add(new Pair(s, mp.get(s)));

        pairs.sort(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.second == o2.second) return o1.first.compareTo(o2.first);
                return o2.second - o1.second;
            }
        });

        for(Pair p : pairs) {
            System.out.println(p);
        }

    }

}
