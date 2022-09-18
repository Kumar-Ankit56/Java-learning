class myEmployee{
    private int id;
    private String name;

    public myEmployee(){
        id=0;
        name="Your name here";
    }

    public myEmployee(String myName, int myId){
        id=myId;
        name=myName;
    }
    public myEmployee(String myName){
        id=1;
        name=myName;
    }
    public int getId(){
        return id;
    }

    public String getname(){
        return name;
    }
}
public class ConstructorType {
    public static void main(String[] args) {
        myEmployee Ankit=new myEmployee("Codewave");
        myEmployee Ankit1=new myEmployee("Ankit", 24);
        System.out.println(Ankit.getId());
        System.out.println(Ankit1.getId());
        System.out.println(Ankit.getClass());
        System.out.println(Ankit1.getClass());
    }
}
