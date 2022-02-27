package by.epam.jwd.instruction;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parsing {
    private final static Pattern pattern;
    private final static String delim = "\\d+|\\+|\\-|\\*|\\/|\\(|\\)";
    static {
        pattern = Pattern.compile(delim);
    }
    public static List<String> parserElements(String input) {
        input = Validation.equalCountBrackets(input);
        Matcher matcher = pattern.matcher(input);
        List<String> array = new ArrayList();
        for(int i = 0; matcher.find(); ++i) {
            array.add(i, matcher.group());
        }
        return array;
    }
}
