package src.test;

import src.main.logic.QuaternaryOperations;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuaternaryOperationsTest {

    QuaternaryOperations operations = new QuaternaryOperations();

    @Test
    void convertToDecimal() {
        //Test converting quaternary "1" to decimal 1
        assertEquals(1, operations.convertToDecimal("1"));

        //Test converting quaternary "2" to decimal 2
        assertEquals(2, operations.convertToDecimal("2"));

        //Test converting quaternary "10" to decimal 4
        assertEquals(4, operations.convertToDecimal("10"));
    }

    @Test
    void convertToQuaternary() {
        //Test converting decimal 1 to quaternary "1"
        assertEquals("1", operations.convertToQuaternary(1));

        //Test converting decimal 2 to quaternary "2"
        assertEquals("2", operations.convertToQuaternary(2));

        //Test converting decimal 4 to quaternary "10"
        assertEquals("10", operations.convertToQuaternary(4));

        //Test converting decimal 45 into quaternary "231"
        assertEquals("231", operations.convertToQuaternary(45));
    }

    @Test
    void addition() {
        //Test addition: 12 + 10 = 22 (6 + 4 = 10)
        assertEquals("22", operations.addition("12","10"));

        //Test addition: 23 + 22 = 111 (11 + 10 = 21)
        assertEquals("111", operations.addition("23","22"));
    }

    @Test
    void subtraction() {
        //Test subtraction: 231 - 123 = 102 (45 - 27 = 18)
        assertEquals("102", operations.subtraction("231","123"));

        //Test subtraction: 123 - 231 = -102 (27 - 45 = -18)
        assertEquals("-102", operations.subtraction("123","231"));
    }

    @Test
    void multiplication() {
        //Test multiplication: 2 * 13 = 32 (2 * 7 = 14)
        assertEquals("32", operations.multiplication("2", "13"));

        //Test multiplication: 11 * 110 = 1210 (2 * 20 = 100)
        assertEquals("1210", operations.multiplication("11","110"));
    }

    @Test
    void division() {
        //Test division: 13 / 3 = 2 (7 / 3 = 2)
        assertEquals("2", operations.division("13","3"));

        //Test division: 1203 / 201 = 3 (99 / 33 = 3)
        assertEquals("3", operations.division("1203","201"));
    }

    @Test
    void squareRoot() {
        //Test square root: sqrt(10) = 2 (sqrt(4) = 2)
        assertEquals("2", operations.squareRoot("10"));

        //Test square root: sqrt(121) = 11 (sqrt(25) = 5)
        assertEquals("11", operations.squareRoot("121"));
    }

    @Test
    void square() {
        //Test square: sq(2) = 10 (sq(2) = 4) 
        assertEquals("10", operations.square("2"));

        //Test square: sq(11) = 121 (sq(5) = 25)
        assertEquals("121", operations.square("11"));
    }
}
