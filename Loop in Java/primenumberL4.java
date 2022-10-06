//PRoblem statement like user will enter the positive interger and it will be check up whether it is prime number or not.
// import java.util.Scanner;

// public class primenumberL4 {
//     public static void main(String[] args) {
//         try (Scanner s = new Scanner(System.in)) {
//             System.out.print("Enter the number :");
//             int n=s.nextInt();
//             int sum=0;
//             for(int i=1; i<=n/2;i++){
//                 if(n%i==0){
//                     sum+=i;
//                     //Strict divisior of number will be
//                     //System.out.print(i + " ");
//                 }
//             }
//             System.out.println(sum==1?"prime number":"not the prime number");
//         }
//     }
// }


//2nd apporach of doing this is
//iterate over all the possible divisors except 1 and N
//if i is a divisor of N, then N is not prime
import java.util.Scanner;

public class primenumberL4 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the number :");
            int n=s.nextInt();
            boolean isPrime=true;
            for(int i=2; i<=n/2;i++){
                if(n%i==0){
                  isPrime=false;
                  break;
                }
            }
            System.out.print(isPrime?"Prime number":"Not a prime number");
        }
    }
}