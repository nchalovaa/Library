package lesson_10;

public class Table_multiplication {
    public static void main(String[] args) {

        task3(3);
    }

    //вывести на экран таблицу умножения на n:
    //  Если n = 3
    //    3*1=3
    //    3*2=6
    //    3*3=9
    //    3*4=12
    //    3*5=15
    //    3*6=18
    //    3*7=21
    //    3*8=24
    //    3*9=27
    //    3*10=30
    public static void task3(int a) { // a = 3
//        for (int counter = 1; counter <= 10; counter++) {
//            System.out.println(a * counter);
//        }
        for (int counter = 1; counter <= 10; counter++) {
            System.out.println("Таблица умножения для числа " + a);
            int result = a * counter;
            System.out.println(a + " * " + counter + " = " + result);
        }
    }

}
