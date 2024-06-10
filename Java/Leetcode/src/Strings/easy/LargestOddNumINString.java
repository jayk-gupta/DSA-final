package Strings.easy;
//https://leetcode.com/problems/largest-odd-number-in-string/description/
// 30 mins
import java.math.BigInteger;

public class LargestOddNumINString {
    public static void main(String[] args) {
        String num = "52";
        System.out.println(largestOddNumber2(num));
    }

    public static String largestOddNumber2(String num) {
// we have to reduce length and check if the num is odd

      int i = num.length()-1 ;
      while (i >= 0){
          int n = (int)num.charAt(i);
          if(n % 2 != 0) return num.substring(0,i+1);
          i--;
      }
        return "";
    }

    public static String largestOddNumber(String num) {
// we have to reduce length and check if the num is odd
        for (int i = 0; i < num.length(); i++) {
            String n = num.substring(0,num.length()-i);
            BigInteger substr = new BigInteger(n);
            if (substr.mod(BigInteger.valueOf(2)).equals(BigInteger.ONE)) {
                return n;
            }
        }
        return "";
    }
}
