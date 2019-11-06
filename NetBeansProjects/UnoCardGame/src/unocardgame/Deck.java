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

import java.util.ArrayList;

public class Deck 
{
    //sizes for deck and number of cards available during the game
    //these will never change
    private final int DECK_SIZE     = 108,
                      NUM_CARDS     = 76,
                      ACTION_CARDS  = 24,
                      WILD_CARDS    = 8;
    
    //possible symbols in the game
    private final String[] ACTION_SYMBOLS = {null,"🔁","⛔","+2"}; 
    
    //colors for cards
    private static final String RED      = "\u001B[31m",
                               GREEN    = "\u001B[32m",
                               YELLOW   = "\u001B[33m",
                               BLUE     = "\u001B[34m",
                               WILD     = "\u001B[37m";
    
    private boolean clockwise;
    private ArrayList<Card> deck, 
                            numberCards,
                            actionCards;
    private static final String[] CARD_COLORS = {RED,GREEN,YELLOW,BLUE};
    
    //only one deck made everytime a game starts
    //shuffle and assign deck here
    public Deck()
    {
        clockwise = true; //game always starts in this direction
        deck = new ArrayList<Card>(DECK_SIZE);//full deck size for all cards
        numberCards = new ArrayList<>(); //creates the number cards with colors
        actionCards = new ArrayList<>();
        createCards(numberCards,"number",NUM_CARDS);
        createCards(actionCards,"action",ACTION_CARDS);
    }
    
   /*
    Creates cards to put into a deck. 
    Used for making the number cards, action cards, and wildcards.
    They will be used later to be shuffled and put into the real deck
    */
   public void createCards(ArrayList<Card> deck, String cardType, int size)
   {
       
       Card c = new Card();
       int numberCount = 0, symbolCount = 0, 
           colorIndex = 0 , colorCount = 1, symbolIndex = 0; 
      /*for adding color cards using colors arraylist
       there will be 2 of every card unless it is zero
       8 cards of each number per color
                              Red    - 0
                              Green  - 1
                              Yellow - 2
                              Blue   - 3 
                              Wild   - 4*/
       
       for(int index = 0; index < size; index++)
       {
           if( cardType.equals("number") ) 
           {
                Card number = new Card(CARD_COLORS[colorIndex],numberCount);
                number.showCard(); //delete later just to see
                c = number;
           }
           else if( cardType.equals("action") )
           {
                ActionCard action = new ActionCard(ACTION_SYMBOLS[symbolIndex],
                                                    CARD_COLORS[colorIndex]);
                action.showCard(); //delete later just to see
                c = action;
           }
           
           symbolCount++;
           colorCount++;
           /*reset color count and change the color of the card
             after 8 cards of that number in ALL colors have been 
             added to the deck
           Example: There should be two 4s in every color*/
           
           //if the number is zero, there should only be one in ever color
           if(numberCount != 0 )
           {
              if(colorCount == 2)
              {
               colorCount = 0;
               colorIndex++; //change color from CARD_COLOR array 
              }
           }
           else if(numberCount == 0)
           {
              if(colorCount >= 1)
              {
                colorCount = 0;
                colorIndex++;
              }
           }
           
           
           //when all colored cards have been added for each number,
           // reset the color index, and go on to the next number
           if(colorIndex == 4)
           {
               colorIndex = 0;
               
               symbolCount = 0;
               symbolIndex++;
               
               numberCount++;
               System.out.println("");
           }
           
           deck.add(c);
       }
       
       
   }
   
   
    
}
