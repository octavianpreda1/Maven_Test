package Caluclator;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest1 {

    @org.junit.jupiter.api.Test
    void test1_suma() {
        Calculator c=new Calculator(4,5);
        assertEquals(9,c.suma());
    }
    @org.junit.jupiter.api.Test
    void test2_suma() {
        Calculator c=new Calculator(4,5);
        assertTrue(c.suma()==9);
    }
    @org.junit.jupiter.api.Test
    void test3_suma() {
        Calculator c=new Calculator(4,5);
        assertFalse(c.suma()!=9);
    }
}