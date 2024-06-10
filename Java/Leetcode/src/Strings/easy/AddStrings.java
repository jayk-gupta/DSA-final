package Strings.easy;

//https://leetcode.com/problems/add-strings/description/
public class AddStrings {
    public static void main(String[] args) {
//        Input: num1 = "11", num2 = "123"
//        Output: "134"
        String s1 = "11";
        String s2 = "23";
     addStrings(s1, s2);


    }

    public static void addStrings(String num1, String num2) {
        for (int i = 0; i < num1.length(); i++) {
            char c = num1.charAt(i);
            int asciiValue = (int) c; // Convert char to ASCII value
            System.out.println("ASCII value of '" + c + "': " + asciiValue);
        }

//        int n1 = Integer.parseInt(num1);
//        int n2 = Integer.parseInt(num2);
//return String.valueOf(n1+n2);
    }
}
