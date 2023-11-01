package lesson_09;


/*С помощью цикла while написать программу,
выводящую на экран куб числа от 1 до заданного числа n

  Пример:для числа n=3

        1 в кубе 1
        2 в кубе 8
        3 в кубе 27*/

import org.w3c.dom.css.Counter;

public class HW_Cube_while {
    public static void main(String []args) {
        System.out.println("START");
        int counter = 2; // Возводимое в степень число
        int result = counter*counter*counter; // Результат возведения в степень
        int power = 10; // Начальный показатель степени

        while (power <= 10) {
            result = result*counter;
            System.out.println(counter + "в степени " + power + "=" + result);

        }
        System.out.println("END");
    }

}
