package inheritance;

public class Main {

    public static void main(String[] args)
    {
        insect in = new insect(5,6);
        spider sp = new spider(13, true);
        cricket cr = new cricket(2, 1.25);

        in.crawl();
        in.says();

        sp.crawl();
        sp.says();

        cr.crawl();
        cr.says();
        cr.jump();

        if(sp instanceof insect && sp instanceof spider)
        {
            System.out.println("sp is a spider insect");
        }
    }
}
