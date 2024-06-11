package Recursion.Questions;

public class ReverseOfNumber {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(reverseNum(n));
    }
    static int reverseNum(int n){
       if(n==0) return 0;
       int sum = 0;
       int  r = n %10;
       sum += sum*10+r;

       return reverseNum(n/10);
    }
}
