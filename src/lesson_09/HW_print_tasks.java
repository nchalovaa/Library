package lesson_09;

public class HW_print_tasks {

    /* Распечатать 10 строк: “Task1”. “Task2”. … “Task10”. Используем цикл while*/

    public static void main(String [] args) {

        int counter = 1;

        while(counter <= 100) {
            System.out.println("Task" + counter);
           // counter = counter + 1; при первой итерации counter = 1, при второй итерации counter = 2.
            counter += 1;
        }
    }
}
