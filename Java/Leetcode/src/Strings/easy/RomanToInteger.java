package Strings.easy;

import java.util.HashMap;

//https://leetcode.com/problems/roman-to-integer/description/
//Can Optimize
public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        System.out.println(map);
        char[] roman = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int romanValue = map.get(roman[i]);
            if (i == s.length() - 1) {
                sum += romanValue;
            } else if (romanValue < map.get(roman[i + 1])) {
                sum -= romanValue;
            } else {
                sum += romanValue;
            }

        }
        return sum;

    }
}
