package com.training.java.basics.innerclass;

//https://www.javatpoint.com/java-inner-class
//https://www.tutorialspoint.com/java/java_innerclasses.htm
public class EnclosingOne {

    public static void main(String[] args) {
        EnclosingOne eo = new EnclosingOne();
        InsideOne io = eo.new InsideOne();
        InsideTwo it = new InsideTwo();
    }

    static public class InsideTwo {

    }

    public class InsideOne {

    }
}