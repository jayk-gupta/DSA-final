package Strings.easy;
//https://leetcode.com/problems/score-of-a-string/description/
public class ScoreOfString {
    public static void main(String[] args) {
        String s = "hello";
        //        |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13
        System.out.println(scoreOfString(s));


    }
        public static int scoreOfString(String s) {
            int sum = 0;
            for (int i = 0; i < s.length()-1; i++) {
                sum+= Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
            }
            return  sum;
        }

}
