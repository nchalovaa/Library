package lesson_21.DataTime;


/*Создайте класс DataTime для представления даты и времени, с полями year, month, day, hour и minute.

Переопределите метод toString() для класса DateTime так, чтобы он возвращал строку в формате "ГГГГ-ММ-ДД ЧЧ:ММ".
Создайте несколько объектов DateTime и запишите их в массив, с разными данными
Создайте ещё один объект DateTime, который будет являться целью для поиска.
Напишите код, который ищет первое совпадение объекта DateTime из пункта 3 в массиве объектов из пункта 2. Используйте метод equals() для сравнения объектов.

Выведите на экран результат поиска, показывая найденное совпадение или сообщение о его отсутствии. Обратите внимание на формат вывода.*/


import java.util.Objects;

public class DataTime {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;

    public DataTime (int year, int month,int day, int hour, int minute){
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataTime dataTime = (DataTime) o;
        return Objects.equals(year, dataTime.year) && Objects.equals(month, dataTime.month) && Objects.equals(day, dataTime.day) && Objects.equals(hour, dataTime.hour) && Objects.equals(minute, dataTime.minute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day, hour, minute);
    }

    @Override
    public String toString() {
        // ГГГГ-ММ-ДД ЧЧ:ММ
        String m = this.minute < 10 ? "0" + this.minute : "" + this.minute;
        String d = this.day < 10 ? "0" + this.day : "" +  this.day;
        return this.year + "-" + this.month +  "-" +  d + this.hour + ":" + m;
    }
}
