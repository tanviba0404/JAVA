//Write a java program to use final method.
class TanviPolicy
{
    final void verfiyIdentity()
    {
        System.out.println("Student Tanvi Identity Verified via biometrics.");
    }
}

class AdvancedStudent extends TanviPolicy
{
    //void verfiyIdentity(){}
}

public class U2_P8_2
{
    public static void main(String[] args)
    {
        AdvancedStudent a = new AdvancedStudent();

        a.verfiyIdentity();
    }
}