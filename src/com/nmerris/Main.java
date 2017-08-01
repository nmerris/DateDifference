package com.nmerris;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Date date1 = new Date();
        Date date2 = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");
        int diffInDays;

        System.out.print("Enter first date (MM/DD/YY): ");
        try {
            date1 = dateFormat.parse(scanner.nextLine());
        } catch (ParseException e) {
            printDateError();
        }

        System.out.print("Enter second date (MM/DD/YY): ");
        try {
            date2 = dateFormat.parse(scanner.nextLine());
        } catch (ParseException e) {
            printDateError();
        }

        // * 1000 to convert to seconds
        // * 60 to convert to minutes
        // * 60 to convert to hours
        // * 24 to convert to days
        // absolute value in case user entered later date first
        diffInDays = (int) (Math.abs((date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24)));

        System.out.printf("Difference: %d day(s)", diffInDays);

    }


    private static void printDateError() {
        System.out.println("Please enter a date in MM/DD/YY format");
        System.out.println("For example, July 4th, 1976 would be: 07/04/76");
    }



}
