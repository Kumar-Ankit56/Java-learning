

/**
 * 1stCoustomClass
 */

class Employee{
    int id;
    int salary;
    String name;
    public  void printDetails() {
        System.out.println("My id is " + id);
        System.out.println("and my name is " +name);
    }
    public int getSalary(){
        return salary;
    }
}
public class firstCoustomClass {
  public static void main(String[] args) {
    System.out.println("This is our custom class");;
    Employee ankit=new Employee();
    Employee jhone=new Employee();

    ankit.id=12;
    ankit.salary=23;
    ankit.name="Ankit";

    jhone.id=121;
    jhone.salary=213;
    jhone.name="Jone";


    ankit.printDetails();
    jhone.printDetails();

    int salary =jhone.getSalary();
    System.out.println(salary);
  }
    
}