import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class BasicCalculator extends Applet{
    Label L1,L2,L3;
    TextField T1,T2;
    Button b1;
    public void init(){
        L1=new Label("First Name");
        L2=new Label("Second Number");
        L3=new Label();
        T1=new TextField();
        T2=new TextField();
        b1=new Button("Add");
        setLayout(null);
        L1.setBounds(30, 100, 100, 20);
        T1.setBounds(30, 150, 100, 20);
        L2.setBounds(150, 100, 100, 20);
        T2.setBounds(150, 150, 100, 20);
        b1.setBounds(100, 180, 100, 20);
        L3.setBounds(30, 190, 100, 20);
        add(L1);
        add(L2);
        add(T1);
        add(T2);
        add(b1);
        add(L3);
        b1.addActionListener(new MyHandler());
    }
    public class MyHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int a,b,c;
            a=Integer.parseInt(T1.getText());
            b=Integer.parseInt(T2.getText());
            c=a+b;
            L3.setText("Sum is "+c);
        }
    }
}