package lesson_25.HW_task3;


/*Реализуйте метод, который принимает строку и возвращает новую строку, в которой все слова перевернуты, но порядок слов остается прежним.
Пример 1: Дана строка "Hello World", Результат: "olleH dlroW"

Пример 2: Дана строка "Java Programming", Результат: "avaJ gnimmargorP"

Пример 3: Дана строка "Easy come easy go", Результат: "ysaE emoc ysae og"*/


public class task3 {
    public static String reversedStrings(String value) {
        // Easy come easy go
        // ysaE emoc ysae og
        String[] words = value.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = reverseString(word);
            result = result + reversedWord + " ";

        }

        return result.trim();
    }

    private static String reverseString(final String text){
        //Easy
        //ysaE
        String result = "";
        for (int i = text.length()-1; i>=0; i--) {
            result += text.charAt(i);
        }
        return result;
    }

   /* public static String ReversedStrings2 (String value){
        // Java Programming
        // avaJ gnimmargorP
        String [] words = value.split ("  ");
        String result = "  ";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = reverseString(word);
            result = result + reversedWord;
        }
        return result.trim(); //trim - метод, котрый удаляет пробелы с начала и конца строки
    }
*/
}
