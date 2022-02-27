package by.epam.jwd.calculate;

import by.epam.jwd.source.Calculator;

public class CalculatorDigit implements Calculator {

    @Override
    public double addition(double a, double b) {
        return a+b;
    }
    @Override
    public double subtraction(double a, double b) {
        return a-b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a*b;
    }

    @Override
    public double division(double a, double b) {
        if (b == 0D) {
            throw new IllegalArgumentException("Division by zero!!!!");}
        else {
            return a / b;
         }
    }
}
