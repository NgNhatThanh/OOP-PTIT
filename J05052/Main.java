package J05052;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Product> List = new ArrayList<>();
        while (t-- > 0)
            List.add(new Product(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        for (Product i : List)
            System.out.println(i);
    }
}