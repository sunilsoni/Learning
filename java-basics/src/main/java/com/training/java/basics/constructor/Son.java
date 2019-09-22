package com.training.java.basics.constructor;

/**
 * The subclass constructor will first call the parent class's no-argument constructor by default, regardless of whether super() is explicitly written;
 */
public class Son extends Father {
    private static int countSon;

    static {
        System.out.println(" Subclasses can access the static property of the parent class count " + count);
        System.out.println(" The static property of the subclass countSon initializes: " + countSon);
    }

    public Son(String name) {
        super(name);
        System.out.println("The implementation of the subclass constructor Son(String name) " + name);
    }

    public Son() {
        System.out.println(" executing a no-argument constructor for subclasses(Son) ");
    }


}






/*
 Parent class(Father) static property count initialization: 10
 Subclasses can access the static property of the parent class count 10
 The static property of the subclass countSon initializes: 0
 executes the parent class's(Father) no-argument constructor
The implementation of the subclass constructor Son(String name) aaa
 executes the parent class's(Father) no-argument constructor
 executing a no-argument constructor for subclasses(Son)
 */