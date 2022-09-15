package com.bridgelabz.javasamples;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		int FullDayHour = 0;
		int isPresent = 1;
		int WagePerHour = 20;
		int DailyEmpWage = 0;

		System.out.println("Welcome to Employee Wage Computation Program");

		Random random = new Random();
		int randomcheck = random.nextInt(2);

		if (isPresent == randomcheck) {
			System.out.println("Employee is Present");
			FullDayHour = 8;
			DailyEmpWage = FullDayHour * WagePerHour;

		} else {
			System.out.println("Employee is Absent");
			DailyEmpWage = 0;
		}
		System.out.println("Daily Employee Wage of Employee is :" + DailyEmpWage);
	}
}
