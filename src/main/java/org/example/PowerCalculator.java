package org.example;

public class PowerCalculator extends Thread {
    private float base;
    private float expotetntial;

    public PowerCalculator(float base, float expotencial) {
        this.base = base;
        this.expotetntial = expotencial;
    }

    private double calculatePower(float base, float expotencial) {
        float result = (float) Math.pow(base, expotencial);
        return result;
    }

    @Override
    public void run() {
        Calculator calculator = new Calculator();
        System.out.println("Obliczanie " + base + " potęgi" + expotetntial + " w tle...");
        float result = (float) calculatePower(base, expotetntial);
        String resultFormatted = calculator.formatResult(result);
        calculator.saveResultToFile(base + " do potegi "+ expotetntial +" wynosi "+ resultFormatted);
    }
}
