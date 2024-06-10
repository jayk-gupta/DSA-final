package Strings.easy;

public class StringHalvesAreAlike {
    public static void main(String[] args) {
        String s = "applesoi";
        System.out.println(halvesAreAlike(s));

    }

    public static boolean halvesAreAlike(String s) {
        // Calculate the midpoint of the string
        int midpoint = s.length() / 2;

        // Split the string into two halves
        String[] halves = {s.substring(0, midpoint), s.substring(midpoint)};
        int len = halves[0].length();
        char[] s1 = halves[0].toCharArray();
        int c1 = 0, c2 = 0;
        char[] s2 = halves[1].toCharArray();
        for (int i = 0; i <len; i++) {
            char ch1 = s1[i], ch2 = s2[i];
            if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u' || ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U') {
                c1++;
            }
            if (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u' || ch2 == 'A' || ch2 == 'E' || ch2 == 'I' || ch2 == 'O' || ch2 == 'U') {
                c2++;
            }
        }

        return c1==c2;
    }
}
