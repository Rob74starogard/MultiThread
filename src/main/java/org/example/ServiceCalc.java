package org.example;

import java.util.Scanner;

public class ServiceCalc {
    Scanner reader = new Scanner(System.in);
    public void menuPrint() {
        System.out.println("What we calculate?");
        System.out.println("1. Power of given number");
        System.out.println("2. Exponentiation ");
    }

    public void factrorialCalc() {
        System.out.println("enter a value to calculate Factional");
        String number =  reader.nextLine();
        new FactorialCalculator(Integer.parseInt(number)).start();
    }
}
