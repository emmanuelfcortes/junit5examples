package dio.testjunit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

public class AssertsTest {
    @Test
    public void assertArrayEqualsTest(){
        String[] array1 = {"This is a array"};
        String[] array2 = {"This is a array"};
        assertArrayEquals(array1, array2,"assertArrayEquals OK!");
    }
    
    @Test
    public void assertEqualsStringTest(){
        String str1 = "This is a string test";
        String str2 = "This is a string test";
        assertEquals(str1,str2);
    }

    @Test
    public void assertFalseTest(){
        String str1 = "This is a string test";
        String str2 = "This is a string test2";
        assertFalse(str1==str2,"assertFalseTest fail");
    }

    @Test
    public void assertNullTest(){
        String str1 = null;
        assertNull(str1,"assertNull fail");
    }
    @Test
    public void assertNotNullTest(){
        String str1 = "This is not null";
        assertNotNull(str1,"assertNotNull fail");
    }

    @Test
    public void assertNotSameTest(){
        String str1 = "This is str1";
        String str2 = "This is str2, different";
        assertNotSame(str1,str2,"assertNotSame fail");
    }

    @Test
    public void assertSameTest(){
        String str1 = "This is a str";
        String str2 = "This is a str";
        assertSame(str1,str2,"assertSame fail");
    }
}
