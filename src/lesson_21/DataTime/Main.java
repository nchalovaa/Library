package lesson_21.DataTime;


/*Создайте класс DataTime для представления даты и времени, с полями year, month, day, hour и minute.

Переопределите метод toString() для класса DateTime так, чтобы он возвращал строку в формате "ГГГГ-ММ-ДД ЧЧ:ММ".
Создайте несколько объектов DateTime и запишите их в массив, с разными данными
Создайте ещё один объект DateTime, который будет являться целью для поиска.
Напишите код, который ищет первое совпадение объекта DateTime из пункта 3 в массиве объектов из пункта 2. Используйте метод equals() для сравнения объектов.

Выведите на экран результат поиска, показывая найденное совпадение или сообщение о его отсутствии. Обратите внимание на формат вывода.*/


public class Main {

    public static void main(String[] args) {
        DataTime dataTime1 = new DataTime(2023,1, 24, 7, 35);
        DataTime dataTime2 = new DataTime(2022,2, 20, 10, 12);
        DataTime dataTime3 = new DataTime(1995,10, 7, 15, 3);

        DataTime dataTimeGoal= new DataTime(1995,10, 7, 15, 3);

        System.out.println(dataTime1);
        System.out.println(dataTime2);
        System.out.println(dataTime3);
        System.out.println(dataTimeGoal);

        DataTime[] dataTimes = {dataTime1, dataTime2, dataTime3};

        for (int i = 0; i < dataTimes.length; i++) {
            if (dataTimes[i].equals(dataTimeGoal)) {
                System.out.println("Искомый элемент найден по индексом " + i);
            }
        }
    }
}
