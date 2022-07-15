package org.example;

public class Main {
    public static void main(String[] args) {
        CalculatorEngine engine = new CalculatorEngine();
        Calculator calculator = new Calculator(engine);


        System.out.println(calculator.divide(0, 1));
    }
}
