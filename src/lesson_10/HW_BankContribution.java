package lesson_10;

public class HW_BankContribution {

    /* За каждый месяц банк начисляет к сумме вклада 12% от суммы.
     Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев.
     А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.

Для вычисления суммы с учетом процентов используйте цикл for.

Пусть сумма вклада будет представлять тип float. Пример работы программы:

Введите сумму вклада: 100
Введите срок вклада в месяцах: 1
После 1 месяцев сумма вклада составит 112.000000 */


    public static void main(String[] args) {
        double contribution = 100;
        int percentage = 12;
        bank(10,100, 12);

    }

    public static void bank (int NumberMonth, double contribution, int percentage) {
        for (int i = 1; i <= NumberMonth; i++) {
           double result =  (contribution * percentage/100);
           contribution += result;
            System.out.println("Через " + i + " месяц " + " процент по вкладу будет " + contribution);
        }
    }

}
/* 100 + 12 = 112
112 + (112 * 0.12) = 125.44

contribution + (contribution * percentage/100)
 */