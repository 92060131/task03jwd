package by.epam.jwd.instruction;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class RegexExplicity {
    static final String INVALID_ORDER_WITH_BRACKETS = "[\\(][\\)|\\+|\\-|\\*|\\/]|[\\)][\\(]|[\\d]]|[0-9][\\(]|[\\(][\\d+][\\)]|[\\+|\\-|\\*|\\/][\\)]";
    static final String INVALID_START_LINE = "^[\\+|\\-|\\*|\\/\\)]";
    static final String INVALID_ORDER_OPERATORS = "[\\+|\\-|\\*|\\/]{2,}";
    static final String INVALID_END_LINE = "[\\+|\\-|\\*|\\/\\(]$";
    static final String INVALID_INPUT = "[0-9\\/\\*\\+\\-\\(\\)]+";
    static final Pattern PATTERN_1;
    static final Pattern PATTERN_2;
    static final Pattern PATTERN_3;
    static final Pattern PATTERN_4;
    static {
        PATTERN_1 = Pattern.compile(INVALID_ORDER_OPERATORS);
        PATTERN_2 = Pattern.compile(INVALID_ORDER_WITH_BRACKETS);
        PATTERN_3 = Pattern.compile(INVALID_START_LINE);
        PATTERN_4 = Pattern.compile(INVALID_END_LINE);
    }
    public static List<Pattern> getArrayListPattern() {
        List<Pattern> pattern = new ArrayList();
        pattern.add(PATTERN_1);
        pattern.add(PATTERN_2);
        pattern.add(PATTERN_3);
        pattern.add(PATTERN_4);
        return pattern;
    }

}
