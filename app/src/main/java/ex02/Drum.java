package ex02;

class Drum implements Playable
{
    private String drumType;
    public Drum(String drumType)
    {
        this.drumType = drumType;
    }

    @Override
    public void play()
    {
        System.out.println("The " + drumType + " drum is beating loudly");
    }

    public void hitWithSticks()
    {
        System.out.println("Hitting the drum with sticks!");
    }
}