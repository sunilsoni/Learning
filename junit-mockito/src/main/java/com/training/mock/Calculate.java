package com.training.mock;

public class Calculate {

    //1000


    //100%
    public int calculate(String aa,String bb,String operation){

        int a = Integer.parseInt(aa);//1, one
        int b = Integer.parseInt(bb);

        switch (operation){
            case "ADD": return a+b;
            case "MULTIPLY": return a*b;
            case "SUBTRACT":
                if(a>b){
                    return a-b;
                }
                throw new IllegalArgumentException("A should be greater then b.");
            default:throw new IllegalArgumentException("Something went wrong");
        }
    }
}
