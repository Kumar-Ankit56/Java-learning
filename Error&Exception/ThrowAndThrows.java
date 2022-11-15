//Both are keyword in java let undestand why it is use in the program
class NegRadiusException extends Exception {
    public String toString(){
        return "Radius can't be negative";
    }
}

public class ThrowAndThrows {
    public static double area(int r) throws NegRadiusException {
        if (r < 0) {
            throw new NegRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    // public static int divide(int a,int b) throws ArithmeticException{
    // int result =a/b;
    // return result;
    // }
    public static void main(String[] args) {
        // try {
        // int c=divide(2, 0);
        // System.out.println(c);
        // }
        // catch(Exception e){
        // System.out.println("Exception");
        // }
        try {
            double ar = area(8);
            System.out.println("Area of circle is "+ar);
        } catch (NegRadiusException e) {
            System.out.println(e.toString()); 
        }

    }
}
