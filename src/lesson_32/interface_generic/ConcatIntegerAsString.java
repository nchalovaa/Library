package interface_generic;

public class ConcatIntegerAsString implements ICalculator<Integer, String> {
    @Override
    public String add(Integer value1, Integer value2) {
        return String.valueOf(value1 + value2);
    }
}
