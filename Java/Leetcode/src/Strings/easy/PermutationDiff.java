package Strings.easy;
//https://leetcode.com/problems/permutation-difference-between-two-strings/description/
public class PermutationDiff {
    public static void main(String[] args) {
        String s = "abc", t = "bac";
        System.out.println(findPermutationDifference(s, t));
    }

    public static int findPermutationDifference(String s, String t) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            int s2 = t.indexOf(s1);
            sum+= Math.abs(i-s2);
        }
        return sum;
    }
}
