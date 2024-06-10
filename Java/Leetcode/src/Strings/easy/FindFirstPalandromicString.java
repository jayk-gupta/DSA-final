package Strings.easy;
//https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
public class FindFirstPalandromicString {
    public static void main(String[] args) {
       String[] words = {"abc","car","adab","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }
    public static String firstPalindrome(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
         sb.setLength(0);
         sb.append(word);
            if (sb.reverse().toString().equals(word)) {
                return word;
            }
        }
        return "";
    }
}
