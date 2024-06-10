package MathQues;

public class CountNumDividigNum{
    public static void main(String[] args) {
        int num = 1245;
        System.out.println(countDigits(num));
    }

    public static int countDigits(int num) {
        int n = num;
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem != 0 && num % rem == 0) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

}


