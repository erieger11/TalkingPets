package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class RodentTest {
    @Test
    public void constructorTest() {
        String name = "pippy";
        Rodent rodent = new Rodent(name);
        String retrievedName = rodent.getName();
        Assert.assertEquals(name, retrievedName);
    }
    @Test
    public void testSetName() {
        Rodent rodent = new Rodent(null);
        String expected = "Mittens";
        rodent.setName(expected);
        String actual = rodent.getName();
        Assert.assertEquals(expected, actual);
    }
    @Test
public void makeNoiseTest() {
    Rodent rodent = new Rodent(null);
    String expected = "SQUEAK";
    String actual = rodent.speak();
    Assert.assertEquals(expected, actual);
    }
}
