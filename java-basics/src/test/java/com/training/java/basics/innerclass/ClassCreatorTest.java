package com.training.java.basics.innerclass;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClassCreatorTest {

    @Test
    public void main() {
        // Create non-static inner classes and static inner classes in other classes
        EnclosingOne eo = new EnclosingOne();
        EnclosingOne.InsideOne io = eo.new InsideOne();
        EnclosingOne.InsideTwo it = new EnclosingOne.InsideTwo();
    }
}