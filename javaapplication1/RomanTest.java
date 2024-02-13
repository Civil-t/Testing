package javaapplication1;

import org.junit.Assert;
import org.junit.*;

public class RomanTest {

    @Test
    void singleDigit() {
        Assert.assertEquals(1, new Roman().romanToInt("I"));
        Assert.assertEquals(5, new Roman().romanToInt("V"));
        Assert.assertEquals(10, new Roman().romanToInt("X"));
        Assert.assertEquals(50, new Roman().romanToInt("L"));
        Assert.assertEquals(100, new Roman().romanToInt("C"));
        Assert.assertEquals(500, new Roman().romanToInt("D"));
        Assert.assertEquals(1000, new Roman().romanToInt("M"));
    }

    @Test
    void repetition() {
        Assert.assertEquals(2, new Roman().romanToInt("II"));
        Assert.assertEquals(20, new Roman().romanToInt("XX"));
    }

    @Test
    void manyLettersInOrder() {
        Assert.assertEquals(1000, new Roman().romanToInt("VI"));
        Assert.assertEquals(1000, new Roman().romanToInt("XV"));
    }

}
