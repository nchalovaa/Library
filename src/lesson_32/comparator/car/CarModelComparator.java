package comparator.car;

import comparator.Car;

import java.util.Comparator;

public class CarModelComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        String model01 = o1.getModel();
        String model02 = o2.getModel();
        return model01.compareTo(model02);
    }
}
