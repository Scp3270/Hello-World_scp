package Homework3;

import java.util.Scanner;

public class GreatestNumber {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your 1st value");
		int num1 = input.nextInt();
		
		System.out.print("Please enter your 2cd value");
		int num2 = input.nextInt(); 
		
		System.out.print("Please enter your 3rd");
		int num3 = input.nextInt();
		
		input.close();
		
		if (num1 > num2 && num1 > num3)
		{
			System.out.println("Your greatest number is " +num1);
		}
		else if(num2 > num1 && num2 > num3)
		{
			System.out.println("Your greatest number is " +num2);
		}
		else if(num3 > num1 && num3 > num2)
		{
			System.out.println("Your greatest number is " +num3);
		}
	}

}
