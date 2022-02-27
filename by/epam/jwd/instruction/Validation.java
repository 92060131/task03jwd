package by.epam.jwd.instruction;

import by.epam.jwd.input.InputLine;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.epam.jwd.instruction.RegexExplicity.INVALID_INPUT;
import static by.epam.jwd.instruction.RegexExplicity.getArrayListPattern;

public class Validation {
    public static String validOurElements(String input) {
        input = InputLine.InputData(input);
        if (!input.matches(INVALID_INPUT)) {
            throw new RuntimeException("Check '(',')','+','-','*','/'. Check");
        }
        return input;
    }
    public static String getValidOrder(String input) {
        input = validOurElements(input);
        List<Pattern> patterns = getArrayListPattern();
        Matcher matcher;
        int i;
        for (i = 0; i < patterns.size(); i++) {
            matcher = patterns.get(i).matcher(input);
            if (matcher.find()) {
                throw new RuntimeException("Invalid order.");
            }
        }
        return input;
    }

    public static int countBrackets(char element, String input) {
        int count = 0;
        for(int i = 0; i < input.toCharArray().length; i++) {
            if (input.charAt(i) == element) {
                ++count;
            }
        }
        return count;
    }

    public static String equalCountBrackets(String input) {
        input = getValidOrder(input);
        int count1 = countBrackets('(', input);
        int count2 = countBrackets(')', input);
        if (count1 != count2) {
            throw new RuntimeException("Number of Brackets not equal");
        }
        return input;
    }
}
