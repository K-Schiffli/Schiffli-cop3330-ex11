/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package Base;


import java.util.Scanner;
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args )
    {
        String euros = getEuros();
        String rate = getRate();
        double eurosNum = stringToDouble(euros);
        double rateNum = stringToDouble(rate);
        double dollars = calcDollars(eurosNum, rateNum);
        printOutput(dollars);
    }
    public static String getEuros()
    {
        System.out.print( "How many euros are you exchanging? ");
        return in.nextLine();
    }

    public static String getRate()
    {
        System.out.print( "What is the exchange rate? ");
        return in.nextLine();
    }

    public static double stringToDouble(String number)
    {
        return Double.parseDouble(number);
    }

    public static double calcDollars(double eurosNum, double rateNum)
    {
        double dollars = eurosNum * rateNum;
        dollars *= 100;
        dollars = Math.ceil(dollars);
        return dollars /= 100;
    }

    public static void printOutput (double dollars)
    {
        System.out.printf( "%.2f U.S. dollars.", dollars );
    }
}
