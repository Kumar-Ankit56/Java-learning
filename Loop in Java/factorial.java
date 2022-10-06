import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        int num, fact=1;
           System.out.println("Enter your desired Number :");
           num=sc.nextInt();
           for(int i=1;i<=num;i++ ){
            fact=fact*i;
           }
           System.out.println("Factorial of your " +num+ " is " + fact);
    }
    }
}
