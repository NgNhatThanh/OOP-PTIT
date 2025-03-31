package J02009;

public class Pair implements Comparable<Pair> {

    int first;

    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }


    @Override
    public int compareTo(Pair o) {
        return this.first - o.first;
    }
}
