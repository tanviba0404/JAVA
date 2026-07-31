//11.3 Write a java program of 2D array and take value from user.

import java.util.Scanner;

public class U1_P11_3
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		
		int scores[][] = new int[3][3];
		
		 for(int i=0;i<3;i++)
		{
		  for(int j=0;j<3;j++)
		  {
			  System.out.println("Enter scores of student "+(i+1)+" in subject "+(j+1)+":");
			  scores[i][j]=scn.nextInt();
		  }
		}
		
		System.out.println("\n Scores are:");
		for(int i=0;i<3;i++)
		{
		  for(int j=0;j<3;j++)
		  {
			  System.out.print(scores[i][j]+" ");
			  
		  }
		  System.out.println();
		}
			
		scn.close();
	}
}	