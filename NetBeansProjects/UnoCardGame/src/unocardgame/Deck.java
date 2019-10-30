/*
 *  Vanessa Velez-Santos
 * October 29,2019  

Class will deal out the cards to players and generate the deck

A UNO deck consists of 108 cards, of which there are 
76 Number cards,
24 Action cards 
8 Wild cards.
 */
package unocardgame;

public class Deck 
{
    //sizes for deck and number of cards available during the game
    //these will never change
    private final int DECK_SIZE     = 108,
                      NUM_CARDS     = 76,
                      ACTION_CARDS  = 24,
                      WILD_CARDS    = 8;
    private boolean clockwise;
    
    private Card[] deck = new Card[DECK_SIZE]; //full deck size for all cards
    
    //only one deck made everytime a game starts
    //shuffle and assign deck here
    public Deck()
    {
        clockwise = true; //game always starts in this direction
    }
    
    
}
