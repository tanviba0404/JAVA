public class U3_P2
{
    public static void main(String[] args)
    {
       try
       {
         int[] tanvibaScores = new int[3];
        tanvibaScores[0] = 95;
        tanvibaScores[1] = 90;
        tanvibaScores[2] = 85;

        tanvibaScores[5] = 100;
       }

    catch(ArithmeticException e)
    {
        System.out.println("Airthmetic error ocurred.");
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Array index error: Tanviba accessed an invalid index!");
    }
    catch(Exception e)
    {
        System.out.println("General exception handler:" + e);
    }
    }
}