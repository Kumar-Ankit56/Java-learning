//display string character with space.
import java.util.*;
public class StringspaceL8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str="ab cd";
            for(int i=0;i<=str.length()-1;i++)
            {
        System.out.print(str.charAt(i)+" ");
            }
        }
    }
}
