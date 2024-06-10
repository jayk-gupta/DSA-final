package Strings.easy;
//https://leetcode.com/problems/merge-strings-alternately/description/
public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "girl", word2 = "beautiful";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        int totalLength = word1.length() + word2.length();
        StringBuilder sb = new StringBuilder(totalLength);
        for (int i = 0; i <= Math.max(word1.length(), word2.length()); i++) {
            if (i <= word1.length()-1) {
                sb.append(word1.charAt(i));
            }
            if (i <= word2.length()-1) {
                sb.append(word2.charAt(i));
            }

        }
        return sb.toString();
    }
}
