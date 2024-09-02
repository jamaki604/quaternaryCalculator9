package src.test;

import src.main.logic.QuaternaryOperations;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuaternaryOperationsTest {

    QuaternaryOperations operations = new QuaternaryOperations();

    @Test
    void convertToDecimal() {
        // Test converting quaternary "1" to decimal 1
        assertEquals(1, operations.convertToDecimal("1"));

        // Test converting quaternary "2" to decimal 2
        assertEquals(2, operations.convertToDecimal("2"));

        // Test converting quaternary "10" to decimal 4
        assertEquals(4, operations.convertToDecimal("10"));
    }

    @Test
    void convertToQuaternary() {
        // Test converting decimal 1 to quaternary "1"
        assertEquals("1", operations.convertToQuaternary(1));

        // Test converting decimal 2 to quaternary "2"
        assertEquals("2", operations.convertToQuaternary(2));

        // Test converting decimal 4 to quaternary "10"
        assertEquals("10", operations.convertToQuaternary(4));

        //Test converting decimal 45 into quaternary "231"
        assertEquals("231", operations.convertToQuaternary(45));
    }

    @Test
    void addition() {
        //Testing addition of quaternary(decimal) 12(6) and 10(4) = 22(10)
        assertEquals("22", operations.addition("12","10"));

        //Testing addition of quaternary(decimal) 23(11) and 22(10) = 111(21)
        assertEquals("111", operations.addition("23","22"));
    }

    @Test
    void subtraction() {
        //Testing subtraction of quaternary(decimal) 231(45) and 123(27) = 102(18)
        assertEquals("102", operations.subtraction("231","123"));

        //Testing subtraction of quaternary(decimal) 123(27) and 231(45) = -102(-18)
        assertEquals("-102", operations.subtraction("123","231"));
    }

    @Test
    void multiplication() {
        //Testing multiplication of quaternary(decimal) 2(2) and 13(7) = 32(14)
        assertEquals("32", operations.multiplication("2", "13"));

        //Testing multiplication of quaternary(decimal) 11(2) and 110(20) = 1210(100)
        assertEquals("1210", operations.multiplication("11","110"));
    }

    @Test
    void division() {
        //Testing division of quaternary(decimal) 13(7) and 3(3) = 2(2)
        assertEquals("2", operations.division("13","3"));

        //Testing division of quaternary(decimal) 1203(99) and 201(33) = 3(3)
        assertEquals("3", operations.division("1203","201"));
    }
}
