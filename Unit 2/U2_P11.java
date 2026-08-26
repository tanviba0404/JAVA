abstract class Animal
{
    
    abstract void sound();
}


class Dog extends Animal
{
    // Overriding abstract method
    void sound()
    {
        System.out.println("Dog barks");
    }
}

public class U2_P11
{
    public static void main(String[] args)
    {
        Animal a = new Dog();
        a.sound();
    }
}