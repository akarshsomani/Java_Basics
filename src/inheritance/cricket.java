package inheritance;

public class cricket extends insect
{
    double length;

    public cricket(int age, double length)
    {
        super(age, 8);
        this.length = length;
    }

    public void says()
    {
        System.out.println("CHIRP...");
    }

    public void jump()
    {
        System.out.println("A cricket jumped");
    }
}
