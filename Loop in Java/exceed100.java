import java.util.Scanner;

//Problem statement Write a program which reads asequence of integers from the user and stops by displaying: " Done" when the sum of these values exceeds 100.
public class exceed100{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int  sum=0;
            while(sum<=100){
                System.out.println("Enter the number");
                sum+=sc.nextInt();
            }
            System.out.print("Done " + sum);
        }
    }
}
