package inheritance;

public class insect {

    int age;
    int numberOfLegs;

    public insect(int age, int numberOfLegs)
    {
        this.age = age;
        this.numberOfLegs = numberOfLegs;
    }

    public void says()
    {
        System.out.println("...");
    }

    public void crawl()
    {
        System.out.println("The Insect Crawled");
    }

}
