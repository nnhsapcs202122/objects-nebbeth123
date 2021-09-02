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
        /*
         * Objects are entities in a program.
         *  objects have attributres.
         *  objects are manipulated by methods. 
         *  
         * ocean and crush are variables that reference obejcts.
         * 
         * Classes describe a collection of objects. 
         *  all objects of a class have the same behavior (methods)
         *  and types of attributes (but they may have different values.)
         *  
         * world and turtle and classes. 
         */
        
        World ocean = new World();
        
        /*
         * We ues the operator to construct (create, instantiate) an object.
         * 
         * the class of the object is specified immediately after the new operator (e.g. Turtle).
         * 
         * If we need to pass additional information to construct the object,
         *      arguments are specified in parentheses after the class (e.g. ocean) 
         *      
         */
        
        Turtle crush = new Turtle(ocean);
        
        /*
         * variables store values to be used alter.
         * 
         *      variable have a type (e.g. int), a name (e.g. width), and a value (e.g. 20)
         */
        
        int width; // declaring a variable 
        width =20; // assigning a value to a variable
        
        /*
         * Java has several primitive data types:
         *      boolean holds a true or false value 
         *      int holds an integer number
         *      double holds a real number (floating point) 
         *      char holds a single character
         */
        
        // here is a boolean 
        boolean isSummer = true;    // or false
        
        // here is a double 
        double salesTaxRate = 0.075;
        //salesTaxRate = 0.075;
        
        // here is a char
        char letter = 'c';
        
        /*
         * When invoking methods, we use the dot operator (i.e., '.')
         *      to invoke a methon on an object
         * some methods take no arguments, but we still have parentheses (e.g., penDown)
         * 
         * Some methods take one or more arguments (e.g., forward(200))
         * 
         * Mutator methods modify the state(e.g., values of the attriibutes) of the object.
         *      penDown, forward, setPenColor are all mutator methods. 
         */
        crush.penDown();
        crush.forward(25);
        crush.setPenColor(Color.RED);
        crush.forward(30);
        
        Color white = new Color(225,225,225); // defining your own color exmaple
        
        /*
         * Accessor method returns the value of an attribute of the object. 
         *      The state of the object does not change.
         *      
         *      getPenwidth() is an accessor method. 
         */
        
        int penWidth = crush.getPenWidth();
        System.out.println(penWidth); 
    }
}
                                                                                                                                                                                                                 