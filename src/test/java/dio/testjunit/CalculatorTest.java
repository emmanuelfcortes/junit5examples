package dio.testjunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;


public class CalculatorTest {
    Calculator calculator = new Calculator();
    
    @Test
    public void somaTest(){
        Integer soma = calculator.soma("2+3");
        assertEquals(5, soma);
        soma = calculator.soma("0 + 0");
        assertEquals(0, soma);
        
    }
    @Test
    public void calculatorMock(){
        /**It's a example using Mock. */
        Calculator calculator2 = mock(Calculator.class);
        when(calculator2.soma("1+2")).thenReturn(4);
        assertEquals(4, calculator2.soma("1+2"));
    }
        

}
