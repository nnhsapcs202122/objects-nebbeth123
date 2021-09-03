/**
 * Exploring the String class and its methods.
 *
 * @author andy chen 
 * @version 9/3/2021
 */
public class StringExplorer
{
    public static void main(String[] args)
    {
        String river = new String("Mississippi");
        String river2 = "Mississippi"; 
        river = "Nile";
        System.out.println(river);
        System.out.print(river2);
        
        
        river.replace("i", "x");
        System.out.println(river);
        
        /*
         * The replace method returns a refercnce to a new String. 
         *  It does not change the String object on which it is invoked.
         *  
         *  The String class has to mutator methods. It is not posible to change a String object. 
         *  
         *  String are immutable.   
         */
        
        String riverX = river.replace("i", "x");
        System.out.print(riverX);
        System.out.print(riverX);
        
    }
}
