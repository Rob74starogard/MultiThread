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
            switch (choice) {
                case "1": {
                    calculator.factrorialCalc();
                    break;
                }
                case "2": {
                    calculator.powerCalc();
                    break;
                }
                default: {
                    System.out.println("Incorrect value, exit");
                    flag = false;
                    scanner.close();
                    break;
                }


            }
        }
    }
}
