import java.awt.Rectangle;

public class Rectangle2
{
    public static void main(String args[])
    {
        Rectangle r1 = new Rectangle(0,0,10,10); 
        r1.add(1,1);
        System.out.println(r1);
        r1.contains(1,1);
    }
}