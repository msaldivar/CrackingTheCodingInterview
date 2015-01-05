package com.company;
import java.lang.reflect.Array;
import java.util.*;
/*
* @author Maurice Saldivar
* take two strings and see if they are a palindrome
* ASSUMING NOT ALL LOWER CASE AND NO WHITE SPACE
* I could use a tolower function and a string trim function if my assumptions were incorrect.
* */


/*
* I take the first string passed to my function and reverse it. I than compare the new string to the second string
* if they matched I knew it was a palindrome. Two other ways this could have been solved. First is sort the characters
* in the string than compare if each string had the same characters. If they did its a palindrome. The second way would
* be add up the ascii value of both strings and check if they are the same.
*  */

 public class Main
{

    public static boolean isPal(String str1, String str2)
    {
        if(str1.length() == 1 && str1.equals(str2))
            return true;

        String temp = str1;
        temp = new StringBuilder(temp).reverse().toString();

        if(temp.equals(str2))
            return true;

        char[] test = str1.toCharArray();


        return false;
    }

    public static void main(String[] args)
    {
        String st1 = "diaper";
        String st2 = "repaid";

        if(isPal(st1,st2))
            System.out.println(st1 + " and " + st2 + " are palindromes ");
        else
            System.out.println("the strings are not palindromes");
    }
}
