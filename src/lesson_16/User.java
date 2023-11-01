package lesson_16;

public class User {   // класс описывающий юзера, шаблон юзера

    // поля класса
    // поля класса
    private String name;  // имя юзера
    private int age; // возраст юзера
    private String email;    // почта юзера


    //конструктор
    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;

    }

    // геттер для поля имя
    public String getName() {
        return this.name;
    }

    // сеттер для поля имя
    public void setName(String name) {
        this.name = name;
    }

    // геттер для поля возраст
    public int getAge() {
        return this.age;
    }

    // сеттер для поля возраст
    public void setAge(int age) {
        this.age = age;
    }

    // геттер для поля email
    public String getEmail() {
        return this.email;
    }

    // сеттер для поля email
    public void setEmail(String email) {
        this.email = email;
    }

    public void printUser() {
        System.out.println("Меня зовут " + this.name + ", мне " + this.age + " , мой email  " + this.email);
    }

}

