package Strings.easy;
//https://leetcode.com/problems/defanging-an-ip-address/description/
public class DefangingIPAddress {
    public static void main(String[] args) {
// Input: address = "1.1.1.1"
//Output: "1[.]1[.]1[.]1"
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
    public static String defangIPaddr(String address) {
return address.replaceAll("\\.","[.]");

    }

}
