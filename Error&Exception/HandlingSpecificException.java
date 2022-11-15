import java.util.Scanner;

public class HandlingSpecificException {
    public static void main(String[] args) {
        int [] marks=new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the array Index");
            int ind =sc.nextInt();

            System.out.println("Enter the number you want to divide the value with");
            int number=sc.nextInt();

            try {
                System.out.println("The value at array index entered is "+marks[ind]);
                System.out.println("The value at array index/value is "+marks[ind]/number);
                
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException");
                System.out.println(e);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException");
                System.out.println(e);
            }
            catch (Exception e) {
                System.out.println("Some other expection");
                System.out.println(e);
            }
        }
        
        
    }
}
