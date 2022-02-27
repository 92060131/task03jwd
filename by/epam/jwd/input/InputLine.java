package by.epam.jwd.input;

import java.util.Scanner;

public  class InputLine {
    private static String input;
    public static String InputData() {
        @SuppressWarnings("inputLine")
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();
        return input;
    }
    public static String InputData(String input) {
        return input;
    }
}
