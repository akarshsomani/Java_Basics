package inheritance;

public class spider extends insect
{
    boolean isPoisonous;

    public spider(int age, boolean isPoisonous)
    {
        super(age, 8);
        this.isPoisonous = isPoisonous;
    }

    public void says()
    {
        System.out.println("HISS...");
    }
}
