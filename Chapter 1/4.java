package com.company;

/*
*@author Maurice Saldivar
*/

/*
* Write a method to replace all spaces between words in a string with'%20'.
* I was given the true length of the string in the problem statement, so 13 for this example
* Given the true length I used a for loop to start at the end of array. I shift everything down and input the new
* characters every time I hit a space. .
* */


import java.util.Collections;

public class Main
{
    public static char[] modify(char[] str, int length)
    {

        int size = str.length - 1;
        for (int i = length - 1; i >=0 ; i--)
        {
            if(str[i] == ' ')
            {
                str[size - 1] = '0';
                str[size - 2] = '2';
                str[size - 3] = '%';
                size -= 3;
            }else
            {
                str[size - 1] = str[i];
                size -= 1;
            }
        }
        return str;
    }

    public static void main(String[] args)
    {
        char[] original = {'M','r',' ','J','o','h','n',' ','S','m','i','t','h',' ',' ',' ',' ','\0'};
        int length = 13;
        char[] newArry = modify(original, length);
        System.out.println(newArry);
    }
}
