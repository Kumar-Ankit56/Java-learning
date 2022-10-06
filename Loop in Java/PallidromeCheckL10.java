// public class PallidromeCheckL10 {
//     public static void main(String[] args) {
//         String sc="noon";
//         String reverse="";
//         for(int i=sc.length()-1;i>=0;i--){
//             reverse+=sc.charAt(i);
//         }
//         System.out.print(reverse);
//         if(sc==reverse){
//              System.out.print("Pallidrome");
//         }
//     }
// }


public class PallidromeCheckL10 {
    public static void main(String[] args) {
        String sc="noon";
        boolean isPallidrome=true;
        int j=sc.length()-1;
        for(int i=0;i<j;i++){
            if(sc.charAt(i)==sc.charAt(j)){
                j--;
                continue;
            }
           isPallidrome=false;
            
            
        }
        System.out.print(isPallidrome?"Pallidrome":"not a Pallidrome");
    }
}

// Can be written as for(int i=0;j=str.length()-1;i<j;i++,j--)