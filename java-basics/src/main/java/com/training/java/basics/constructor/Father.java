package com.training.java.basics.constructor;

public class Father {
    protected static int count = 10;

    static {
        System.out.println(" Parent class(Father) static property count initialization: " + count);
    }

    private String name;

    public Father() {
        System.out.println(" executes the parent class's(Father) no-argument constructor ");
    }

    public Father(String name) {
        this.name = name;
        System.out.println("The implementation of the parent class's(Father) constructor Father(String name) " + name);
    }
}
