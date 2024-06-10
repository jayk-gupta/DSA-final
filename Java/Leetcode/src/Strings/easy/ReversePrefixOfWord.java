package Strings.easy;

import java.util.Arrays;

public class ReversePrefixOfWord {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
//        Output: "dcbaefd"
        System.out.println(reversePrefix2(word, ch));
    }


    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        char[] words = word.toCharArray();
        for (int i = 0; i <= index; i++) {
            char temp = words[i];
            words[i] = words[index];
            words[index] = temp;
            index--;
        }
        String ans = new String(words);
        return ans;
    }

    public static String reversePrefix2(String word, char ch) {
      // converting char to string
        StringBuilder sb = new StringBuilder(word);
        int indexOfChar = sb.indexOf(String.valueOf(ch));
       String substr =  sb.substring(0,indexOfChar+1);
sb.replace(0,indexOfChar+1,new StringBuilder(substr).reverse().toString());
       return sb.toString();
    }
}
