package lesson_16;


/* Создание класса "Книга"

Создайте класс с именем "Книга" (Book) с приватными полями:

title (название книги, строковое значение)
author (автор книги, строковое значение)
year (год выпуска книги, целочисленное значение)
isbn (ISBN книги, строковое значение)
Добавьте конструктор класса, который принимает параметры для всех полей и инициализирует объект при его создании.

Создайте геттеры и сеттеры для каждого поля класса "Книга".

В методе main создайте несколько объектов класса "Книга" и инициализируйте их с помощью конструктора и сеттеров.
Затем используйте геттеры для получения информации о каждой книге и выведите ее в консоль.

Попробуйте изменить значения полей объектов с использованием сеттеров и выведите обновленную информацию в консоль. */

public class hw_book { // класс описывающий юзера, шаблон юзера

    // поля класса
    // поля класса
    private String title;  // название книги
    private String author; // автор книги
    private int year;    // год выпуска книги
    private String ISBN; // ISBN книги


    //конструктор
    public hw_book(String title, String author, int year, String ISBN) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.ISBN = ISBN;

    }

    // геттер для поля title
    public String getTitle() {
        return this.title;
    }

    // сеттер для поля title
    public void setTitle(String title) {
        this.title = title;
    }

    // геттер для поля author
    public String getAuthor() {
        return this.author;
    }

    // сеттер для поля author
    public void setAuthor(String author) {
        this.author = author;
    }

    // геттер для поля year
    public int getYear() {
        return this.year;
    }

    // сеттер для поля year
    public void setYear(int year) {
        this.year = year;
    }

    // геттер для поля ISBN
    public String getISBN() {
        return this.ISBN;
    }

    // сеттер для поля ISBN
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void printHwBook() {
        System.out.println(" Книга называется " + this.title + " , автор " + this.author + " , год выпуска " + this.year + "ISBN " + this.ISBN);
    }
}