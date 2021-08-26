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
        
        // this is not a valid identifier
        //int 2y;
        
        /*
         * identifiers are case sensitive (case matters)
         * 
         * these are all differnet identifiers
         */
        
        Turtle squirt, SQUIRT, sQuIRt; 
        
        /*
         * By convention, constants are alll uppercase.
         *  use an underscore to seperate words.
         */
        
       int SPEED_OF_LIGHT = 300000000;
       
       /*
        * by convention, most other identifiers start with a lowercase letter. 
        *   subsequent words start with an uppercase letter. (camalcase)
        */
       
       World pacificOcean;
       
       /*
        * this a compile-time error. (this code doesn't even compile)
        * 
        * this is often a syntax error.
        */
       
       //crush.forwad(50);
       
       /*
        * this is a run-time error. (this code compiles and runs, but generates an excpetion) 
        *   in most cases the program crashes
        */
       
       //crush.forward(1/0);
       
       /*
        * This is also a run-time error. (this code compiles and runs,
        *   but it does not produce the exected output.)
        *   
        * More specifically, this is a logical error as the turtle turns right instead of left.
        * 
        */
       //have the turtle turn left and move forward 50 
       crush.turn(90);
       crush.forward(50);
    }
    public static void drawLine()
    {
        
    }
}
                                                                                                                                                                                                                 