import java.util.Random;
import java.util.Scanner;

/**
 * Rock-Paper-Scissor
 */
public class RockPaperScissor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number the rock and paper and scissor as 0,1,2");
            int userinput=sc.nextInt();
            Random random = new Random();
            int ComputerInput=random.nextInt(3);

            if(userinput==ComputerInput){
                System.out.println("Draw");
            }
            else if(userinput==0 && ComputerInput==2 || userinput==1 && ComputerInput==0||userinput==2 && ComputerInput==1){
                System.out.println("You win");
            }
            else{
                System.out.print("Computer win!");
            }
            if(ComputerInput==0){
                System.out.println("Computer choice:Rock");
            }
            else if(ComputerInput==1){
                System.out.println("Computer choice : Paper");
            }
            else{
                System.out.println("Computer choice : Scissor");
            }
        }
        
        
    }
}