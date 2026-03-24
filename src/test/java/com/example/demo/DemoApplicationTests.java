package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DemoApplicationTests {

    @Test
    void testProductPriceShouldBePositive() {
        float price = 500;
        assertTrue(price > 0);
    }

    @Test
    void testProductNameNotNull() {
        String productName = "Laptop";
        assertNotNull(productName);
    }

    @Test
    void testProductDiscountCalculation() {
        float price = 1000;
        float discount = 100;
        float finalPrice = price - discount;

        assertEquals(900, finalPrice);
    }
}