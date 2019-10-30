/*
 *  Vanessa Velez-Santos
 * October 29,2019  

Keeps track of player info and number of cards in their hands
 */
package unocardgame;

public class Player 
{
    private int playerNumber;
    private final int HAND_SIZE = 7; //max amount of cards a player can have on hand
    private Card[] hand = new Card[HAND_SIZE]; 
}
