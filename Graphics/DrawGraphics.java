import java.awt.*;
import java.applet.*;

public class DrawGraphics extends Applet{
    public void init(){
        setBackground(Color.black);
        setForeground(Color.white);
    }
    public void paint(Graphics g){
        int x[]={200,250,280,290,200,150};
        int y[]={100,200,300,400,500,450};
        g.setColor(Color.red);
        g.setFont(new Font("Arial",1,20));
        g.drawString("Welcome to AIT", 40, 50);
        g.setColor(Color.green);
        g.drawRect(40, 70, 100, 40);
        g.setColor(Color.orange);
        g.fillRect(40, 120, 100, 40);
        g.setColor(Color.gray);
        g.drawOval(40, 170, 30, 60);
    }
}