package lesson_12;


/* Задача 1 "Оценки"
Создайте массив из 5 элементов для хранения оценок студента.
Заполните массив оценками и вычислите средний балл студента.

используйте Scanner для заполнения массива.*/

import java.util.Scanner;

public class Score_task1 {
        public static void main(String[]args){
            int[] masScore = new int [5]; //создали массив из 5 ячеек (эллементов)
            Scanner scanner = new Scanner(System.in); // создали для заполнения массива
            for (int i = 0; i < 5; i++) {
                System.out.println("Введите оценку студента  " + (i+1) );
                masScore[i] = scanner.nextInt();

            }
            double sumScore = 0;
            for (int i = 0; i < masScore.length; i++) {
                sumScore += masScore[i];
            }

            double averageScore = sumScore/masScore.length;
            System.out.println("Средняя оценка студента " + averageScore);
        }
    }

