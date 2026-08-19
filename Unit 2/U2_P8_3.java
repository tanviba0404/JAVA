//Write a java program to use final class.
final class TanviSecureData
{
    void showData()
    {
        System.out.println("Secure Confidential Records for Tanvi.");
    }
}

//class Tanvi extends TanviSecureData{}

public class U2_P8_3
{
    public static void main(String[] args)
    {
        TanviSecureData T = new TanviSecureData();

        T.showData();
    }
}