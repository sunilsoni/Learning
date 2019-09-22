package com.training.java.basics.typeinfo;

import java.util.Random;

/**
 * 1. Using only the .class syntax to get a reference to a class does not cause initialization
 * 2. "Compiler constants", can be read without class initialization
 * 3.static final domain is not necessarily a compiler constant, static non-final domain must not be
 */
public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws Exception {
        Class initable = Initable.class;
        System.out.println("After creating Initable ref");

        // Does not trigger initialization:
        System.out.println(Initable.staticFinal);

        // Does trigger initialization:
        System.out.println(Initable.staticFinal2);

        // Does trigger initialization:
        System.out.println(Initable2.staticNonFinal);
        Class initable3 = Class.forName("com.training.java.basics.typeinfo.Initable3");
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);
    }
}

class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);

    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2 {
    static int staticNonFinal = 147;

    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3 {
    static int staticNonFinal = 74;

    static {
        System.out.println("Initializing Initable3");
    }
}


/* Output:
    After creating Initable ref
    47
    Initializing Initable
    258
    Initializing Initable2
    147
    Initializing Initable3
    After creating Initable3 ref
    74
*/