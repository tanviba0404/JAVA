class InvalidStudentMarksException extends Exception
{
    public InvalidStudentMarksException(String message)
    {
        super(message);
    }
}

public class U3_P6
{
    static void validateTanvibaMarks(double marks) throws InvalidStudentMarksException
    {
        if(marks<0.0||marks>100.0)
        {
             throw new InvalidStudentMarksException("Marks must be between 0 and 100! Input was: " + marks);
        }

        else 
        {
            System.out.println("Tanviba's marks validate successfullly.");
        }

    }

    public static void main(String args[])
    {
         try
         {
            System.out.println("Submitting exam score for Tanviba...");
            validateTanvibaMarks(105.5);

         }
         catch(InvalidStudentMarksException e)
         {
             System.out.println("Custom exception caught:" + e.getMessage());
         }
    }
}
