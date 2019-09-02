package com.example;

import java.util.Scanner;
import java.lang.Math;;

public class TestEX {

	public static void main(String[] args) {
		CodeEX ce = new CodeEX("");
		Scanner sc = new Scanner(System.in);// Takes in User Input

		int num, num1, num2, num3, avg, avg1;
		int subAvg = 36;//
		double hndcap;
		double hancap1 = .90;
		String name;

		// Tells user about the handicap scoring rules
		System.out.println("Handicap should not exceed 22 and cannot be less than Zero");

		// Begin process for users to enter name and numbers
		System.out.println("Enter your name");
		name = sc.next();
		System.out.println("Enter your first number");
		num = sc.nextInt();
		System.out.println("Enter your second number");
		num1 = sc.nextInt();
		System.out.println("Enter your third number");
		num2 = sc.nextInt();
		System.out.println("Enter your fourth number");
		num3 = sc.nextInt();

		System.out.println("Hello my name is :" + name);
		// Prints out numbers user entered to the console
		System.out.println(name + " You Entered: " + num + " " + num1 + " " + num2 + " " + num3);

		// Starts calculating the average by taking the numbers entered and subtracting
		// 36
		avg = num + num1 + num2 + num3 - subAvg;

		// Finishes calculating the average by dividing the 4 numbers enter by 4.
		avg1 = avg / 4;

		// Calculates the handicap by taking the average and multiplying it by 90%
		hndcap = avg1 * hancap1;

		// Prints the Results to console
		System.out.println(name + " Here are your results below");
		System.out.println("The Golf Average is : " + avg);

		// Rounds the handicap up and Prints out to console
		System.out.println("The Golf Hanicap is : " + Math.round(avg1));

		// Checks to see if the handicap is Greater than 22 or less than 0.
		if (hndcap > 22) {
			System.out.println("Your handicap has exceeded the max value of 22");
		} else if (hndcap < 0) {
			System.out.println("Your handicap cannot be less than Zero");
		}
		// Prints out the handicap
		System.out.println("The handicap score is :" + hndcap);

	}
}
