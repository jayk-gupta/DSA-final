package Math;

public class NonCyclicNum {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        int sum = 0;
        while (sum !=1){
            int temp=0;
            while (n != 0) {
                int r = n % 10;
                n = n / 10;
                temp += r * r;
            }
            n = temp;
            if(n == 4 ){
                return false;
            }
        }
        return true;
    }
}
