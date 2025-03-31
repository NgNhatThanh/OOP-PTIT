package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<test.Pair> a = (ArrayList<test.Pair>) sc.readObject();
        ArrayList<test.Pair> res = new ArrayList<>();
        Map<test.Pair, Integer> myMap = new HashMap<>();
        for (test.Pair i : a)
        {
            if (i.getFirst() < i.getSecond())
            {
                if (!myMap.containsKey(i))
                {
                    myMap.put(i, 1);
                    res.add(i);
                }
            }

        }
        Collections.sort(res);
        for (test.Pair i : res)
            System.out.println(i);
    }

}