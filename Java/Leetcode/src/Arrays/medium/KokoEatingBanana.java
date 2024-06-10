package Arrays.medium;

import java.util.Arrays;

public class KokoEatingBanana {
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 5;
        System.out.println(minEatingSpeed(piles, h));
    }

    //    BINARY SEARCH
    public static int minEatingSpeed(int[] piles, int h) {
        int s = 1;
        int e = Arrays.stream(piles).max().orElseThrow();

        while (s <= e) {
            int mid = s + (e - s) / 2;
            int k = 0;
            for (int i = 0; i < piles.length; i++) {
                if (piles[i] == mid) {
                    k++;
                } else {
                    int q = piles[i] / mid;
                    int rem = piles[i] % mid;
                    if (rem == 0) k += q;
                    else {
                        k += (q + 1);
                    }
                }

            }

            if (k == h) return mid;
            else if (k < h) e = mid - 1;
            else s = mid + 1;
            k = 0;
        }

        return 0;
    }

    //    BRUTE FORCE : BY ME
    public static int minEatingSpeed2(int[] piles, int h) {
        int k = 0;
        int max = Arrays.stream(piles).max().orElseThrow();
        for (int i = 1; i <= max; i++) {
            for (int j = 0; j < piles.length; j++) {
                if (piles[j] == i) {
                    k++;
                } else {
                    int q = piles[j] / i;
                    k += q + 1;
                }

            }
            if (k == h) return i;
            k = 0;
        }
        return 1;
    }
}
