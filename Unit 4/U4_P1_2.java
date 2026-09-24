class Tanvi implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("From Thread Tanviba: i =" + i);
        }
        System.out.println("Exit from Thread Tanviba");
    }
}
class Diyu implements Runnable
{
    public void run()
    {
        for(int j=1;j<=5;j++)
        {
            System.out.println("From Thread Diya: j =" + j);
        }
        System.out.println("Exit from Thread Diya");
    }
}
class Rudri implements Runnable
{
    public void run()
    {
        for(int k=1;k<=5;k++)
        {
            System.out.println("From Thread Rudriba: k =" + k);
        }
        System.out.println("Exit from Thread Rudriba");
    }
}
public class U4_P1_2
{
    public static void main(String args[])
    {
        Tanvi t2 = new Tanvi();
        Diyu d2 = new Diyu();
        Rudri r2 = new Rudri();

        Thread ta = new Thread(t2);
        System.out.println("Thread Tanvi Started.");
        ta.start();

        Thread tb = new Thread(d2);
        System.out.println("Thread Diyu Started.");
        tb.start();

        Thread tc = new Thread(r2);
        System.out.println("Thread Rudri Started.");
        tc.start();
    }
}
