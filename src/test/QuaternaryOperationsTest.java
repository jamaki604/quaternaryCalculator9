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
        //Testing addition of quaternary 12 and 10
        assertEquals("22", operations.addition("12","10"));

        //Testing addition of quaternary 25 and 22
        assertEquals("111", operations.addition("23","22"));
    }

    @Test
    void subtraction() {
        //Testing addition of quaternary 12 and 10
        assertEquals("110", operations.subtraction("231","123"));

        //Testing addition of quaternary 25 and 22
        assertEquals("12", operations.subtraction("33","21"));
    }
}
