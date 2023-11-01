package lesson_36.tools;


/**
 * @author Andrej Reutow
 * created on 24.10.2023
 */
public class ArrayTools {

    private ArrayTools() {
    }

    public static <T> void print(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static <T> T search(T[] source, T value) {
        for (int i = 0; i < source.length; i++) {
            if (value.equals(source[i])) {
                return source[i];
            }
        }
        return null;
    }

    public static <T extends Id> T searchById(T[] source, long id) {
        for (int i = 0; i < source.length; i++) {
            if (id == source[i].getId()) {
                return source[i];
            }
        }
        return null;
    }

    public static <T> boolean remove(T[] source, T value) {
        for (int i = 0; i < source.length; i++) {
            if (value.equals(source[i])) {
                source[i] = null;
                return true;
            }
        }
        return false;
    }

    public static <T  extends Id> boolean removeById(T[] source, long id) {
        for (int i = 0; i < source.length; i++) {
            if (id == source[i].getId()) {
                source[i] = null;
                return true;
            }
        }
        return false;
    }
}
