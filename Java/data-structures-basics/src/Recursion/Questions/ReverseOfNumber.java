package Recursion.Questions;

public class ReverseOfNumber {
    //    Method-1
    static int  sum = 0;
    static void reverseNum(int n){
        if(n==0) return ;
        int  r = n %10;
        sum = sum*10+r;

        reverseNum(n/10);
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(rev2(n));
//        System.out.println(sum);
    }

//    Method-2
    static double rev2(int n){
//        Sometimes we need some additional variables int the arguments
//        In that case make another function
        int digits = (int) (Math.log10(n))+1;
        return helper(n,digits);
    }

    static double helper(int n, int digits) {
    if(n%10 == n ) return n;
    int rem = n%10;
    return rem*Math.pow(10,digits-1) + helper(n/10,digits-1);
    }
}
