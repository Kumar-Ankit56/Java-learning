class Base{
    public int x;
    Base()
    {
        System.out.println("I am constructor of base class");
    }
    Base(int x){
        System.out.println("I am constructor of BASE class with the value of x is "+x);
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
}
class Derived extends Base{
    public int y;
    Derived()
    {
        System.out.println("I am constructor of Derived class");
    }
    public Derived(int x, int y2) {
        super(x);
        System.out.println("I am constructor of childDerived class with the value of y is "+y2);
    }
    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y=y;
    }
}
class childDerived extends Derived{
    public int zz;
    childDerived(){
        System.out.println("I am constructor of childDerived class");
    }
    childDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am constructor of childchildDerived class with the value of z is " +z);
    }
  public void setzzvalue(int z){
   this.zz=z;
  }

}
public class ConstructorInInheritance {
    public static void main(String[] args) {
        // /-----------BaseClass object declaration----------------------/
        // Base b1=new Base();
        // b1.setX(45);
        // System.out.println(b1.getX());

        //Note if Base class has constructor and derived has not then while making the object of base and derived derived will call the constructor of base class.
        //If base class has constructor and hasn't declare any object and derived class is inherit from the base class so firsly it will call the base class constructor then derived class.
 
        // DerivedClass object declaration
        // Derived d1 =new Derived();
        // d1.sety(56);
        // System.out.println(d1.gety());
   
        // -----------Child class object declaration-----------------------
        childDerived ch=new childDerived(24, 56, 26);
        ch.setzzvalue(12);
    }
}
