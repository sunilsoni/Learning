package com.training.java.basics.innerclass;

import org.junit.Test;

import static org.junit.Assert.*;

public class EnclosingOneTest {

    @Test
    public void testInnerClass() {
        EnclosingOne eo = new EnclosingOne();
        EnclosingOne.InsideOne io = eo.new InsideOne();
        EnclosingOne.InsideTwo it = new EnclosingOne.InsideTwo();
    }

}