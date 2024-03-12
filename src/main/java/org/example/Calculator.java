package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    public static final String RESULT_FILE = "factorial_results.txt";
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
    public void powerCalc() {
        System.out.println("enter a value to calculate basic");
        String number =  reader.nextLine();
        System.out.println("enter a expotencial");
        String expotencial =  reader.nextLine();
        new PowerCalculator(Integer.parseInt(number),Integer.parseInt(expotencial)).start();
    }
    public static synchronized void saveResultToFile(String result) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RESULT_FILE, true))) {
            writer.write(result);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Błąd podczas zapisywania wyniku do pliku: " + e.getMessage());
        }
    }
}
