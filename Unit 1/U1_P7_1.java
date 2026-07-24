//7.1 Write a java program to use IF condition.
   
   import java.util.Scanner;
   
   public class U1_P7_1
   {
	   public static void main(String args[])
	   {
		   Scanner scn = new Scanner(System.in);
		   
		   System.out.println("Enter number:");
		   int num = scn.nextInt();
		   
		   if(num>0)
		   {
			  System.out.println("Positive number");  
		   }
		   
		   
		   scn.close();
	   }
   }   
