package com.bridgelabz.javasamples;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		int isPresent = 1;
		Random random = new Random();
		int randomcheck = random.nextInt(2);

		if (isPresent == randomcheck)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
}
