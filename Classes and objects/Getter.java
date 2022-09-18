class Employee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    
    public void setName(String n){
        name=n;
    }
    public void settId(int i){
        this.id=1;
    }
    public int getId(){
        return id;
    }
}
public class Getter {
    public static void main(String[] args) {
        Employee Codewave=new Employee();

        Codewave.settId(24);
        Codewave.setName("Ankit");

       String y=Codewave.getName();
        int z=Codewave.getId();

        System.out.print(y);
        System.out.print(z);
    }
}
