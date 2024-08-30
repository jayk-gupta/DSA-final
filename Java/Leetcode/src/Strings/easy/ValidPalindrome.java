package Strings.easy;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panam";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String palindrome = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int i =0,j=palindrome.length()-1;
        while (i<j){
            if(palindrome.charAt(i) != palindrome.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
