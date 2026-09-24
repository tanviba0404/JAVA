class Tanviba extends Thread
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
class Diya extends Thread
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
class Rudriba extends Thread
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
public class U4_P1_1
{
    public static void main(String args[])
    {
        Tanviba t1 = new Tanviba();
        t1.start();
        Diya d1 = new Diya();
        d1.start();
        Rudriba r1 = new Rudriba();
        r1.start();
    }
}