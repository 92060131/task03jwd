package by.epam.jwd.calculate;

import by.epam.jwd.instruction.Parsing;
import by.epam.jwd.instruction.Priority;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class CalcRenovice extends  CalculatorDigit{
    private final Stack<Double> numbers = new Stack<>();
    private final Stack<String> operators = new Stack<>();
    public double getResult(String input) {
        List<String> array;
        array = Parsing.parserElements(input);
        for(int i = 0; i < array.size(); ++i) {
            String element = array.get(i);
            try {
                double number = Double.parseDouble(element);
                numbers.push(number);
            } catch (NumberFormatException e) {
                if (element.equals("(")) {
                    operators.push(element);
                } else if (element.equals(")")) {
                    while (!operators.peek().equals("("))
                        calc();
                    operators.pop();
                } else {
                    if (operators.empty()) {
                        operators.push(element);
                    } else {
                        Integer priority = Priority.getPriority(element);
                        while(!operators.empty() && !(operators.peek()).equals("(") && !(operators.peek()).equals(")") && priority <= Priority.getPriority(operators.peek())) {
                            calc();
                        }
                        operators.push(element);
                    }
                }
            }
        }
        while(!operators.empty()) {
            calc();
        }
        return numbers.pop();
    }

    public void calc() {
        String operator = operators.pop();
        Double b = numbers.pop();
        Double a = numbers.pop();
        Double result = null;
        switch(operator) {
            case "+":
                result = addition(a, b);
                break;
            case "-":
                result = subtraction(a, b);
                break;
            case "*":
                result = multiplication(a, b);
                break;
            case "/":
                result = division(a, b);
        }
        numbers.push(result);
    }
}
