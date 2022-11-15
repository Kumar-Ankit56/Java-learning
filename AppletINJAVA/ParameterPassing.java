import java.applet.*;
import java.awt.*;
public class ParameterPassing extends Applet {
    private String defaultMessage="Hello";

    public void paint(Graphics g){
        String s1=this.getParameter("site");
        if(s1==null){
            s1=defaultMessage;
        }
        g.drawString(s1, 50, 50);
    }
}
