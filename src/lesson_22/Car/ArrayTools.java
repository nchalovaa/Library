package lesson_22.Car;

public class ArrayTools {
    public static void printArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString() + "\t");
        }
    }

    public static boolean findElement(Object target, Object[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return true;
            }
        }

        System.out.println(AppConstants.ELEMENT_NOT_FOUND_MSG);
        return false;
    }
}
