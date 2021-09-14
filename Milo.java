import java.awt.Color;
public class Milo
{
    public static void main(String[] args)
    {
        World earth = new World();
        Turtle milo = new Turtle(earth);
        milo.setPenColor(Color.GREEN);
        milo.penUp();
        milo.moveTo(300,200);
        milo.penDown();
        milo.moveTo(400,200);
        milo.turn(
        for (int i = 0; i < 4; i++) {
            milo.turn(72);
            milo.forward(100);
        }        
    }
}