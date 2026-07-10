
//4.2 Write a java program to perform different arithmetic operations without using command line args.

import java.util.Scanner;
 public class ArithmeticOperations
 {
	 public static void main(String args[])
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter first no.: ");
		 int num1 = sc.nextInt();
		  
		  System.out.println("Enter second no.: ");
		  int num2 = sc.nextInt();
		 
		 int addition = num1 + num2;
		 int subtraction = num1 - num2;
		 int multiplication = num1 * num2;
		 int divison = num1 / num2;
		 int modulus = num1 % num2;
		 
		  System.out.println("Addition : " + addition);
		  System.out.println("Subtraction : " + subtraction);
		  System.out.println("Multiplication : " + multiplication);
		  System.out.println("Divison : " + divison);
		  System.out.println("Modulus : " + modulus);
		  
		  sc.close();
	 }
 }	 
