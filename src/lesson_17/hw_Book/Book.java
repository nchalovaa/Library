package lesson_17.hw_Book;

/* Задача: Необходимо разработать приложение для библиотеки, которое позволяет управлять списком книг.
Каждая книга имеет следующие характеристики: название, автор, год издания, ISBN и флаг, указывающий, взята ли книга кем-то.

Основные требования:
Создать класс Book, представляющий книгу, с полями для хранения названия, автора, года издания, ISBN и флага (boolean isBorrowed),
указывающего, взята ли книга кем-то.

Создать класс Library, представляющий библиотеку, с методами для управления списком книг.
Методы должны включать добавление книги, удаление книги, получение списка всех книг,
проверку, взята ли книга, и установку флага, что книга взята или возвращена.

Реализовать основной класс приложения LibraryApp, который создает объект библиотеки,
добавляет книги в библиотеку, проверяет статус книги (взята или нет), и устанавливает флаги, когда книги берутся или возвращаются.
Приложение должно предоставлять пользователю возможность управлять списком книг,
добавлять новые книги, узнавать статус книг и устанавливать флаги, когда книги берутся или возвращаются. */

public class Book {

    private String title;

    private String author;

    private int year;

    private boolean isBorrowed;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
