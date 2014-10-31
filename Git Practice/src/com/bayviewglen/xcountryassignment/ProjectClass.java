/*
 * Name: Ross West
 * Course: ICS3U-AP
 * Title: Cross-Country Assignment
 * Description: Runners input their times for the first mile, the second mile, and the total time.
 * 		What this program does is that it calculates the split times and gives those back.
 * 		After five runners enter their data, it displays everything in a table.
 * Due Date: October 31, 2014
 * Teacher: K. DesLauriers
 */

package com.bayviewglen.xcountryassignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat formatter = new DecimalFormat("00.000"); // Formatter to
																// prevent long
																// strings of
																// decimals due
																// to double
																// precision
																// errors.
		Scanner keyboard = new Scanner(System.in); // Declaring Scanner

		final int SECONDS_IN_MINUTE = 60; // Hopefully this isn't changing
											// any time soon.

		// Hopefully this is pretty intuitive.
		System.out.print("Runner one, please enter your name: ");
		String name1 = keyboard.nextLine(); // There's probably something about
											// not putting numbers in variable
											// names,
											// But screw that it's too
											// inconvenient not to do that, due
											// to 5 runners.

		System.out.print("Please enter your time for the first Mile: ");
		String firstMileTime1 = keyboard.nextLine();

		System.out.print("Please enter your time for the second Mile: ");
		String secondMileTime1 = keyboard.nextLine();

		System.out.print("Please enter your time for the entire 5 KM: ");
		String totalTime1 = keyboard.nextLine();

		// Right, now:
		// This technique breaks down the time into Minutes and Seconds.
		String mileOneMinutes1 = firstMileTime1.substring(0,
				firstMileTime1.indexOf(":"));
		String mileOneSeconds1 = firstMileTime1.substring(firstMileTime1
				.indexOf(":") + 1);
		int firstMileMinutes1 = Integer.parseInt(mileOneMinutes1);
		double firstMileSeconds1 = Double.parseDouble(mileOneSeconds1);

		// And now, by using those numbers, we can now add them to get the final
		// time in seconds.
		double firstMileTimeInSeconds1 = (firstMileMinutes1 * SECONDS_IN_MINUTE)
				+ firstMileSeconds1;

		// We do the same for each time given.
		String mileTwoMinutes1 = secondMileTime1.substring(0,
				secondMileTime1.indexOf(":"));
		String mileTwoSeconds1 = secondMileTime1.substring(secondMileTime1
				.indexOf(":") + 1);
		int secondMileMinutes1 = Integer.parseInt(mileTwoMinutes1);
		double secondMileSeconds1 = Double.parseDouble(mileTwoSeconds1);

		double secondMileTimeInSeconds1 = (secondMileMinutes1 * SECONDS_IN_MINUTE)
				+ secondMileSeconds1;

		// And now for split three.
		String mileThreeMinutes1 = totalTime1.substring(0,
				firstMileTime1.indexOf(":"));
		String mileThreeSeconds1 = totalTime1.substring(firstMileTime1
				.indexOf(":") + 1);
		int finalMileMinutes1 = Integer.parseInt(mileThreeMinutes1);
		double finalMileSeconds1 = Double.parseDouble(mileThreeSeconds1);

		double finalMileTimeInSeconds1 = (finalMileMinutes1 * SECONDS_IN_MINUTE)
				+ finalMileSeconds1;

		double splitOneInSeconds1 = firstMileTimeInSeconds1; // Not needed at
																// all, but good
																// for reference
																// because
																// things get
																// ugly
		double splitTwoInSeconds1 = secondMileTimeInSeconds1
				- splitOneInSeconds1; // Getting split times via subtraction
		double splitThreeInSeconds1 = finalMileTimeInSeconds1
				- secondMileTimeInSeconds1;
		// These times are precisely and objectively right (barring
		// double-mathematical precision errors),
		// But pure seconds isn't useful for display, so to get it back into
		// Minutes:Seconds format:

		// Displaying times
		int splitOneMinutesDisplay1 = (int) splitOneInSeconds1
				/ SECONDS_IN_MINUTE; // Cast as an integer to get minutes
		double splitOneSecondsDisplay1 = splitOneInSeconds1 % SECONDS_IN_MINUTE; // Use
																					// Modulo
																					// to
																					// only
																					// give
																					// the
																					// remainder
																					// instead
																					// of
																					// everything
		String splitOneDisplay1 = splitOneMinutesDisplay1 + ":"
				+ formatter.format(splitOneSecondsDisplay1);

		int splitTwoMinutesDisplay1 = (int) splitTwoInSeconds1
				/ SECONDS_IN_MINUTE;
		double splitTwoSecondsDisplay1 = splitTwoInSeconds1 % SECONDS_IN_MINUTE;
		String splitTwoDisplay1 = splitTwoMinutesDisplay1 + ":"
				+ formatter.format(splitTwoSecondsDisplay1);

		int splitThreeMinutesDisplay1 = (int) splitThreeInSeconds1
				/ SECONDS_IN_MINUTE;
		double splitThreeSecondsDisplay1 = splitThreeInSeconds1
				% SECONDS_IN_MINUTE;
		String splitThreeDisplay1 = splitThreeMinutesDisplay1 + ":"
				+ formatter.format(splitThreeSecondsDisplay1);

		// And now we output the result to the user.
		System.out.println("-*- Runner Summary of " + name1 + " -*-");
		System.out.println("Your time for your first split was "
				+ splitOneDisplay1 + ",");
		System.out.println("Your time for the second split was "
				+ splitTwoDisplay1 + ",");
		System.out.println("Your time for the final split was "
				+ splitThreeDisplay1 + ",");
		System.out.println("and your total time for the 5KM was " + totalTime1
				+ ".");

		// AND NOW AGAIN FOR EVERY SINGLE RUNNER, SO MUCH COPY-PAAAAAAAAAAASTE
		// Luckily my names are really easy to rename so HEH :V

		// RUNNER TWO
		// Hopefully this is pretty intuitive.
		System.out.print("Runner Two, please enter your name: ");
		String name2 = keyboard.nextLine(); // There's probably something about
											// not putting numbers in variable
											// names,
											// But screw that it's too
											// convenient not to do that, due to
											// 5 runners.

		System.out.print("Please enter your time for the first Mile: ");
		String firstMileTime2 = keyboard.nextLine();

		System.out.print("Please enter your time for the second Mile: ");
		String secondMileTime2 = keyboard.nextLine();

		System.out.print("Please enter your time for the entire 5 KM: ");
		String totalTime2 = keyboard.nextLine();

		// Right, now:
		// This technique breaks down the time into Minutes and Seconds.
		String mileOneMinutes2 = firstMileTime2.substring(0,
				firstMileTime2.indexOf(":"));
		String mileOneSeconds2 = firstMileTime2.substring(firstMileTime2
				.indexOf(":") + 1);
		int firstMileMinutes2 = Integer.parseInt(mileOneMinutes2);
		double firstMileSeconds2 = Double.parseDouble(mileOneSeconds2);

		// And now, by using those numbers, we can now add them to get the final
		// time in seconds.
		double firstMileTimeInSeconds2 = (firstMileMinutes2 * SECONDS_IN_MINUTE)
				+ firstMileSeconds2;

		// We do the same for each time given.
		String mileTwoMinutes2 = secondMileTime2.substring(0,
				secondMileTime2.indexOf(":"));
		String mileTwoSeconds2 = secondMileTime2.substring(secondMileTime2
				.indexOf(":") + 1);
		int secondMileMinutes2 = Integer.parseInt(mileTwoMinutes2);
		double secondMileSeconds2 = Double.parseDouble(mileTwoSeconds2);

		double secondMileTimeInSeconds2 = (secondMileMinutes2 * SECONDS_IN_MINUTE)
				+ secondMileSeconds2;

		// And now for split three.
		String mileThreeMinutes2 = totalTime2.substring(0,
				firstMileTime2.indexOf(":"));
		String mileThreeSeconds2 = totalTime2.substring(firstMileTime2
				.indexOf(":") + 1);
		int finalMileMinutes2 = Integer.parseInt(mileThreeMinutes2);
		double finalMileSeconds2 = Double.parseDouble(mileThreeSeconds2);

		double finalMileTimeInSeconds2 = (finalMileMinutes2 * SECONDS_IN_MINUTE)
				+ finalMileSeconds2;

		double splitOneInSeconds2 = firstMileTimeInSeconds2; // Not needed at
																// all, but good
																// for reference
																// because
																// things get
																// ugly
		double splitTwoInSeconds2 = secondMileTimeInSeconds2
				- splitOneInSeconds2; // Getting split times via subtraction
		double splitThreeInSeconds2 = finalMileTimeInSeconds2
				- secondMileTimeInSeconds2;
		// These times are precisely and objectively right (barring
		// double-mathematical precision errors),
		// But pure seconds isn't useful for display, so to get it back into
		// Minutes:Seconds format:

		// Displaying times
		int splitOneMinutesDisplay2 = (int) splitOneInSeconds2
				/ SECONDS_IN_MINUTE; // Cast as an integer to get minutes
		double splitOneSecondsDisplay2 = splitOneInSeconds2 % SECONDS_IN_MINUTE; // Use
																					// Modulo
																					// to
																					// only
																					// give
																					// the
																					// remainder
																					// instead
																					// of
																					// everything
		String splitOneDisplay2 = splitOneMinutesDisplay2 + ":"
				+ formatter.format(splitOneSecondsDisplay2);

		int splitTwoMinutesDisplay2 = (int) splitTwoInSeconds2
				/ SECONDS_IN_MINUTE;
		double splitTwoSecondsDisplay2 = splitTwoInSeconds2 % SECONDS_IN_MINUTE;
		String splitTwoDisplay2 = splitTwoMinutesDisplay2 + ":"
				+ formatter.format(splitTwoSecondsDisplay2);

		int splitThreeMinutesDisplay2 = (int) splitThreeInSeconds2
				/ SECONDS_IN_MINUTE;
		double splitThreeSecondsDisplay2 = splitThreeInSeconds2
				% SECONDS_IN_MINUTE;
		String splitThreeDisplay2 = splitThreeMinutesDisplay2 + ":"
				+ formatter.format(splitThreeSecondsDisplay2);

		// And now we output the result to the user.
		System.out.println("-*- Runner Summary of " + name2 + " -*-");
		System.out.println("Your time for your first split was "
				+ splitOneDisplay2 + ",");
		System.out.println("Your time for the second split was "
				+ splitTwoDisplay2 + ",");
		System.out.println("Your time for the final split was "
				+ splitThreeDisplay2 + ",");
		System.out.println("and your total time for the 5KM was " + totalTime2
				+ ".");

		// IT NEVER ENDS
		// RUNNER THREE:

		// Hopefully this is pretty intuitive.
		System.out.print("Runner Three, please enter your name: ");
		String name3 = keyboard.nextLine(); // There's probably something about
											// not putting numbers in variable
											// names,
											// But screw that it's too
											// convenient not to do that, due to
											// 5 runners.

		System.out.print("Please enter your time for the first Mile: ");
		String firstMileTime3 = keyboard.nextLine();

		System.out.print("Please enter your time for the second Mile: ");
		String secondMileTime3 = keyboard.nextLine();

		System.out.print("Please enter your time for the entire 5 KM: ");
		String totalTime3 = keyboard.nextLine();

		// Right, now:
		// This technique breaks down the time into Minutes and Seconds.
		String mileOneMinutes3 = firstMileTime3.substring(0,
				firstMileTime3.indexOf(":"));
		String mileOneSeconds3 = firstMileTime3.substring(firstMileTime3
				.indexOf(":") + 1);
		int firstMileMinutes3 = Integer.parseInt(mileOneMinutes3);
		double firstMileSeconds3 = Double.parseDouble(mileOneSeconds3);

		// And now, by using those numbers, we can now add them to get the final
		// time in seconds.
		double firstMileTimeInSeconds3 = (firstMileMinutes3 * SECONDS_IN_MINUTE)
				+ firstMileSeconds3;

		// We do the same for each time given.
		String mileTwoMinutes3 = secondMileTime3.substring(0,
				secondMileTime3.indexOf(":"));
		String mileTwoSeconds3 = secondMileTime3.substring(secondMileTime3
				.indexOf(":") + 1);
		int secondMileMinutes3 = Integer.parseInt(mileTwoMinutes3);
		double secondMileSeconds3 = Double.parseDouble(mileTwoSeconds3);

		double secondMileTimeInSeconds3 = (secondMileMinutes3 * SECONDS_IN_MINUTE)
				+ secondMileSeconds3;

		// And now for split three.
		String mileThreeMinutes3 = totalTime3.substring(0,
				firstMileTime3.indexOf(":"));
		String mileThreeSeconds3 = totalTime3.substring(firstMileTime3
				.indexOf(":") + 1);
		int finalMileMinutes3 = Integer.parseInt(mileThreeMinutes3);
		double finalMileSeconds3 = Double.parseDouble(mileThreeSeconds3);

		double finalMileTimeInSeconds3 = (finalMileMinutes3 * SECONDS_IN_MINUTE)
				+ finalMileSeconds3;

		double splitOneInSeconds3 = firstMileTimeInSeconds3; // Not needed at
																// all, but good
																// for reference
																// because
																// things get
																// ugly
		double splitTwoInSeconds3 = secondMileTimeInSeconds3
				- splitOneInSeconds3; // Getting split times via subtraction
		double splitThreeInSeconds3 = finalMileTimeInSeconds3
				- secondMileTimeInSeconds3;
		// These times are precisely and objectively right (barring
		// double-mathematical precision errors),
		// But pure seconds isn't useful for display, so to get it back into
		// Minutes:Seconds format:

		// Displaying times
		int splitOneMinutesDisplay3 = (int) splitOneInSeconds3
				/ SECONDS_IN_MINUTE; // Cast as an integer to get minutes
		double splitOneSecondsDisplay3 = splitOneInSeconds3 % SECONDS_IN_MINUTE; // Use
																					// Modulo
																					// to
																					// only
																					// give
																					// the
																					// remainder
																					// instead
																					// of
																					// everything
		String splitOneDisplay3 = splitOneMinutesDisplay3 + ":"
				+ formatter.format(splitOneSecondsDisplay3);

		int splitTwoMinutesDisplay3 = (int) splitTwoInSeconds3
				/ SECONDS_IN_MINUTE;
		double splitTwoSecondsDisplay3 = splitTwoInSeconds3 % SECONDS_IN_MINUTE;
		String splitTwoDisplay3 = splitTwoMinutesDisplay3 + ":"
				+ formatter.format(splitTwoSecondsDisplay3);

		int splitThreeMinutesDisplay3 = (int) splitThreeInSeconds3
				/ SECONDS_IN_MINUTE;
		double splitThreeSecondsDisplay3 = splitThreeInSeconds3
				% SECONDS_IN_MINUTE;
		String splitThreeDisplay3 = splitThreeMinutesDisplay3 + ":"
				+ formatter.format(splitThreeSecondsDisplay3);

		// And now we output the result to the user.
		System.out.println("-*- Runner Summary of " + name3 + " -*-");
		System.out.println("Your time for your first split was "
				+ splitOneDisplay3 + ",");
		System.out.println("Your time for the second split was "
				+ splitTwoDisplay3 + ",");
		System.out.println("Your time for the final split was "
				+ splitThreeDisplay3 + ",");
		System.out.println("and your total time for the 5KM was " + totalTime3
				+ ".");

		// YES I COPY-PASTED EVERYTHING
		// COMMENTS INCLUDED

		// Hopefully this is pretty intuitive.
		System.out.print("Runner Two, please enter your name: ");
		String name4 = keyboard.nextLine(); // There's probably something about
											// not putting numbers in variable
											// names,
											// But screw that it's too
											// convenient not to do that, due to
											// 5 runners.

		System.out.print("Please enter your time for the first Mile: ");
		String firstMileTime4 = keyboard.nextLine();

		System.out.print("Please enter your time for the second Mile: ");
		String secondMileTime4 = keyboard.nextLine();

		System.out.print("Please enter your time for the entire 5 KM: ");
		String totalTime4 = keyboard.nextLine();

		// Right, now:
		// This technique breaks down the time into Minutes and Seconds.
		String mileOneMinutes4 = firstMileTime4.substring(0,
				firstMileTime4.indexOf(":"));
		String mileOneSeconds4 = firstMileTime4.substring(firstMileTime4
				.indexOf(":") + 1);
		int firstMileMinutes4 = Integer.parseInt(mileOneMinutes4);
		double firstMileSeconds4 = Double.parseDouble(mileOneSeconds4);

		// And now, by using those numbers, we can now add them to get the final
		// time in seconds.
		double firstMileTimeInSeconds4 = (firstMileMinutes4 * SECONDS_IN_MINUTE)
				+ firstMileSeconds4;

		// We do the same for each time given.
		String mileTwoMinutes4 = secondMileTime4.substring(0,
				secondMileTime4.indexOf(":"));
		String mileTwoSeconds4 = secondMileTime4.substring(secondMileTime4
				.indexOf(":") + 1);
		int secondMileMinutes4 = Integer.parseInt(mileTwoMinutes4);
		double secondMileSeconds4 = Double.parseDouble(mileTwoSeconds4);

		double secondMileTimeInSeconds4 = (secondMileMinutes4 * SECONDS_IN_MINUTE)
				+ secondMileSeconds4;

		// And now for split three.
		String mileThreeMinutes4 = totalTime4.substring(0,
				firstMileTime4.indexOf(":"));
		String mileThreeSeconds4 = totalTime4.substring(firstMileTime4
				.indexOf(":") + 1);
		int finalMileMinutes4 = Integer.parseInt(mileThreeMinutes4);
		double finalMileSeconds4 = Double.parseDouble(mileThreeSeconds4);

		double finalMileTimeInSeconds4 = (finalMileMinutes4 * SECONDS_IN_MINUTE)
				+ finalMileSeconds4;

		double splitOneInSeconds4 = firstMileTimeInSeconds4; // Not needed at
																// all, but good
																// for reference
																// because
																// things get
																// ugly
		double splitTwoInSeconds4 = secondMileTimeInSeconds4
				- splitOneInSeconds4; // Getting split times via subtraction
		double splitThreeInSeconds4 = finalMileTimeInSeconds4
				- secondMileTimeInSeconds4;
		// These times are precisely and objectively right (barring
		// double-mathematical precision errors),
		// But pure seconds isn't useful for display, so to get it back into
		// Minutes:Seconds format:

		// Displaying times
		int splitOneMinutesDisplay4 = (int) splitOneInSeconds4
				/ SECONDS_IN_MINUTE; // Cast as an integer to get minutes
		double splitOneSecondsDisplay4 = splitOneInSeconds4 % SECONDS_IN_MINUTE; // Use
																					// Modulo
																					// to
																					// only
																					// give
																					// the
																					// remainder
																					// instead
																					// of
																					// everything
		String splitOneDisplay4 = splitOneMinutesDisplay4 + ":"
				+ formatter.format(splitOneSecondsDisplay4);

		int splitTwoMinutesDisplay4 = (int) splitTwoInSeconds4
				/ SECONDS_IN_MINUTE;
		double splitTwoSecondsDisplay4 = splitTwoInSeconds4 % SECONDS_IN_MINUTE;
		String splitTwoDisplay4 = splitTwoMinutesDisplay4 + ":"
				+ formatter.format(splitTwoSecondsDisplay4);

		int splitThreeMinutesDisplay4 = (int) splitThreeInSeconds4
				/ SECONDS_IN_MINUTE;
		double splitThreeSecondsDisplay4 = splitThreeInSeconds4
				% SECONDS_IN_MINUTE;
		String splitThreeDisplay4 = splitThreeMinutesDisplay4 + ":"
				+ formatter.format(splitThreeSecondsDisplay4);

		// And now we output the result to the user.
		System.out.println("-*- Runner Summary of " + name4 + " -*-");
		System.out.println("Your time for your first split was "
				+ splitOneDisplay4 + ",");
		System.out.println("Your time for the second split was "
				+ splitTwoDisplay4 + ",");
		System.out.println("Your time for the final split was "
				+ splitThreeDisplay4 + ",");
		System.out.println("and your total time for the 5KM was " + totalTime4
				+ ".");

		// FINALLY RUNNER FIVE
		// IT ENDS NOW

		// Hopefully this is pretty intuitive.
		System.out.print("Runner Two, please enter your name: ");
		String name5 = keyboard.nextLine(); // There's probably something about
											// not putting numbers in variable
											// names,
											// But screw that it's too
											// convenient not to do that, due to
											// 5 runners.

		System.out.print("Please enter your time for the first Mile: ");
		String firstMileTime5 = keyboard.nextLine();

		System.out.print("Please enter your time for the second Mile: ");
		String secondMileTime5 = keyboard.nextLine();

		System.out.print("Please enter your time for the entire 5 KM: ");
		String totalTime5 = keyboard.nextLine();

		// Right, now:
		// This technique breaks down the time into Minutes and Seconds.
		String mileOneMinutes5 = firstMileTime5.substring(0,
				firstMileTime5.indexOf(":"));
		String mileOneSeconds5 = firstMileTime5.substring(firstMileTime5
				.indexOf(":") + 1);
		int firstMileMinutes5 = Integer.parseInt(mileOneMinutes5);
		double firstMileSeconds5 = Double.parseDouble(mileOneSeconds5);

		// And now, by using those numbers, we can now add them to get the final
		// time in seconds.
		double firstMileTimeInSeconds5 = (firstMileMinutes5 * SECONDS_IN_MINUTE)
				+ firstMileSeconds5;

		// We do the same for each time given.
		String mileTwoMinutes5 = secondMileTime5.substring(0,
				secondMileTime5.indexOf(":"));
		String mileTwoSeconds5 = secondMileTime5.substring(secondMileTime5
				.indexOf(":") + 1);
		int secondMileMinutes5 = Integer.parseInt(mileTwoMinutes5);
		double secondMileSeconds5 = Double.parseDouble(mileTwoSeconds5);

		double secondMileTimeInSeconds5 = (secondMileMinutes5 * SECONDS_IN_MINUTE)
				+ secondMileSeconds5;

		// And now for split three.
		String mileThreeMinutes5 = totalTime5.substring(0,
				firstMileTime5.indexOf(":"));
		String mileThreeSeconds5 = totalTime5.substring(firstMileTime5
				.indexOf(":") + 1);
		int finalMileMinutes5 = Integer.parseInt(mileThreeMinutes5);
		double finalMileSeconds5 = Double.parseDouble(mileThreeSeconds5);

		double finalMileTimeInSeconds5 = (finalMileMinutes5 * SECONDS_IN_MINUTE)
				+ finalMileSeconds5;

		double splitOneInSeconds5 = firstMileTimeInSeconds5; // Not needed at
																// all, but good
																// for reference
																// because
																// things get
																// ugly
		double splitTwoInSeconds5 = secondMileTimeInSeconds5
				- splitOneInSeconds5; // Getting split times via subtraction
		double splitThreeInSeconds5 = finalMileTimeInSeconds5
				- secondMileTimeInSeconds5;
		// These times are precisely and objectively right (barring
		// double-mathematical precision errors),
		// But pure seconds isn't useful for display, so to get it back into
		// Minutes:Seconds format:

		// Displaying times
		int splitOneMinutesDisplay5 = (int) splitOneInSeconds5
				/ SECONDS_IN_MINUTE; // Cast as an integer to get minutes
		double splitOneSecondsDisplay5 = splitOneInSeconds5 % SECONDS_IN_MINUTE; // Use
																					// Modulo
																					// to
																					// only
																					// give
																					// the
																					// remainder
																					// instead
																					// of
																					// everything
		String splitOneDisplay5 = splitOneMinutesDisplay5 + ":"
				+ formatter.format(splitOneSecondsDisplay5);

		int splitTwoMinutesDisplay5 = (int) splitTwoInSeconds5
				/ SECONDS_IN_MINUTE;
		double splitTwoSecondsDisplay5 = splitTwoInSeconds5 % SECONDS_IN_MINUTE;
		String splitTwoDisplay5 = splitTwoMinutesDisplay5 + ":"
				+ formatter.format(splitTwoSecondsDisplay5);

		int splitThreeMinutesDisplay5 = (int) splitThreeInSeconds5
				/ SECONDS_IN_MINUTE;
		double splitThreeSecondsDisplay5 = splitThreeInSeconds5
				% SECONDS_IN_MINUTE;
		String splitThreeDisplay5 = splitThreeMinutesDisplay5 + ":"
				+ formatter.format(splitThreeSecondsDisplay5);

		// And now we output the result to the user.
		System.out.println("-*- Runner Summary of " + name5 + " -*-");
		System.out.println("Your time for your first split was "
				+ splitOneDisplay5 + ",");
		System.out.println("Your time for the second split was "
				+ splitTwoDisplay5 + ",");
		System.out.println("Your time for the final split was "
				+ splitThreeDisplay5 + ",");
		System.out.println("and your total time for the 5KM was " + totalTime5
				+ ".");

		// And now, for the table:

		String runnerName = "Runner Name";
		String firstSplit = "First Split";
		String secondSplit = "Second Split";
		String thirdSplit = "Third Split";
		String totalTime = "Total Time";

		System.out.println("------------------");
		System.out.println("5KM RUNNER RESULTS");
		System.out.println("------------------");
		System.out.printf("%n %-20s %16s %16s %16s %16s", runnerName,
				firstSplit, secondSplit, thirdSplit, totalTime);
		System.out.printf("%n %-20s %16s %16s %16s %16s", name1,
				splitOneDisplay1, splitTwoDisplay1, splitThreeDisplay1,
				totalTime1);
		System.out.printf("%n %-20s %16s %16s %16s %16s", name2,
				splitOneDisplay2, splitTwoDisplay2, splitThreeDisplay2,
				totalTime2);
		System.out.printf("%n %-20s %16s %16s %16s %16s", name3,
				splitOneDisplay3, splitTwoDisplay3, splitThreeDisplay3,
				totalTime3);
		System.out.printf("%n %-20s %16s %16s %16s %16s", name4,
				splitOneDisplay4, splitTwoDisplay4, splitThreeDisplay4,
				totalTime4);
		System.out.printf("%n %-20s %16s %16s %16s %16s", name5,
				splitOneDisplay5, splitTwoDisplay5, splitThreeDisplay5,
				totalTime5);

		/*
		 * So basically, what the chart does is display this: Runner Name First
		 * Split Second Split Third Split Total Time Name One Split:Time.1
		 * Split:Time.2 Split:Time.3 Total:Time. Name Two Split:Time.1
		 * Split:Time.2 Split:Time.3 Total:Time. Name Three Split:Time.1
		 * Split:Time.2 Split:Time.3 Total:Time. Name Four Split:Time.1
		 * Split:Time.2 Split:Time.3 Total:Time. Name Five Split:Time.1
		 * Split:Time.2 Split:Time.3 Total:Time.
		 */

		keyboard.close(); // Closes Scanner
		// Over 600 lines. Damn copy-paste.
	}

}
