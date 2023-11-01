package lesson_27;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordEncoderDecoderTest {

    public void testDecoderPasswordPasswordDecoded(){

    }
    @Test
    public void test_DecoderPassword_PasswordDecoded(){
        // Дано
        String password = "QWERTZ123";

        // Когда
        String encodedPassword = PasswordEncoderDecoder.encodePassword(password);
        String decodedPassword = PasswordEncoderDecoder.decodePassword(encodedPassword);

        // тогда

        Assertions.assertNotNull(encodedPassword);
        Assertions.assertNotEquals(password, encodedPassword);
        Assertions.assertEquals(password.length() +6, encodedPassword.length());
        Assertions.assertEquals(password, decodedPassword);
    }

    @Test
    public void test_encodePassword_encodedPassword(){
String password = "qWerty123456";

        //Когда
       String encodedPassword =  PasswordEncoderDecoder.encodePassword(password);

       //Тогда
        Assertions.assertNotNull(encodedPassword);
        Assertions.assertNotEquals(password, encodedPassword);
        Assertions.assertEquals(password.length() +6, encodedPassword.length());

    }
}
