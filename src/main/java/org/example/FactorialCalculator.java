package org.example;

import java.math.BigInteger;

public class FactorialCalculator extends Thread {
    private int number;
    private static final String RESULT_FILE = "factorial_results.txt";

    public FactorialCalculator(int number) {
        this.number = number;
    }



    @Override
    public void run() {
        System.out.println("Obliczanie " + number + "! w tle...");
        BigInteger factorial = calculateFactorial(number);
        String resultFormatted = formatResult(factorial);
        System.out.println(number + "! (10 pierwszych cyfr) = " + resultFormatted);
        Calculator calculator = new Calculator();
        calculator.saveResultToFile(number + "! (10 pierwszych cyfr) = " + resultFormatted);
    }


    private BigInteger calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }



    private String formatResult(BigInteger result) {
        String resultStr = result.toString();
        if (resultStr.length() > 10) {
            return resultStr.substring(0, 10);
        } else {
            return resultStr;
        }
    }
}
