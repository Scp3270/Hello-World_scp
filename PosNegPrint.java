package Homework3;

import java.util.Scanner;

public class PosNegPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int a;
			Scanner input = new Scanner(System.in);
			System.out.print("Please insert value");
			a = input.nextInt();	
			input.close();
			
			if (a<0) {
				
				System.out.println("The value you have entered is a negative number");
			}
			
			else if(a>0) {
				
				System.out.println("The value you have entered is a positive number");
			}
			
			System.out.println("Thank you");
			
	}
		
	
}

