package Recursion;

public class GfgSeries {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(gfSeries(n));
    }

    public static int gfSeries(int N) {
        if (N < 2) return N;
        return (gfSeries(N - 2)*gfSeries(N-2))- gfSeries(N - 1);

    }
}
