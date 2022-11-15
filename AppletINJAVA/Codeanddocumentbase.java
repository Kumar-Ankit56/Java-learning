import java.applet.*;
import java.awt.*;
import java.net.URL;
public class Codeanddocumentbase extends Applet {
   public void paint(Graphics g){
      String msg;
      URL url=getCodeBase();
      msg="Codebase"+url.toString();
      g.drawString(msg, 50, 50);
      url=getDocumentBase();
      msg="DocumentBase"+url.toString();
      g.drawString(msg, 50, 50);
   }
}

