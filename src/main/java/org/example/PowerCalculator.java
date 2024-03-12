package org.example;

public class PowerCalculator extends Thread {
    private double base;
    private double expotetntial;

    public PowerCalculator(double base, double expotencial) {
        this.base = base;
        this.expotetntial = expotencial;
    }

    private double calculatePower(double base, double expotencial) {
        double result = Math.pow(base, expotencial);
        return result;
    }

    @Override
    public void run() {
        Calculator calculator = new Calculator();
        System.out.println("Obliczanie " + base + " potęgi" + expotetntial + " w tle...");
        double result = calculatePower(base, expotetntial);
        //String resultFormatted = formatResult(power);
        //System.out.println(number + "! (10 pierwszych cyfr) = " + resultFormatted);
        calculator.saveResultToFile(base + " do potegi "+ expotetntial +"wynosi"+ result);
    }
}
