package MathQues;

public class DivNonDivSumDiff {
    public static void main(String[] args) {
        System.out.println(differenceOfSums(5, 6));

    }

    public static int differenceOfSums(int n, int m) {
        int num1 = 0, num2 = 0;

        for (int i = 0; i <= n; i++) {
            if (i % m == 0) num2 += i;
            else num1 += i;
        }
        return num1 - num2;
    }

}