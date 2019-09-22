package com.training.java.basics.datatypes;

public class DataTransformation {

    public static void main(String[] args) {
        Integer i = 42;
        Long l = 42l;
        Double d = 42.0;

        boolean longValue = Long.valueOf(String.valueOf(i))==l;

        System.out.println(i.equals(d)); // false
       // System.out.println("i==l"+ );
        System.out.println(d.equals(l)); // false
        System.out.println(i.equals(l)); // false
        System.out.println(l.equals(42L)); // true
    }
}


/**
 * The "==" operation of the wrapper class does not automatically unbox without encountering arithmetic operations;
 * The equals() method of the wrapper class does not handle data transformation.
 * <p>
 * (i == l), (i == d), (l == d) will compile error
 */