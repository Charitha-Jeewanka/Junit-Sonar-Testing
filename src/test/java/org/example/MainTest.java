package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MainTest {
    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void testSubtraction(){
        Calculator calculator = new Calculator();
        int result = calculator.sub(5,2);
        assertEquals(3, result);
    }
}