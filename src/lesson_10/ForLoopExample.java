package lesson_10;

public class ForLoopExample {
    //вывести числа от 0 до numberMax
    public static void main(String[] args) {

task1For(5);
    }
    /*public static void task1 (int numberMax) {
        int counter = 0;

        while (counter <= numberMax) {
            System.out.println(counter);
            counter++;
        }
    }*/

        public static void task1For ( int numberMax){
            for (int counter = 0; counter <= numberMax; counter++) {
                System.out.println(counter);
            }


        }

}
