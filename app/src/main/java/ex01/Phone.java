package ex01;

class Phone implements Chargeable
{
    private String model;
    private int batteryLevel;


    public Phone(String model)
    {
        this.model = model;
        this.batteryLevel = 20;
    }

    @Override
    public void charge()
    {
        batteryLevel = 100;
        System.out.println("The phone is fully charged! Battery level: " + batteryLevel + "%");
    }

    public void call(String contact)
    {
        System.out.println(model + " is calling ringringgggggg ");
    }
}
