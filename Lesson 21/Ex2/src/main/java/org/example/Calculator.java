package org.example;

public class Calculator {
    private final CalculatorEngine engine;

    public Calculator(CalculatorEngine engine) {
        this.engine = engine;
    }

    public String divide(int a, int b) {
        try {
            int result = engine.divide(a, b);
            return String.format("Division of %d by %d = %d", a, b, result);
        } catch (ArithmeticException ex) {
            return "Division by zero is prohibited";
        }
    }
}
