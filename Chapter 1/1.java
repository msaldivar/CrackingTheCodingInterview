package com.company;
import java.io.*;

/**
 * @author Maurice Saldivar
 *
 */

/*
* I first check to see if the string passed to the function is greater than 256.
* there are only 256 unique characters (ascii) so anything greater than that number has duplicates
* next I make a boolean array of that size. I convert every character in the string to its ascii value
* and make that position in the array true. If a position is already true is a duplicate and I return false
* if no duplicates are found I return true.
*
* If I wasn't allowed to use a data structure like an array I could still solve the problem but would need to add a
* constraint. The constraint being the the string would need to be ordered by its characters ascii values.
* starting with 0 and the max being 255. With this constraint I can use the formula n(n+1)/2 where n is the number of
* characters. I can add up all the ascii values in the string compare it the total of a unique string of the same
* length would be. By taking the difference would give me the ascii value of any repeated character.
* */

public class Main
{

    public static boolean isUnique(String unique)
    {
        if (unique.length() > 256)
            return false;

        boolean seen[] = new boolean[256];
        for (int i =0; i < unique.length(); i++)
        {
            int temp = unique.charAt(i);
            if(seen[temp])
                return false;
            else
                seen[temp] = true;
        }
        return true;
    }


    public static void main(String[] args)
    {

        String test1 = "abc defghi"; // a string that is unique
        String test2 = "abb"; // a string that is not unique

        if(isUnique(test1))
            System.out.println("the string is unique");
        else
            System.out.println("the string is not unique");
    }
}
