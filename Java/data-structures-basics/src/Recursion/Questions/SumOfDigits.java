package Recursion.Questions;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(8784));
    }
    public static int sumOfDigits(int n){
        if(n==0) return 0;
        int r = n%10; //2
        return r+ sumOfDigits(n/10);
    }
}
