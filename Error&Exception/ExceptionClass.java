import java.util.Scanner;

class myException extends Exception{
    
    public String toString(){
        return "I'm to String";
    }
    public String getMessage(){
        return "I'm getMessage()";
    }
}
class MaxAgeException extends Exception{
    public String toString(){
        return "Age cannot be Less than 18";
    }
    public String getMessage(){
        return "Make sure that the value enter for the age is correct";
    }
}
public class ExceptionClass {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a;
            System.out.println("Enter the value of number: ");
            a=sc.nextInt();
            if(a>9){
                try {
                    throw new myException();
                } catch (myException e) {
                    System.out.println(e.getMessage());
                    System.out.println(e.toString());
                    e.printStackTrace();
                    System.out.println("Finished");
                }
                System.out.println("Yes it is finished");
            }

            System.out.println("Enter the age of person for accessibility of Driving Licence");
            int age=sc.nextInt();
            
            if(age<18){
                try {
                    throw new MaxAgeException();
                } catch (MaxAgeException e) {
                    System.out.println(e.getMessage());
                    System.out.println(e.toString());
                    e.printStackTrace();
                    System.out.println("Finished");
                }
                System.out.println("Yes it is finished");
            }
            else{
                System.out.println("Thanks your age are eligiable");
            }
        }
        
    }
    
}
