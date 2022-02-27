package by.epam.jwd.controller;

import by.epam.jwd.calculate.CalcRenovice;
import by.epam.jwd.ouput.ShowResult;

public class Controller {
    public static void main(String[] args) {
        double data = new CalcRenovice().getResult("5+4-(2+13)/3");
        ShowResult.showResult(data);
    }
}
