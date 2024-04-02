package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void constructorTest() {
        String name = "Mittens";
        Cat cat = new Cat(name);
        String retrievedName = cat.getName();
        Assert.assertEquals(name, retrievedName);
    }
    @Test
    public void testSetName() {
        Cat cat = new Cat(null);
        String expected = "Mittens";
        cat.setName(expected);
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void speakTest() {
        Cat cat = new Cat(null);
        String expected = "MEOW";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }
}
