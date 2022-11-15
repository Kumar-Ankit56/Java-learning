import com.codewave.shape.*;

public class UsingPackage {
    public static void main(String[] args) {
        // Reactangle
        Reactangle r1 = new Reactangle(5, 9);
        int x = r1.area();
        int y = r1.getDim1();
        System.out.println("value of x "+ x);
        System.out.println("value of y " + y);
        Square r2 = new Square(5);
        int t1 = r2.area();
        int t2 = r2.getDim1();
        System.out.println("value of x "+ t1);
        System.out.println("value of y " + t2);
    }
}
