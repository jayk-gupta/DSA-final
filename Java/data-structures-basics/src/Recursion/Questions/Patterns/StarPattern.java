package Recursion.Questions.Patterns;

public class StarPattern {
    public static void main(String[] args) {
        int n = 3;
printPattern(4,0);
    }

    static void test(int n) {
        if(n==0) return;
        System.out.println(n);
      test(n-1);

    }


    static void printPattern(int r, int c) {
        if (r < 0) return;
        if (c >= r) {
            System.out.println();
            printPattern(r-1, 0);
        } else {
            System.out.print("*");
            printPattern(r, c+1);

        }
    }

    static void PrintPatternForLoop(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print("\u0950" + " ");
            }
            System.out.println();
        }
    }
}
