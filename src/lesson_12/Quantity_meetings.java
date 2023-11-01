package lesson_12;

//Задача 4 Число встреч
//Пользователь вводит два числа: длину массива и число X.
// Программа заполняет массив случайными числами (число X может не оказаться в масиве).
// Задача — найти, сколько раз число X встречается в массиве.

// massive {1,2,3,4,5,4,3,2,1} - длина массива 0 - 8
// outcome:
// print 9, 7 - использовать сканнер
// result "число 7 встречается 0 раз"
// print 9,4 - использовать сканнер
// result " число 4 встречается 2 раза"

import java.util.Scanner;

 public class Quantity_meetings {


     public static void main(String[] args) {
         int[] source = {1, 2, 3, 4, 5, 4, 3, 2, 1}; // длина массива 9
         int arrLength = source.length; // переменнная для того, чтобы узнать длину массива
         int counter = 0; // по умолчанпию равен "0", так как числа может не оказаться в массиве



         Scanner scanner = new Scanner(System.in);
         System.out.println("Введите число");
         int x = scanner.nextInt(); //сканнер ввиде ручки на листочке

         for (int i = 0; i < arrLength; i++) { //указываем диапазон который будем перебирать каунтером позже
             int currentValue = source[i]; //i=0, currentValue = 1/ i=1, currentValue = 2

             if (currentValue == x) {
                 counter++; //тоже самое, что: counter = counter + 1;
             }

         }
         System.out.println("Число " + x + " повторяется " + counter + " раз");
     }
 }