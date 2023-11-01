package lesson_16;

public class Car {


    // поля класса
    private String make;
    private String color;
    private double power;
    private String fuelType;


    //конструктор
    public Car(String make, String color, double power, String fuelType) {
        this.make = make;
        this.color = color;
        this.power = power;
        this.fuelType = fuelType;
    }

    // метод который приводит нашу машину (объект) в движение
    public void drive() {
        System.out.println("I am " + this.make + " and i drive now");
    }

    // метод который отсанавливет нашу машину (объект)
    public void stop() {
        System.out.println("I am " + this.make + "  and i stopped");
    }

}
