package Homework3;

import java.util.Scanner;

public class Weekday {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value from 1-7 to see what day it is.");
		int day =  input.nextInt();
		
		System.out.println(NameOfDay(day));
		input.close();
		
	}
	
	public static String NameOfDay(int day) {
		String DayName =  "";
		switch(day) {
		case 1: DayName = "Monday"; break;
		case 2: DayName = "Tuesday"; break; 
		case 3: DayName = "Wednesday"; break;
		case 4: DayName = "Thursday"; break; 
		case 5: DayName = "Friday"; break;
		case 6: DayName = "Saturday"; break;
		case 7: DayName = "Sunday"; break;
		default: DayName = "Ivalid, enter values 1-7 only";
		}
		
		return DayName;
		
	}
	
}
	
