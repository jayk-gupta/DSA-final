package POTD;
//https://leetcode.com/problems/append-characters-to-string-to-make-subsequence/description/?envType=daily-question&envId=2024-06-03
public class AppendCharToStringToMakeSubseq {
    public static void main(String[] args) {
//        String s = "coaching", t = "coding";
//        String s = s = "z", t = "abcde";
        String s = s = "abcde", t = "a";
        System.out.println(appendCharacters(s, t));
    }

    public static int appendCharacters(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
            i++;
        }
        if (i == 1) return 1;
        return t.length() - i;
    }
}
