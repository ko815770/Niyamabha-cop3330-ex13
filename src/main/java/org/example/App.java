
package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class App {
    public static void main(String[] args) {
        int year, compound;
        double principle, rate, total;
        System.out.println("What is the principle amount?");
        Scanner input = new Scanner(System.in);
        principle = input.nextDouble();
        System.out.println("What is the rate?");
        rate = input.nextDouble();
        System.out.println("What is the number of years");
        year = input.nextInt();
        System.out.println("What is the number of times the interest is compounded per year?");
        compound = input.nextInt();
        total = principle * Math.pow(1 + (rate * 0.01)/compound,compound * year);
        System.out.println(principle + " invested at " + rate + "% for " + year + " years compounded " + compound + " times per year is $" + String.format("%.2f", total));
    }
}
