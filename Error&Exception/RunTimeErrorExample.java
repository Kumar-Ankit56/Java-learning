import java.util.Scanner;

/**
 * RunTimeError
 */
public class RunTimeErrorExample {

    public static void main(String[] args) {
        //Syntax Error Ide doen't give any clue to resolve this type of error to user.
        // System.out.println(2);
        // for(int i=1;i<5;i++){
        //     System.out.println(2*i+1);
        // }


        //Run time Error
        int k;
        try (Scanner sc = new Scanner(System.in)) {
            k=sc.nextInt();
            System.out.println("Interger part of 1000 divided by k is"+1000/k);
        }
    }
}