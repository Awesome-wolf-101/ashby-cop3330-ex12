/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Ashby
 */

import java.util.Calendar;
import java.util.Scanner;

public class APP {


    public static void main(String[] args) {
        System.out.println("Enter the principal:");
        Scanner sc = new Scanner(System.in);
        String Principal = sc.nextLine();
        System.out.println("Enter the rate of interest: ");
        String IterestRate = sc.nextLine();
        System.out.println("Enter the number of years: ");
        String Years = sc.nextLine();


        double PrincipalDouble = Double.parseDouble(Principal);
        double IterestRateDouble = (Double.parseDouble(IterestRate)/ 100.0);
        double YearsDouble = Double.parseDouble(Years);

        double EndAmount = (PrincipalDouble * (1 + (YearsDouble * IterestRateDouble)));
        double EndAmountPenny = Math.round(EndAmount * 100.0) / 100.0;

        System.out.println("After " + Years +" years at " + IterestRate +"%, the investment will be worth $"+ EndAmountPenny +".");




    }
}
