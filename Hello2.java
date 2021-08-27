import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Hello2
{
    public static void main(String[] args) throws Exception 
    {
        URL imageLocation = new URL( "https://ih1.redbubble.net/image.2366667992.3298/st,small,507x507-pad,600x600,f8f8f8.jpg");
        JOptionPane.showMessageDialog( null,"Hi", "Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
    
}
