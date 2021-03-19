package com.mycompany.sololearn;

import java.util.Scanner;

/* Loan Calculator */

public class LoanCalculator
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        for (int i = 0; i <= 5; i++){
            amount = (int)amount - (int)Math.ceil(0.1 * amount);
        }

        System.out.println(amount);

    }
}
