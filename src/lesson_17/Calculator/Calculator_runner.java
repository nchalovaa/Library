package lesson_17.Calculator;

import lesson_17.Calculator.Calculator;

public class Calculator_runner {
    public static void main(String[] args) {
        Calculator paramPamPamCalculator = new Calculator(); // создание нового объекта на основе шаблона Calculator

        int aInt = 10;
        int bInt = 5;
        int result = paramPamPamCalculator.addNumbers(aInt, bInt); // вызов метода класса Calculator
        System.out.println(result); // 15

        long aLong = 1000L;
        long bLong = 1000L;
        result = paramPamPamCalculator.addNumbers(aLong, bLong);
        System.out.println(result);

        paramPamPamCalculator.addNumbers(aInt, bLong); // int , long

        double aDouble = 10.0;
        double bDouble = 12.0;

        paramPamPamCalculator.addNumbers(aDouble, bDouble);
        paramPamPamCalculator.addNumbers(aInt, bInt);
    }
}
