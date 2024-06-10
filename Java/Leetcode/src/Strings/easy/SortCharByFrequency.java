package Strings.easy;

import java.util.HashMap;

public class SortCharByFrequency {
    public static void main(String[] args) {
        String s = "Aabb"; // bbaA
        System.out.println(frequencySort(s));

    }
//XXXXXXXXXX
    public static String frequencySort(String s) {
        HashMap<Character, Integer> chars = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!chars.containsKey(c)) {
                chars.put(c, 1);
            } else {
                chars.put(c, chars.get(c) + 1);
            }
        }
        System.out.println(chars);
        return "";
    }
}
