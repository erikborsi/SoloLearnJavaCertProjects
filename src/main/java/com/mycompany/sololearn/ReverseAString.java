package com.mycompany.sololearn;

import java.util.Scanner;

/* Reverse a String */

public class ReverseAString
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();

        String rev = "";
        for (char i : arr)
            rev = i + rev;

        System.out.println(rev);

    }
}
