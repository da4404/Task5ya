package ex01;

public class Main
{
    public static void main(String[] args)
    {
        Chargeable[] devices = {new Phone("iPhone 15"),
                new Tablet("iPad Pro"),
                new Laptop("java code")
        };

        for (Chargeable device : devices)
        {
            device.charge();
        }
    }
}