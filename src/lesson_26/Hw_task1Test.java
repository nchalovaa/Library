package lesson_26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Hw_task1Test {

    @Test

    public void test_countLetters_validString_lettersCounted(    ){
        //Дано текст
        String text = "Qwertyuiop"; //10 символов
        // Когда

        int result = Hw_task1.countLetters(text); //равно  Hw_task1.countLetters(text); //9
        //Тогда
        Assertions.assertEquals(10, result);
    }

    @Test
    public void test_countLetters_validStringWithSymbols_lettersCounted(){
        //Дано текст
        String text = "Zxc%vBпЧ *& 90"; //7 букв
        //Когда
        int result = Hw_task1.countLetters(text);
        //Тогда
        Assertions.assertEquals(7, result);
    }

    @Test
    public void test_countChars_validStringWithSymbols_symbolsCounted(){
        //Дано текст
        String text = "Zxc%vBпЧ *& 90"; // 14
        //Когда
        int result = Hw_task1.countChars(text);
        // Тогда
        Assertions.assertEquals(14, result);
    }
}
