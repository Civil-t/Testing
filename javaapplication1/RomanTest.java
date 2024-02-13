package javaapplication1;

import org.junit.*;

public class RomanTest {

    @Test
    public void singleDigit() {
        Assert.assertEquals(1, new Roman().romanToInt("I"));
        Assert.assertEquals(5, new Roman().romanToInt("V"));
        Assert.assertEquals(10, new Roman().romanToInt("X"));
        Assert.assertEquals(50, new Roman().romanToInt("L"));
        Assert.assertEquals(100, new Roman().romanToInt("C"));
        Assert.assertEquals(500, new Roman().romanToInt("D"));
        Assert.assertEquals(1000, new Roman().romanToInt("M"));
    }

    @Test
    public void repetition() {
        Assert.assertEquals(2, new Roman().romanToInt("II"));
        Assert.assertEquals(20, new Roman().romanToInt("XX"));
    }

    /**
     * 
     */
    @Test
    public void manyLettersInOrder() {
        Assert.assertEquals(6, new Roman().romanToInt("VI"));
        Assert.assertEquals(15, new Roman().romanToInt("XV"));
    }

    @Test
    public void testNull() {
        Assert.assertThrows(NullPointerException.class, () -> new Roman().romanToInt(null));
    }

    @Test
    public void invalidAndValidLetter() {
        Assert.assertThrows(NullPointerException.class, () -> new Roman().romanToInt("XIZ"));
    }

    @Test
    public void inValidLetter() {
        Assert.assertThrows(NullPointerException.class, () -> new Roman().romanToInt("Z"));
    }

    @Test
    public void testSubtractiveNotation() {
        Assert.assertEquals(4, new Roman().romanToInt("IV"));
    }

}
