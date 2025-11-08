package ex02;

class Piano implements Playable
{
    private String keys;

    public Piano(String keys)
    {
        this.keys = keys;
    }

    @Override
    public void play()
    {
        System.out.println("The piano is playing a beautiful harmony with " + keys + " keys.");
    }

    public void pressPedal()
    {
        System.out.println("Pressing the piano pedal for a softer sound.");
    }
}