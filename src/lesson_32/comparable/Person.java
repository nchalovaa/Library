package comparable;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        // сравнение происходит по одному из полей
        // если сравниваемый объект больше other вернуть полож число;
        // если сравниваемый объект меньше other вернуть отриц число;
        // если сравниваемый объект равен other вернуть 0;
        return this.age - other.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
