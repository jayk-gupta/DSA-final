package BinarySearch.easy;

public class Sqrt {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        if (x == 0) return 0;
        int start = 1;
        int end = x;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(mid*mid<=x) {
                start=mid+1;
            }
            if(mid*mid>x){
                end=mid-1;
            }
        }
        return end;
    }
}
