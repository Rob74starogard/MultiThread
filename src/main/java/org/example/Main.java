package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Wprowadź liczbę do obliczenia silni (lub 'exit' aby wyjść): ");
            String input = scanner.nextLine();
            if ("exit".equalsIgnoreCase(input)) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                new FactorialCalculator(number).start();
            } catch (NumberFormatException e) {
                System.out.println("Proszę wprowadzić poprawną liczbę całkowitą.");
            }
        }
        scanner.close();

    }
}
