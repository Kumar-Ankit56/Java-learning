import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        try (Scanner sc = new Scanner(System.in)) {
            boolean flag = true;
            while (flag) {
                System.out.println("Enter the array Index");
                int ind = sc.nextInt();

                try {
                    System.out.println("Welcome to video number Exception");
                    try {
                        System.out.println(marks[ind]);
                        flag = false;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Sorry this array index is not exit");
                        System.out.println("Exception level at 2");
                    }

                } catch (Exception e) {
                    System.out.println("Some other expection");
                    System.out.println(e);
                }
            }
        }
        System.out.println("Thanks for using program");
    }
}
