package lesson_25;

public class CharTasks {
    //    public static boolean hasUpperCaseLetter(String value) {
//        for (int i = 0; i < value.length(); i++) {
//            char currentChar = value.charAt(i);
//            if (currentChar >= 'A' && currentChar <= 'Z') {
//                return true;
//            }
//        }
//        return false;
//    }

    public static boolean hasUpperCaseLetter(String value) {
        for (int i = 0; i < value.length(); i++) {
            char currentChar = value.charAt(i);
            if (currentChar >= 65 && currentChar <= 93) {
                return true;
            }
        }
        return false;
    }
}
