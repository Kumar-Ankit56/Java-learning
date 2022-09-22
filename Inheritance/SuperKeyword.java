/**
 * SuperKeyword
 */
class FirstClass{
    int a;
    public int getx(){
        return a;
    }
    FirstClass(int a){
        this.a=a;
    }
    public int returnNone(){
        return 1;
    }
}
class SecondClass extends FirstClass{
    SecondClass(int c){
        super(c);
        System.out.println("I am a constructor");
    }
}
public class SuperKeyword {
   public static void main(String[] args) {
    FirstClass e = new FirstClass(45);
    SecondClass d=new SecondClass(34);
     System.out.println(d.getx());
   }  
}