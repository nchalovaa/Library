package comparator;

public class Car {
    private final int id;
    private final String model;
    private final int power;

    public Car(int id, String model, int power) {
        this.id = id;
        this.model = model;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", power=" + power +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }
}