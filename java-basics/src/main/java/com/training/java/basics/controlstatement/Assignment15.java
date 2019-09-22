package com.training.java.basics.controlstatement;

public class Assignment15 {

	public static void main(String[] args) {
		int number = 123456789;//1+2+3+4+5+6+7+8+9
		int sum = 0;
		
		while (number != 0) {
			sum += number % 10;
			number /= 10;
		}
		
		System.out.println(sum);

	}

}
