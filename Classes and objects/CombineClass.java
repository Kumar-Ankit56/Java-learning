class Employee {
    int salary;
    String name;
     public int getsalary(){
 return salary;
     }
     public String getName(){
        return name;
     }
     public void setName(String n){
        name=n;
     }
}
class cellPhone{
    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrate(){
        System.out.println("Vibrating..");
    }
    public void callFriend(){
        System.out.println("Calling Ankit...");
    }
}
class Square{
    int side;
    public int area(){
      return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
public class CombineClass {
    public static void main(String[] args) {
        //Problem !1
        Employee Ankit =new Employee();
        Ankit.setName("CodewithHarry");
        Ankit.salary=233;
        System.out.println(Ankit.getName());
        System.out.println(Ankit.getsalary());

        cellPhone samsung=new cellPhone();
        samsung.callFriend();
        samsung.vibrate();
        samsung.ring();

        Square sq=new Square();
        sq.side=3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        Tommy player1=new Tommy();
        player1.fire();
        player1.run();
        player1.hit();
    }
}
