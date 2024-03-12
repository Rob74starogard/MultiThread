package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
        saveResultToFile(number + "! (10 pierwszych cyfr) = " + resultFormatted);
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

    private static synchronized void saveResultToFile(String result) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RESULT_FILE, true))) {
            writer.write(result);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Błąd podczas zapisywania wyniku do pliku: " + e.getMessage());
        }
    }
}
