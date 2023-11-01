package lesson_10;

public class Positive_integer {
    public static void main(String[] args) {
        task4(5);
    }

        //Напишите программу, где пользователь вводит любое целое положительное число.
        //А программа суммирует все числа от 1 до введенного пользователем числа.
        //Например:
        //если пользователь введет число 3. Программа должна посчитать сумму чисел от 1 до 3, то есть 1+2+3 и выдать ответ 6.
        //если пользователь введет число 5. Программа должна посчитать сумму чисел от 1 до 5, то есть 1+2+3+4+5 и выдать ответ 15.
        public static void task4(int numberMax) { //  numberMax - до введенного пользователем числа = 3
            int result = 0;

            // counter = 1, numberMax = 3
            // 1 <= 3 - true
            // 1 + 0 = 1; (result = counter + result )

            // counter = 2, numberMax = 3
            // 2 <= 3 - true
            // 2 + 1 = 3; (result = counter + result )

            // counter = 3, numberMax = 3
            // 3 <= 3 - true
            // 3 + 3 = 6; (result = counter + result )

            // counter = 4, numberMax = 3
            // 4 <= 3 - false
            // выход

            for (int counter = 1; counter <= numberMax; counter++) {
                System.out.println("Итерация: " + counter);
                System.out.println("Результат до вычисления: " + result);
                result += counter;
                System.out.println("Результат после вычисления: " + result);
            }
            System.out.println("Общий результат вычисления: " + result);
        }

    }

