package lesson_21.HW_Car;

/* Создайте класс Car с полями make, model, year, и vin (идентификационный номер автомобиля).
   Переопределите методы equals(), hashCode() и toString() для этого класса.
   Затем создайте несколько объектов класса Car и проверьте, как работают переопределенные методы.

   Создайте несколько объектов класса Car с разными параметрами
   Сравните объекты с использованием метода*/

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", "TT", 2008, "100_200");
        Car car2 = new Car("Mercedes", "Benz", 2021, "100_4004");
        Car car3 = new Car("Mercedes", "Benz", 2023, "100_4005");

        System.out.println(car1.equals(car2));
        System.out.println(car2.equals(car1));

        System.out.println(car3.equals(car1));
        System.out.println(car3.equals(car2));
    }

}