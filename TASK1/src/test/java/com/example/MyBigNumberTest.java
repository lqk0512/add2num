package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyBigNumberTest {

    MyBigNumber calc = new MyBigNumber();

    @Test
    void test001() {
        assertEquals("2131", calc.sum("1234", "897"));
    }

    @Test
    void test002() {
        assertEquals("1000", calc.sum("999", "1"));
    }

    @Test
    void test003() {
        assertEquals("10004", calc.sum("5", "9999"));
    }

    @Test
    void test004() {
        assertEquals("0", calc.sum("0", "0"));
    }

    @Test
    void test005() {
        assertEquals("19999", calc.sum("9999", "10000"));
    }
}