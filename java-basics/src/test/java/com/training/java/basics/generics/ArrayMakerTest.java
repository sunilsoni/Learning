package com.training.java.basics.generics;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayMakerTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void createStringArrayTest() {
        ArrayMaker<String> stringMaker = new ArrayMaker<String>(String.class);
        String[] stringArray = stringMaker.create(9);
        System.out.println(Arrays.toString(stringArray));

        assertThat(stringArray, is(notNullValue()));
        assertThat(stringArray.length, is(9));
    }

    @Test
    public void createIntegerArrayTest() {
        ArrayMaker<Integer> stringMaker = new ArrayMaker<Integer>(Integer.class);
        Integer[] stringArray = stringMaker.create(9);
        System.out.println(Arrays.toString(stringArray));

        assertThat(stringArray, is(notNullValue()));
        assertThat(stringArray.length, is(9));
    }
}

/* Output:
    [zero, zero, zero, zero, zero, zero, zero, zero, zero]
*/