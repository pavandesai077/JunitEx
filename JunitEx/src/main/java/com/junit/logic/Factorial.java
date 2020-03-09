package com.junit.logic;

public class Factorial {
	public static void main(String[] args) {
		Factorial.fact(5);

	}

	public static int fact(int number) {
		int i = 1;
		// int number=5;
		int fact = 1;
		while (i <= number) {
			fact = fact * i;
			i++;
		}
		System.out.println(fact);
		return fact;
	}


}
