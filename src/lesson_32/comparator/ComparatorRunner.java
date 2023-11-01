package comparator;

import comparator.car.CarIDComparator;
import comparator.car.CarModelComparator;
import comparator.car.CarPowerComparator;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorRunner {
    public static void main(String[] args) {

        Car[] cars = {
                new Car(4, "model2", 324),
                new Car(3, "model5", 542),
                new Car(1, "model1", 123),
                new Car(5, "model3", 434),
                new Car(2, "model4", 223),
        };

        Comparator<Car> carComparator = new CarIDComparator();


        Arrays.sort(cars, carComparator);
        System.out.println("Sort car array by ID");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);

        }
        System.out.println();

        Arrays.sort(cars, new CarPowerComparator());
        System.out.println("Sort car array by Power");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);

        }
        System.out.println();

        Arrays.sort(cars, new CarModelComparator());
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);

        }
        System.out.println();

    }
}
