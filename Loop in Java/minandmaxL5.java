import java.util.Scanner;

//PRoblem statement 
//Here user will enter the positive interger continously untill there is not negative number as long as he enter the negative value it is job of the user to display the minimum and maximum from the entered value.
public class minandmaxL5 {
    public static void main(String[] args) {
         try (Scanner s = new Scanner(System.in)) {
            int n=s.nextInt();
            int max=n;
            int min=n;
            if(n>=0){
                while(true){
                    n=s.nextInt();
                    if(n<0){
                      break;
                    }
                    max=n>max?max=n:max;
                    min=n<max?min=n:min;
                    // if(n>max){
      
                    //   max=n;
                    // }
                    // if(n<min){
                    //   min=n;
                    // }
                  }
                  System.out.println("min :" +min + " "+ "max :"+max);
            }
            else{
            System.out.print("n is invalid number");
            }
        }
         
    }
}
