package com.training.java.basics.datatypes;


//https://www.javatpoint.com/java-data-types
//https://www.tutorialspoint.com/java/java_basic_datatypes.htm
//https://www.w3schools.com/java/java_data_types.asp
public class BoxingUnboxing {

    public static void main(String[] args) {
        Integer a = 1;//int a=1
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;

        System.out.println(c == d);
        System.out.println(e == f);

        System.out.println("c.equals(d): "+c.equals(d));
        System.out.println("e.equals(f): "+e.equals(f));

        System.out.println(c == (a + b));
        System.out.println(c.equals(a + b));
        System.out.println(g == (a + b));
        System.out.println(g.equals(a + b));
        System.out.println(new Integer(2) == new Integer(2));

    }
}

/*
Output:     Reason:
True        autoboxing, caching
False       autoboxing, not cached
true
True        calls equals(), comparing values, not object addresses
true
false
False       compares the object address
 */