package ex01;

class Laptop implements Chargeable
{
    private String programName;
    private int batteryLevel;


    public Laptop(String programName)
    {
        this.batteryLevel = 13;
        this.programName = programName;
    }

    @Override
    public void charge()
    {
        batteryLevel = 14;
        System.out.println("the leptop have a bad chager battery Level " + batteryLevel + "%");
    }

    public void runProgram()
    {
        System.out.println("Running program: " + this.programName);
    }
}