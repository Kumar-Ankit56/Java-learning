/**
 * IntroInheritance
 */
class Base{
    public int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I'm in base and setting x now");
        this.x=x;
    }
}
class Derived extends Base{
    public int y;
     public int getY(){
        return y;
     }
     public void setY(int y){
        System.out.println("I'm in the derived and setting y now");
        this.y=y;
     }
}
public class IntroInheritance {
    public static void main(String[] args){
       Base b1=new Base();
       b1.setX(45);
       System.out.println("This is what you have set the value for base class " + b1.getX());

       Derived d1=new Derived();
       d1.setY(65);
       System.out.println("This is what you have set the value for base class " + d1.getY());
    }
}