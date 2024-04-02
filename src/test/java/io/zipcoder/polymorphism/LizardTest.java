package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class LizardTest {
    @Test
    public void constructorTest() {
        String name = "Sunny";
        Lizard lizard = new Lizard(name);
        String retrievedName = lizard.getName();
        Assert.assertEquals(name, retrievedName);
    }
    @Test
    public void testSetName() {
        Lizard lizard = new Lizard(null);
        String expected = "Mittens";
        lizard.setName(expected);
        String actual = lizard.getName();
        Assert.assertEquals(expected, actual);
    }
    @Test
public void makeNoiseTest() {
    Lizard lizard = new Lizard(null);
    String expected = "BLERP";
    String actual = lizard.speak();
    Assert.assertEquals(expected, actual);
    }
}
