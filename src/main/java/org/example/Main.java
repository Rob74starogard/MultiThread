package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            calculator.menuPrint();
            String choice = scanner.nextLine();
            switch (choice){
                case "1" :{
                    calculator.factrorialCalc();
                    break;
            }
                case "2" :{
                    System.out.println(choice);
                    calculator.powerCalc();
                    break;
                }
                default:{
                    System.out.println("Incorect value, exit");
                   flag = false;
                    break;
                }


            }
            /*System.out.print("Wprowadź liczbę do obliczenia silni (lub 'exit' aby wyjść): ");
            String input = scanner.nextLine();
            if ("exit".equalsIgnoreCase(input)) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                new FactorialCalculator(number).start();
            } catch (NumberFormatException e) {
                System.out.println("Proszę wprowadzić poprawną liczbę całkowitą.");
            }*/
        }
        //scanner.close();

    }
}
