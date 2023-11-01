package interface_generic;

public class GenericExample {
    public static void main(String[] args) {
        ICalculator<String, String> concatString = new ConcatString();
        System.out.println(concatString.add("Hello", "World"));

        ICalculator<Double, Integer> doubleIntegerICalculator = new DoubleCalculator();
        System.out.println(doubleIntegerICalculator.add(111.11, 999.99));

        ICalculator<Integer, String> integerStringICalculator = new ConcatIntegerAsString();
        System.out.println(integerStringICalculator.add(1, 2));

    }
}
