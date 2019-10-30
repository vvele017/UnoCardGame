/*
 *  Vanessa Velez-Santos
 * October 29,2019  

Keeps track of player info and number of cards in their hands
 */

package unocardgame;

import java.util.Scanner;

public class Player 
{
    private static int playerNumber = 1;
    private String name;
    private final int HAND_SIZE = 7; //max amount of cards a player can have on hand
    private Card[] hand = new Card[HAND_SIZE]; 
    private Scanner input = new Scanner(System.in);
    
    public Player()
    {
       askName();
       playerNumber++; //Every time a player is made,  count one up
    }
    
    public void askName()
    { 
        System.out.println(" Player " + playerNumber + ", your name: ");
        name = input.nextLine();
        
    }
}
