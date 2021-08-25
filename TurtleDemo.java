import java.awt.Color;

/*
every java program comtains one or more classes(e.g., TurtleDemo).

in general, every source file (e.g. Turtledemo.java) contains one class (e.g., TurtleDemo)

The source file must match the class name.

By convention, class names start with an uppercase letter.
 */

public class TurtleDemo
{
    /*
     * a class contains methods.
     * 
     * most java programs contain a class with a main method. 
     * 
     * the main method is executed when the program starts.
     */
    public static void main(String[] args)
    {
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        crush.setPenColor(Color.ORANGE);
        crush.penDown();
        crush.forward(50);
        
        /* 
         * a method contains statements 
         * 
         * statements may invoke other methods (e.g., forward)
         * 
         * in general, methods are invoked on objects (e.g., crush)
         * 
         * when invoking the mthod, arguments are passed in the parenthaseses (e.g. 50)
         */
        int y, x2 ,x_y, x$;
    }
}
