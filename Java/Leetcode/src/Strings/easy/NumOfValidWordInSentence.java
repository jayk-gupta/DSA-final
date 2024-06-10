package Strings.easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumOfValidWordInSentence {
    public static void main(String[] args) {
countValidWords("jay!");
    }

    public static void countValidWords(String sentence) {
        StringBuilder s = new StringBuilder();
        Pattern p = Pattern.compile("\\b\\w+[!.,-:]\\b");
        Matcher m = p.matcher(sentence);
        boolean b= m.matches();
//The while (m.find()) loop repeatedly calls m.find(), which finds the next subsequence of the input string that matches the pattern.
        while (m.find()){
            s.append(m.group()).append(" ");
        }
        System.out.println(s);
    }
}
