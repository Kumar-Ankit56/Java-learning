public class Theforloop {
    public static void main(String[] args) {
      int i; //This is declare outside of the loop so we can access any where from the program
    //   ++i and i++ both are same
      for (i = 1; i<= 5; i++) {
        System.out.println("Hello " + i);
      }
      System.out.println(i);
    }
}
