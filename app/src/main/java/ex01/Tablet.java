package ex01;

class Tablet implements Chargeable
{
    private String name;
    private int batteryLevel;
    public Tablet(String name)
    {
        this.name = name;
        this.batteryLevel = 40;
    }

    @Override
    public void charge()
    {
        batteryLevel = 80;
        System.out.println("The tablet is not fast Battery level: " + batteryLevel + "%");
        System.out.println(name + " is charging with low charge ");
    }
    public void watchVideo(String title)
    {
        System.out.println("Watching video: " + title);
    }

}
