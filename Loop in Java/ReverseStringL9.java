//Reverse of string
// public class ReverseStringL9 {
//     public static void main(String[] args) {
//         String sc="Ankit";
//         for(int i=sc.length()-1;i>=0;i--){
//             System.out.print(sc.charAt(i));;
//         }
//     }
// }


//Now a bit of modification is that store the reverse string in the new variable and print the reverse string only by printing the variable name
public class ReverseStringL9 {
    public static void main(String[] args) {
        String sc="Ankit";
        String reverse="";
        for(int i=sc.length()-1;i>=0;i--){
            reverse+=sc.charAt(i);
            //System.out.print(reverse);
        }
        System.out.print(reverse);
    }
}