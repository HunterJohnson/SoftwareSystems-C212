package edu.indiana.cs.c212.hw.one;

import java.util.Scanner;

public class NumberProcessor {
	
	//this method should return the sum all of the numbers between 1 and n
	public static int sumSequence(int i) {
		return -1;
	}

	//this method should return the sum all of the EVEN numbers between 0 and n
	//example: n=8    :   0 + 2 + 4 + 6 + 8 = 20
	public static int sumEvenSequence(int n) {
		 return -1;
	}

	//this method should return the sum all of the ODD numbers between 1 and n
	//example: n=7    :   1 + 3 + 5 + 7 = 16
	public static int sumOddSequence(int n) {
		 return -1;
	}

	//this method should return the sum all of the PERFECT SQUARES between 1 and n
	//example: n=26    :   1 + 4 + 9 + 16 + 25 = 55
	public static int sumSquaresSequence(int n) {
		 return -1;
	}

	public static void main(String[] args)
	{
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(sumSequence(n));
		System.out.println(sumEvenSequence(n));
		System.out.println(sumOddSequence(n));
		System.out.println(sumSquaresSequence(n));
	}
}
