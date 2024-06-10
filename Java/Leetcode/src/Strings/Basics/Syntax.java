package Strings.Basics;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Syntax {
    public static void main(String[] args) {
        String a = "jay";
        a = "jack"; // new string  object is created

//        == : a -----> jay
//        == : b ------> jay
//        a==b will give false
        String str = "apple";
        methods(str);
    }

    //    Methods
    public static void methods(String s) {
        String f = "apple";
//        apple
//        01234
//        charAt
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
//codePointAt: gives ASCII/Unicode value of char
        System.out.println(s.codePointAt(0)); // ascii value = 97
        System.out.println(s.contains("app"));
        System.out.println(s.contains("la"));
// indexOf: find index of a character string
        System.out.println(s.indexOf("l")); //3
//        endsWith
        System.out.println(s.endsWith("e"));
// equals: compares string to the specified object
        System.out.println(s.equals(f)); //true
//        hasCode:
//        The Java String hashCode() method is used to return the particular value’s hash value.
//        The hashCode() uses an internal hash function that returns the hash value of the stored value in the String variable.
        System.out.println("hashcode is: " + s.hashCode());
//intern
        System.out.println("intern is: " + s.intern());
//        isEmpty
        System.out.println("isEmpty: " + s.isEmpty());
        //////////////////////////////////////////////////
//        join: Returns a new String composed of copies of the CharSequence elements joined together with a copy of the specified delimiter.
//        1. delimiter: The character sequence that will be used between each element when joining the strings.
//        2. elements: The character sequences to be joined.
//        This is a varargs parameter, which means you can pass any number of CharSequence arguments.
        String[] fruits = {"apple", "mango", "litchi"};
        String joined = String.join(" & ", fruits);
        System.out.println(joined);
// lastIndex
        System.out.println(s.lastIndexOf('l'));
        System.out.println(s.length());
//        matches : Tells whether or not this string matches the given regular expression.

//        	replace(char oldChar, char newChar)
//Returns a string resulting from replacing all occurrences of oldChar in this string with newChar
        String name = "jxy kumxr guptx";
        name = name.replace("x", "a");
        System.out.println(name);

//        	replaceAll(String regex, String replacement)
//Replaces each substring of this string that matches the given regular expression with the given replacement


//        	split(String regex)
//Splits this string around matches of the given regular expression
       String[] words =  name.split(" ");
        System.out.println(Arrays.toString(words));
//        trim
//Returns a string whose value is this string, with any leading and trailing whitespace removed

//    SubString
//        The Java substring() method extracts a part of the string (substring) and returns it.
    }
}
