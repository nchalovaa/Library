package lesson_12;

/* Задача 2 Удаление элемента
Напишите программу, которая удаляет из массива элемент по условиям:

по заданной позиции.
по значению*/
public class Delete_element {
    public static void main(String[] args) {

        int[] mas = {1, 2, 3}; //создали массив из 3 ячеек (эллементов)
        int position = 1;
        int value = 3;
        printArray(mas);
        System.out.println();
        deleteByPosition(mas, position);
        printArray(mas);
        System.out.println();
        deleteByValue(mas, value);
        printArray1(mas);

    }

    public static void deleteByPosition(int[] mas, int position) { //метод удаления по позиции
        if (position > 0 || position <= mas.length) {
            mas[position] = 0;
        } else {
            System.out.println("Ошибка! Недопустимое значение.");
        }

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t"); // i= 0, i = 1, i = 3
        }
    }

    public static void deleteByValue(int[] mas, int value) { // метод удаления по значению
//        int i = 0;

        for (int i = 0; i < mas.length; i++) {
            int element = mas[i];
            if (element == value) {
                mas[i] = 0;
            }
        }


//        int element1 = mas[i]; // mas[0]
//        i++;
//        if (element1 == value) {
//            mas[i] = 0;
//        }
//
//        int element2 = mas[i]; // mas[1]
//        i++;
//        if (element2 == value) {
//            mas[i] = 0;
//        }
//
//        int element3 = mas[i];  // mas[2]
//        i++;
//        if (element3 == value) {
//            mas[i] = 0;
//        }
    }
    public static void printArray1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t"); // i= 0, i = 1, i = 3
        }
    }
}


