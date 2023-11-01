package interface_generic;

public class ConcatString implements ICalculator<String, String> {
    @Override
    public String add(String value1, String value2) {
        return value1 + value2;
    }
}
