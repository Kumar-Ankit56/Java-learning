import java.util.Random;

public class RandomNumbergenerate {
    public static void main(String[] args) {
        Random random=new Random();
        int compint=random.nextInt(6);
        System.out.print(compint);
    }
}
