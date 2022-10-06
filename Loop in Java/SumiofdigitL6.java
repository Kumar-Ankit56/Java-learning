import java.util.Scanner;

//Suppose a user enter any number then our Job is calculte it's digit sum.
public class SumiofdigitL6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int sum=0;
            System.out.println("Enter the number :");
            int n = sc.nextInt();
            while(n>0){
                sum+=n%10;
                n/=10;
            }
            System.out.print(sum);
        }
    }
}
