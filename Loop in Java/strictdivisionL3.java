import java.util.Scanner;

public class strictdivisionL3 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the number :");
            int n=s.nextInt();
            int sum=0;
            for(int i=1; i<=n/2;i++){
                if(n%i==0){
                    sum+=i;
                    //Strict divisior of number will be
                    //System.out.print(i + " ");
                }
            }
            System.out.println(sum+n);
        }
    }
}
