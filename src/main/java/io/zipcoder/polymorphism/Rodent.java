package io.zipcoder.polymorphism;

public class Rodent extends Pet{
    public Rodent(String name) {
        super(name);
    }
    public String speak(){
        return "SQUEAK";
    }
}
