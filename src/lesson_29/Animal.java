package lesson_29;

public abstract class Animal {
    private String name;
    private String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void makeSound() ;

    public abstract void canEat();

    /**
     * Выводит данные животного
     *
     * @return Выводит данные животного
     */
    public String getDetails() {
        String result = "Name: " + this.name + " color: " + this.color;
        return result;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

}
