//Calculte the fibonacci series of enter the number;
import java.util.Scanner;
public class FibonacciL7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the positive number :");
            int n = sc.nextInt();
            int result=0;
            int v1=1;
            int v2=1;
            for(int i=1;i<=n;i++){
                result = v1+v2;
                v1=v2;
                v2=result;
                // System.out.print(i);
            }
            System.out.print(result==0?1:result);
        }
    }
    
}

//Point to be noted is 
// To get the nth fibonacci number we need n-2 steps
// like when you want to fibonacci of 4th step then we need 2 operation.


