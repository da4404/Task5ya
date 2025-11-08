package ex02;

class Guitar implements Playable
{
    private int numberOfStrings;

    public Guitar(int numberOfStrings)
    {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play()
    {
        System.out.println("The guitar is playing a soft melody on " + numberOfStrings + " strings.");
    }

    public void tune()
    {
        System.out.println("Tuning the guitar...");
    }
}