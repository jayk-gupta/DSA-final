package Strings.easy;

import java.util.Arrays;
import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aaaa", magazine = "banana";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] mag = magazine.toCharArray();
        char[] ransom = ransomNote.toCharArray();
        System.out.println(Arrays.toString(mag));
//     construct from magazine
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : mag) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (char c : ransom) {
            if (!map.containsKey(c)) {
                return false;
            } else {
                int freq = map.get(c);
                if(freq == 0) return false;
                map.put(c, map.get(c) - 1);
            }
        }
        return true;
    }
}
















