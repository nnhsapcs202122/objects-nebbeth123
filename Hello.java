    import javax.swing.JOptionPane;
public class Hello
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println("Hello,"+ name +"!");
    }
}