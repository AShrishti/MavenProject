package com.bridgelabz.javasamples;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		int WorkingHours = 0;
		int isPresent = 1;
		int isPartTime = 2;
		int WagePerHour = 20;
		int DailyEmpWage = 0;

		System.out.println("Welcome to Employee Wage Computation Program");

		Random random = new Random();
		int randomcheck = random.nextInt(3);

		if (isPresent == randomcheck) {
			System.out.println("Employee is Present");
			WorkingHours = 8;

		} else if (isPartTime == randomcheck) {
			System.out.println("Employee is Present,but worked for PartTime");
			WorkingHours = 4;

		} else {
			System.out.println("Employee is Absent");
			DailyEmpWage = 0;
		}
		DailyEmpWage = WorkingHours * WagePerHour;
		System.out.println("Daily Employee Wage of Employee is :" + DailyEmpWage);
	}
}
