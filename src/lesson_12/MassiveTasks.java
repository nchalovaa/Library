package lesson_12;
// Напишите программу, которая удаляет из массива элемент по условиям:
//по заданной позиции.
//по значению

public class MassiveTasks {


    public static void main(String[] args) {
//        int[] source = {1, 2, 6, 9, -5};
        int[] source = new int[5];
        source[0] = 1; // так как массив стартует с нуля
        source[3] = 9;
        source[1] = 2;
        source[2] = 6;
        source[4] = -5; // длина массива - 1
//        source[5] = 2;

//        source[1] = x;

        int x = source[1]; // значение по индексу 1, это 2 элемент в массиве = 2

        printArray(source);
        deleteByPosition(source, 2);
        System.out.println();
        printArray(source);
        String[] bArr = new String[10];
        System.out.println();
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


        public static void deleteByPosition(int[] abc, int position) {// source = это имя переменной
           // abc[position] = 0;
            for (int i = 0; i < abc.length; i++) {
                if(i == position) {
                    abc[i] = 0;
                }

            }


        }






////        int[] source = {1, 2, 6, 9, -5};
//        // 1
//        int i = 0;
//        if (i < array.length) {
//            System.out.print(array[i] + " "); // i = 0, array[i] -> array[0] -> 1 (выведится число 1, т.к. i - это наш индекс и i равен 0, следовательно, мы обратимся к массиву и запросим значение, которое лежит под индексом 0 - это 1)
//            i++; // тут прибавили к текущемиу значению i еденицу, после этой строки значение i , будет равно 1
//        }
//
//        // 2
//        if (i < array.length) { // i = 1, array.length = 5 => 1 < 5 ? да
//            System.out.print(array[i] + " "); // i = 1, array[i] -> array[1] -> 2
//            i++;
//        }
//
//        // 3
//        if (i < array.length) { // i = 2, array.length = 5 => 2 < 5 ? да
//            System.out.print(array[i] + " "); // i = 2, array[i] -> array[2] -> 6
//            i++;
//        }


}
