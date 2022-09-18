//Method overrinding simply means when we overwrite the base class fuction to the inherited class as we untill unless the base class doesn't declare with final keyword.
class base{
    public void meth1(){
        System.out.println("I am the fuction of the base class");
    }
}
class derived extends base{
    public void meth1(){
        System.out.println("I am the function from the derived class");
    }
}
public class Methodoverrriding {
 public static void main(String[] args) {
    base b1=new base();
    b1.meth1();
    derived d1 =new derived();
    d1.meth1();
 }   
}
