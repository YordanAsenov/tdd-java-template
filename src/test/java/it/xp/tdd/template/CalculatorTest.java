package it.xp.tdd.template;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void calculatorExists() {
        // arrange
        Calculator calculator = new Calculator();

        // act

        // assert
        Assertions.assertNotNull(calculator);
    }

    @Test
    public void givenTwoNumbers_thenEquals() {
        // arrange
        Calculator calculator = new Calculator();

        // act
        Double result = calculator.sum(1, 1);

        // assert
        Assertions.assertEquals(2, result);
    }
}
