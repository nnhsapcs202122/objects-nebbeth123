import java.util.Random;

public class dieSimulatoir
{
    public static void main(String[] args)
    {
        Random number = new Random();
        int x = number.nextInt(6);
        x = x + 1;
        System.out.println(x);
        
    }
}
