// Write a java program to use abstract class.
abstract class animal
{
    abstract void animalsound();

    void sleep()
    {
        System.out.println("zzzzzzzzzzzzzzzz");
    }
}

class doggie extends animal
{
    void animalsound()
    {
        System.out.println("Dog says:WOOF! WOOF!");
    }
}

class U2_P7
{
    public static void main(String[] args)
    {
        doggie t = new doggie();
        t.animalsound();
        t.sleep();
    }
}