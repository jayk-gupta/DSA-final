package Strings.Basics;

public class StringBuilderClass {
    public static void main(String[] args) {
//        abcdefghijklmnopqrstuvwxyz
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
//        basics
        String s = "good morning";
StringBuilder sb = new StringBuilder(s);
sb.append(" jay");
sb.replace(13,16,"Ritika");

//sb.reverse();
        System.out.println(sb.substring(0,sb.indexOf("m")));
        System.out.println(sb.charAt(1));
        System.out.println(sb);
        System.out.println(sb.indexOf("m"));

    }

}
