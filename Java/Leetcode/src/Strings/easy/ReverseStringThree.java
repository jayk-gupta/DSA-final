package Strings.easy;
//https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
import java.util.Arrays;

public class ReverseStringThree {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWordsOptimized(s));
    }

    public static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
          ans.append(reverseWord(words[i]));
          if(i < words.length-1){
              ans.append(" ");
          }
        }
        return ans.toString();
    }

    public static String reverseWord(String word) {
//take: ekat
        StringBuilder sb = new StringBuilder(word);
       return  sb.reverse().toString();

    }public static String reverseWordsOptimized(String s) {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
         words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        return String.join(" ",words);
    }


}
