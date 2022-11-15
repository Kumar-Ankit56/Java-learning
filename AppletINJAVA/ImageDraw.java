import java.applet.*;
import java.awt.*;
public class ImageDraw extends Applet {
   Image img1;
   public void init(){
    img1=getImage(getCodeBase(), "react.jpg");
   }
   public void paint(Graphics g){
    g.drawImage(img1, 10, 10, this);
   }
}

