class Base{
    public int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I am in base and setting x now");
        this.x=x;
    }
    public void printMe(){
        System.out.println("I am constructor");
    }
}
class Derived extends Base{
    public int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
}
public class IntroInheritance {
    public static void main(String[] args) {
        Base b=new Base();
        b.setX(45);
        System.out.println(b.getX());

        Derived d=new Derived();
        d.setY(34);
        System.out.println(d.getY());
        d.printMe();
    }
}
