//package test;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
//
//public class Main
//{
//    public static void main(String[] args) throws IOException, ClassNotFoundException
//    {
//        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
//        ArrayList<Pair> a = (ArrayList<Pair>) sc.readObject();
//        ArrayList<Pair> res = new ArrayList<>();
//        Map<Pair, Integer> myMap = new HashMap<>();
//        for (Pair i : a)
//        {
//            if (i.getFirst() < i.getSecond())
//            {
//                if (!myMap.containsKey(i) && gcd(i.getFirst(), i.getSecond()) == 1)
//                {
//                    myMap.put(i, 1);
//                    res.add(i);
//                }
//            }
//
//        }
//        Collections.sort(res);
//        for (Pair i : res)
//            System.out.println(i);
//    }
//
//    static int gcd(int a, int b){
//        if(b == 0) return a;
//        return gcd(b, a % b);
//    }
//}