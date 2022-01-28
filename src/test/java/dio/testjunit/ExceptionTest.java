package dio.testjunit;
import static org.junit.jupiter.api.Assertions.assertThrows;


import org.junit.jupiter.api.Test;

public class ExceptionTest {
    @Test
    public void NullPointerExceptionTest(){
        /**Expecting a NullPointerException */
        assertThrows(NullPointerException.class, () -> {
            String[] str = null;
            System.out.println(str[1]);
        }, "Expected NullPointerException");
    }

    @Test
    public void NumberFormatExceptionTest(){
        /**Expecting a NumberFormatException */
        assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("one");
        }, "Expected NumberFormatException");
    }

    @Test
    public void IndexOutOfBoundsExceptionTest(){
        /**Expecting a IndexOutOfBoundsException */
        assertThrows(IndexOutOfBoundsException.class, () -> {
            String[] str2 = {"0","1"};
            System.out.println(str2[2]);
        }, "Expected IndexOutOfBoundsException");
    }
}
