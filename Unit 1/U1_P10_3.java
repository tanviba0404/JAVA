//10.3 Write a java program of 1D array take manually values.
 
 public class U1_P10_3
 {
	 public static void main(String args[])
	 { 	 
		 int marks[]= new int[5];
		 marks[0]=90;
		 marks[1]=70;
		 marks[2]=80;
		 marks[3]=95;
		 marks[4]=85;
		 
		 System.out.println("Manually assigned array elements:");
		 for(int i=0;i<marks.length;i++)
		{
		  System.out.println(marks[i]+"");
		}
	 }
 }	 