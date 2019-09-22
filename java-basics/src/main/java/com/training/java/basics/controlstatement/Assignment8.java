package com.training.java.basics.controlstatement;

/*
If a switch contains more than five items, it's implemented using a lookup table or a hash list.
This means that all items get the same access time, compared to a list of if:s where the last item takes much more time to
 reach as it has to evaluate every previous condition first.
 */
public class Assignment8 {

	public static void main(String[] args) {
		char colorCode = 'W';
		
		switch (colorCode) {
		case 'R':
			System.out.println("R->Red");
			break;
		case 'G':
			System.out.println("G->Green");
			break;
		case 'B':
			System.out.println("B->Blue");
			break;
		case 'O':
			System.out.println("O->Orange");
			break;
		case 'Y':
			System.out.println("Y->Yellow");
			break;
		case 'W':
			System.out.println("W->White");
			break;
		default:
			System.out.println("Invalid Code");
		}

	}

}
