class This{
    public int x;
    //This keyword used to refereance the local variable of the class as if the passed parameter is same as local varible of class then it help us to distiguise between them. here this simply referance the calling object in the program.
    This(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }
    public void printX(){
        System.out.println("You have enter the following value of x " +x);
    }
}
public class Thisandsuperkeyword {
    public static void main(String[] args) {
        int a;
        This obj =new This(45);
        obj.printX();
        a=obj.getX();
        a=a+54;
        System.out.println("The value of x while adding new value to is as a:"+a);
    }
}
