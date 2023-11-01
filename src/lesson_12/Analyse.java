package lesson_12;
// Задача 3 Частотный анализ
//Программа должна подсчитать, сколько раз каждое число встречается в массиве и вывести результат в коноль.

    // DATA: {1, 5, 1, 3, 5, 98}
    // Output
    // 1 - 2
    // 5 - 2
    // 1 - 2
    // 3 - 1
    // 5 - 2
    // 98 - 1

public class Analyse {

    public static void main(String[] args) {
        int[] source = {1, 5, 1, 3, 5, 98}; //длина массива - 6
        int arrLength = source.length; // чтобы узнать длину массива нужно обратиться к переменной, через точку. его длина 6


        // int last ElementInMassive = source[arrLength-1]; - формула показывает как высчитать послезний элемент в массиве

        for (int i = 0; i < arrLength; i++) { //обязательно нужно length, чтобы счетчик перебрал все позиции в массиве
            int currentValue = source[i]; //i=0, currentValue = 1/ i=1, currentValue = 5
            int counter = 0; // в переменную записали какое кол-во раз мы встречаемся с цифрой

            for (int j = 0; j < arrLength; j++) {
                if(currentValue == source[j]) {
                    counter++; //тоже самое, что: counter = counter + 1;
                }
            }


            System.out.println("Число  " + currentValue + " , повторяется " + counter + " раз(а) ");

        }

    }
}




