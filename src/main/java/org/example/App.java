/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Brendon Murphy
 */
package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        //input
        Scanner input = new Scanner(System.in);

        System.out.println("How many euros are you exchanging?");
        double numEuros = input.nextDouble();
        System.out.println("What is the exchange rate for euros to U.S. dollars?");
        double exchangeRate = input.nextDouble();

        //conversion
        double numDollars = numEuros * exchangeRate;

        //output
        System.out.println(String.format("%.2f euros at an exchange rate of %f is %.2f U.S. dollars.", numEuros, exchangeRate, numDollars));

    }
}
