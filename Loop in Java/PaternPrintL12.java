// import java.util.Scanner;

// public class PaternPrintL12 {
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             for (int i = 1; i <= n; i++) {
//                 for (int j = 1; j <= n - i; j++) {
//                     System.out.print(" ");
//                 }
//                 for (int j= 1; j <= i; j++) {
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }
//         }
//     }
// }



import java.util.Scanner;

public class PaternPrintL12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j= 1; j <= 2*i-1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
