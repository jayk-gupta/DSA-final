package Strings.easy;
//XXXXXXXXXXXXXX
public class BuddyStrings {
    public static void main(String[] args) {
        String s = "abcd", goal = "badc";
        System.out.println(buddyStrings(s,goal));
    }
    public static boolean buddyStrings(String s, String goal) {
// case-1
        if(s.length() != goal.length()) return false;
//        case-2
        if(s.equals(goal)) {
            boolean ans = false;
            for (int i = 0; i < s.length()-1; i++) {
                if(s.charAt(i) != s.charAt(i+1)) return  false;
            }
            return true;
        };
//    case-3
        int[] indexes = {0,0};
        int j = 0;
        for (int i = 0; i < goal.length(); i++) {
            if(s.charAt(i) != goal.charAt(i)){
                if(j > 1) return  false;
                indexes[j] = i;
                j++;
            }
        }
        String ans =  swap(s,indexes[0],indexes[1]);
        if(ans.equals(goal)) return true;
        return  false;
    }

    private static String swap(String s, int index1, int index2) {
        char[] chars = s.toCharArray();
        char temp = chars[index1];
        chars[index1] = chars[index2];
        chars[index2] = temp;
        return new String(chars);
    }

}
