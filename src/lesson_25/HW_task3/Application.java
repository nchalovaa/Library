package lesson_25.HW_task3;

public class Application {
    public static void main(String[]args){
        String result1 = task3.reversedStrings("Easy come easy go");
        String expectedResult1 = "ysaE emoc ysae og";
        String result2 = task3.reversedStrings("Java Programming");
        String expectedResult2 = "avaJ gnimmargorP";
        String result3 = task3.reversedStrings("Hello World");
        String expectedResult3 = "olleH dlroW";

        System.out.println(result1);
        System.out.println(expectedResult1.equals(result1)); //true
        System.out.println(result2);
        System.out.println(expectedResult2.equals(result2)); //true
        System.out.println(result3);
        System.out.println(expectedResult3.equals(result3));
    }
}
