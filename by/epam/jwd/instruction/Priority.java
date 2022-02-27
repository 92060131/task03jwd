package by.epam.jwd.instruction;

import java.util.HashMap;
import java.util.Map;

public class Priority {
    private static Integer priority;
    private static Map<String, Integer> priorities;
    static {
        priorities = new HashMap();
        priorities.put("+", 1);
        priorities.put("-", 1);
        priorities.put("*", 2);
        priorities.put("/", 2);
    }
    public static Integer getPriority(String operator) {
        if (priorities.containsKey(operator)) {
            priority = priorities.get(operator);
            return priority;
        }
        else{
            throw new RuntimeException("Check please priority.");
        }

    }
}
