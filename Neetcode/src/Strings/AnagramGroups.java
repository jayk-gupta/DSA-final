package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGroups {
    public static void main(String[] args) {
      String[]  strs = {"act","pots","tops","cat","stop","hat"};
        List<List<String>> ans = groupAnagrams(strs);
        System.out.println(ans);
//        Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
    }
    public static List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            boolean isAnagram  = checkAnagram(strs[i]);
            if(isAnagram){
                map.putIfAbsent(strs[i],new ArrayList<>());
                map.get(strs[i]).add(strs[i]);
            }
        }
        List<List<String>> groups = new ArrayList<>();
        return groups;
    }





    public static boolean checkAnagram(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1; i>=0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString().equals(s);
    }
}
