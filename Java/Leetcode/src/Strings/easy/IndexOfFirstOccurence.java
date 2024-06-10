package Strings.easy;

import java.util.regex.Pattern;

public class IndexOfFirstOccurence {
    public static void main(String[] args) {
        String haystack = "butsad", needle = "sad";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);
        return index;
    }
}

