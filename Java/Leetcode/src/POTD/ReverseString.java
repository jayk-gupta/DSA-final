package POTD;

import java.util.Arrays;
// https://leetcode.com/problems/reverse-string/description/?envType=daily-question&envId=2024-06-02
/*
* Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.
Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
* */
public class ReverseString {
    public static void main(String[] args) {
char[] s = {'h','e','l','l'};
    reverseString(s);
        System.out.println(Arrays.toString(s));
    }
    public static void reverseString(char[] s) {
        int j = s.length-1;
        for (int i = 0; i < s.length/2; i++) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j--;
        }
    }
}
