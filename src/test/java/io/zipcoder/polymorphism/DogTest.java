package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void constructorTest() {
        String name = "Rocky";
        Dog dog = new Dog(name);
        String retrievedName = dog.getName();
        Assert.assertEquals(name, retrievedName);
    }
    @Test
    public void testSetName() {
        Dog dog = new Dog(null);
        String expected = "Rocky";
        dog.setName(expected);
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void speakTest() {
        Dog dog = new Dog(null);
        String expected = "BARK";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }
}
