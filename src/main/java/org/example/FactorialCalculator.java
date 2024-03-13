package org.example;

import java.math.BigInteger;

public class FactorialCalculator extends Thread {
    private int number;

    public FactorialCalculator(int number) {
        this.number = number;
    }


    @Override
    public void run() {
        Calculator calculator = new Calculator();
        System.out.println("Obliczanie " + number + "! w tle...");
        BigInteger factorial = calculateFactorial(number);
        String resultFormatted = calculator.formatResult(factorial);
        System.out.println(number + "! (10 pierwszych cyfr) = " + resultFormatted);
        calculator.saveResultToFile(number + "! (10 pierwszych cyfr) = " + resultFormatted + " Wątek Id:" + threadId());
    }


    private BigInteger calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
