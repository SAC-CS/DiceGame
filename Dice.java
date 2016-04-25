/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

import java.util.Random;
public class Dice 
{
    private int rolledNumber; 
    private int playerScore = 0;
    
    
    public void rollNumber(int numberOfDie, int highestRollValue, int lowestRollValue)
    {
        highestRollValue = 6 * numberOfDie;
        lowestRollValue = 1 * numberOfDie;
        Random rand = new Random();
        int rolledNumber = lowestRollValue + (int)(Math.random() 
                            * ((highestRollValue - lowestRollValue) + 1));
        this.rolledNumber = rolledNumber;
        
    }
    
    public void compareOutcome(int playerGuess)
    {
        
        if (this.rolledNumber == playerGuess) 
        {
            System.out.println("You're Right!");
            System.out.println("Your Current Score is " + this.playerScore);
            System.out.println("Would You Like To Play Again?");
            System.out.println("Enter 'Yes' or 'No'. ");
            this.playerScore++; 
        }
        else 
        {
            System.out.println("I am Sorry Thats Wrong");
            System.out.println("Your Current Score is " + this.playerScore);
            System.out.println("Would You Like To Play Again?");
            System.out.println("Enter 'Yes' or 'No'. ");
        }
    }
    
    
}

