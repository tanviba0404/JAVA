// Write a java program to use Finally block in Exception Handling.
public class U3_P3
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Tanviba opening database connection....");
            int data=25/5;
            System.out.println("Data calculated: " + data);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception caught.");
        }
        finally
        {
            System.out.println("FINALLY BLOCK: Closing Tanviba's database connection guaranteed!");
        }
    }
}
