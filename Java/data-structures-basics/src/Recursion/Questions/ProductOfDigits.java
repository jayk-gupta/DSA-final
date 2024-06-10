package Recursion.Questions;

public class ProductOfDigits {
    public static void main(String[] args) {
       int ans =  productOfDigits(1204);
        System.out.println(ans);
    }
    public static int productOfDigits(int n){
        if(n%10 == n) return n;
        return (n%10)* productOfDigits(n/10);
    }
}
