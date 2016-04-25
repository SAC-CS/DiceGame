
package dicegame;

import java.util.Scanner;
public class DiceGame {

    public static void main(String[] args) 
    {
        boolean restart = true;
        Scanner scan = new Scanner(System.in);
        Dice rolledNumber = new Dice(); 
        Dice numberGuessed = new Dice();
        
        while(restart)
        {
            System.out.println("How Many Die Do You Want to Roll");
            int numberOfDie = scan.nextInt();

            rolledNumber.rollNumber(numberOfDie, 6, 1);

            System.out.println("What Number Did It Roll On?");
            int playerGuess = scan.nextInt();
            numberGuessed.compareOutcome(playerGuess);

            String replay = scan.next();
            if (replay.equalsIgnoreCase("yes"))
            {
                restart = true;
            }
                else if (replay.equalsIgnoreCase("no"))
            {
                restart = false; 
            }
        }
        
        
                
    }
    
}
