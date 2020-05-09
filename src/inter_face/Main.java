package inter_face;

import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        dog d = new dog();
        cat c = new cat();
        if(c instanceof cat)
        {
            c.play();
        }
        if(d instanceof dog)
        {
            d.play();
        }

        pet p;
        Random rand = new Random();
        int n = rand.nextInt(2);

        if(n==0)
        {
            p = new dog();
        }
        else
        {
            p = new cat();
        }

        p.play();
    }
}
