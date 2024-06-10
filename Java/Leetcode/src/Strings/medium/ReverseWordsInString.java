package Strings.medium;
//https://leetcode.com/problems/reverse-words-in-a-string/description/
import java.util.Arrays;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "  the    sky    is           blue  ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] words = s.trim().replaceAll("\\s+"," ").split(" ");
        System.out.println(Arrays.toString(words));
        StringBuilder ans = new StringBuilder(words.length);
        for (int i = words.length - 1; i >= 0; i--) {
            if( i == 0 ){
                ans.append(words[i]);
            }
            else{
                ans.append(words[i]).append(" ");
            }
        }
        return ans.toString();

    }
}
